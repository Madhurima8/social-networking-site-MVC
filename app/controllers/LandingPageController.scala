package controllers

import models.SharePictureDao

import javax.inject.*
import play.api.mvc.*

@Singleton
class LandingPageController @Inject()(
    cc: ControllerComponents,
    authenticatedUserAction: AuthenticatedUserAction
) extends AbstractController(cc) {

    // this is where the user comes immediately after logging in.
    // notice that this uses `authenticatedUserAction`.
    def showLandingPage(): Action[AnyContent] = authenticatedUserAction {
        implicit request: Request[AnyContent] =>
        val detail=SharePictureDao.findPictureDetails
        Ok(views.html.loginLandingPage(detail,0))
    }
}
