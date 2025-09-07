package controllers

import models.SharePictureDao
import models.SharePicture
import models.Comment
import models.SharePictureDao.detail

import java.io.File
import javax.inject.*
import play.api.mvc.*

import java.nio.file.{Files, Paths, StandardCopyOption}
import play.api.libs.Files.TemporaryFile

import java.time.LocalDate
import java.time.format.DateTimeFormatter

import play.api.mvc._
import play.api.libs.Files.TemporaryFile
import play.filters.csrf.CSRF.Token
import play.filters.csrf.CSRFAddToken
//Added for the comment form
import play.api.data.Form
import play.api.data.Forms._
import play.Application

@Singleton
class SharePictureController @Inject()(cc: ControllerComponents, authenticatedUserAction: AuthenticatedUserAction,addToken: CSRFAddToken) extends AbstractController(cc) {
  var id=0;

  def sharePicture: Action[AnyContent] =  authenticatedUserAction {
    implicit request: Request[AnyContent] =>

      //var detail = SharePictureDao.findPictureDetails
      Ok(views.html.submitPicture())
  }

  def sortBy: Action[AnyContent] = Action { implicit request =>
    val sortById = request.body.asFormUrlEncoded.flatMap(_.get("sorting")).flatMap(_.headOption).getOrElse("0").toInt

    val result = sortById match {
      //When no sort by option is selected
      case 0 =>
        var detail = SharePictureDao.findPictureDetails
        Ok(views.html.loginLandingPage(detail,0))
      //When sort by date asc is selected
      case 1 =>
        var sortByDtAscDetail = SharePictureDao.findPictureDetails.sortBy(_.date)
        Ok(views.html.loginLandingPage(sortByDtAscDetail,sortById))
      //When sort by date desc is selected
      case 2 =>
        var sortByDtDescDetail = SharePictureDao.findPictureDetails.sortBy(_.date).reverse
        Ok(views.html.loginLandingPage(sortByDtDescDetail,sortById))
      //When sort by no. of likes asc is selected
      case 3 =>
        var sortByLikeAscDetail = SharePictureDao.findPictureDetails.sortBy(_.likes)
        Ok(views.html.loginLandingPage(sortByLikeAscDetail,sortById))
      //When sort by no. of likes desc is selected
      case 4 =>
        var sortByLikeDescDetail = SharePictureDao.findPictureDetails.sortBy(_.likes).reverse
        Ok(views.html.loginLandingPage(sortByLikeDescDetail,sortById))
      case _ => BadRequest("Invalid selection")
    }

    result
  }

  def upload: Action[MultipartFormData[TemporaryFile]] = authenticatedUserAction(parse.multipartFormData) {
    implicit request =>
      request.body
        .file("picture")
        .map { picture =>
          print(picture)
          val filename = Paths.get(picture.filename).getFileName
          print(filename)
          val imagePath = s"/assets/images/$filename"
          val desc: String = request.body.dataParts.getOrElse("desc", Seq.empty).headOption.getOrElse("")
          val addedBy = request.session.get(models.Global.SESSION_USERNAME_KEY).fold("No user")(identity)
          val currentDate = LocalDate.now()
          val date = currentDate.format(DateTimeFormatter.ISO_LOCAL_DATE)
          val newSharePicture = SharePicture(getId, imagePath, desc, addedBy, date, 0, Array[Comment](), Array[String]())
          SharePictureDao.detail = detail :+ newSharePicture
          val destPath = Paths.get(s"public/images/$filename")
          //The picture is getting saved in the temp file in another location in. That's why it is moved to the destination path
          Files.move(picture.ref.path, destPath, StandardCopyOption.REPLACE_EXISTING)
          picture.ref.delete()
          Redirect(routes.LandingPageController.showLandingPage()).flashing("success" -> "File uploaded!")
        }
        .getOrElse {
          Redirect(routes.HomeController.index()).flashing("error" -> "Missing file")
        }
  }


  def showPicDetails(id:Long): Action[AnyContent] = authenticatedUserAction {
    implicit request: Request[AnyContent] =>
      val singlePic = SharePictureDao.findEachPicDetails(id)
      Ok(views.html.pictureDetails(singlePic))
  }


  def handleLikes(id:Long): Action[AnyContent] =  authenticatedUserAction {
    implicit request: Request[AnyContent] =>
      val username = request.session.get(models.Global.SESSION_USERNAME_KEY).fold("No user")(identity)
      val updatedDetail = SharePictureDao.likePicture(id,username)
          Ok(views.html.pictureDetails(updatedDetail))

  }

  def handleComment(id:Long): Action[AnyContent] = authenticatedUserAction {
    implicit request =>
      val username = request.session.get(models.Global.SESSION_USERNAME_KEY).fold("No user")(identity)
      val lines : String= request.body.asFormUrlEncoded.flatMap(_.get("comment").flatMap(_.headOption)).getOrElse("")
      val comment = new Comment(username, lines)
      val updatedDetail = SharePictureDao.commentPicture(id, comment)
      Ok(views.html.pictureDetails(updatedDetail))
  }

  def getId:Long = {
    id=id+1
    return id
  }

}

