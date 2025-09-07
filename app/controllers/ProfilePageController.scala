package controllers

import models.ProfileDetailsDao
import play.api.mvc.*

import javax.inject.*

@Singleton
class ProfilePageController @Inject()(cc: ControllerComponents, authenticatedUserAction: AuthenticatedUserAction) extends AbstractController(cc) {

  def listProfiles: Action[AnyContent] = authenticatedUserAction {
    implicit request: Request[AnyContent] =>

    val detail = ProfileDetailsDao.findAll
    Ok(views.html.profile(detail))
  }
}
