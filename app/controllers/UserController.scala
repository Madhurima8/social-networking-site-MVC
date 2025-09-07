package controllers

import javax.inject.Inject
import models.{Global, User, UserDao}
import play.api.data._
import play.api.data.Forms._
import play.api.data.format.Formats._
import play.api.mvc._

class UserController @Inject()(
    cc: MessagesControllerComponents,
    userDao: UserDao
) extends MessagesAbstractController(cc) {

    private val logger = play.api.Logger(this.getClass)

    val form: Form[User] = Form (
        mapping(
            "username" -> nonEmptyText
                .verifying("Too few characters",  s => lengthIsGreaterThanNCharacters(s, 2))
                .verifying("Too many characters", s => lengthIsLessThanNCharacters(s, 20)),
            "password" -> nonEmptyText
                .verifying("Too few characters",  s => lengthIsGreaterThanNCharacters(s, 2))
                .verifying("Too many characters", s => lengthIsLessThanNCharacters(s, 30)),
        )(User.apply)(User.reverseApply)
    )

    private val formSubmitUrl = routes.UserController.processLoginAttempt

    def showLoginForm: Action[AnyContent] = Action {
        implicit request: MessagesRequest[AnyContent] =>
        Ok(views.html.userLogin(form, formSubmitUrl))
    }


    def processLoginAttempt: Action[AnyContent] = Action {
        implicit request: MessagesRequest[AnyContent] =>
        val errorFunction = { (formWithErrors: Form[User]) =>
            // form validation/binding failed...
            BadRequest(views.html.userLogin(formWithErrors, formSubmitUrl))
        }
        val successFunction = { (user: User) =>
            // form validation/binding succeeded ...
            val foundUser: Boolean = userDao.lookupUser(user)
            if foundUser then
                Redirect(routes.LandingPageController.showLandingPage())
                    .flashing("INFO" -> "You are logged in.")
                    .withSession(Global.SESSION_USERNAME_KEY -> user.username)
            else
                Redirect(routes.UserController.showLoginForm)
                    .flashing("ERROR" -> "Invalid username/password.")
        }
        val formValidationResult: Form[User] = form.bindFromRequest()
        formValidationResult.fold(
            errorFunction,
            successFunction
        )
    }

    val registrationForm: Form[User] = Form(
        mapping(
            "username" -> nonEmptyText
              .verifying("Too few characters", s => lengthIsGreaterThanNCharacters(s, 2))
              .verifying("Too many characters", s => lengthIsLessThanNCharacters(s, 20)),
            "password" -> nonEmptyText
              .verifying("Too few characters", s => lengthIsGreaterThanNCharacters(s, 2))
              .verifying("Too many characters", s => lengthIsLessThanNCharacters(s, 30)),
        )(User.apply)(User.reverseApply)
    )

    private val regFormSubmitUrl = routes.UserController.processUserRegistration

    def showRegistrationForm: Action[AnyContent] = Action {
        implicit request: MessagesRequest[AnyContent] =>
            Ok(views.html.userRegister(registrationForm, regFormSubmitUrl))
    }

    var users: Seq[User] = Seq.empty
    def processUserRegistration: Action[AnyContent] = Action {
        implicit request: MessagesRequest[AnyContent] =>
            val errorFunction = { (formWithErrors: Form[User]) =>
                // form validation/binding failed...
                BadRequest(views.html.userLogin(formWithErrors, regFormSubmitUrl))
            }
            val successFunction = { (user: User) =>
                this.userDao.addUser(user)
                    Redirect(routes.UserController.showLoginForm)
                      .flashing("INFO" -> "Your registration is successful. Please login with your username and password")

            }
            val formValidationResult: Form[User] = registrationForm.bindFromRequest()
            formValidationResult.fold(
                errorFunction,
                successFunction
            )
    }


    private def lengthIsGreaterThanNCharacters(s: String, n: Int): Boolean =
        if s.length > n then true else false

    private def lengthIsLessThanNCharacters(s: String, n: Int): Boolean =
        if s.length < n then true else false

}
