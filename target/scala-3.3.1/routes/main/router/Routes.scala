// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_6: controllers.HomeController,
  // @LINE:9
  Assets_5: controllers.Assets,
  // @LINE:12
  UserController_4: controllers.UserController,
  // @LINE:20
  AuthenticatedUserController_0: controllers.AuthenticatedUserController,
  // @LINE:21
  LandingPageController_2: controllers.LandingPageController,
  // @LINE:24
  ProfilePageController_3: controllers.ProfilePageController,
  // @LINE:25
  SharePictureController_1: controllers.SharePictureController,
  val prefix: String
) extends GeneratedRouter {

  @javax.inject.Inject()
  def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_6: controllers.HomeController,
    // @LINE:9
    Assets_5: controllers.Assets,
    // @LINE:12
    UserController_4: controllers.UserController,
    // @LINE:20
    AuthenticatedUserController_0: controllers.AuthenticatedUserController,
    // @LINE:21
    LandingPageController_2: controllers.LandingPageController,
    // @LINE:24
    ProfilePageController_3: controllers.ProfilePageController,
    // @LINE:25
    SharePictureController_1: controllers.SharePictureController
  ) = this(errorHandler, HomeController_6, Assets_5, UserController_4, AuthenticatedUserController_0, LandingPageController_2, ProfilePageController_3, SharePictureController_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_6, Assets_5, UserController_4, AuthenticatedUserController_0, LandingPageController_2, ProfilePageController_3, SharePictureController_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UserController.showLoginForm"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """doLogin""", """controllers.UserController.processLoginAttempt"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.UserController.showRegistrationForm"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """doRegister""", """controllers.UserController.processUserRegistration"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.AuthenticatedUserController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """landingPage""", """controllers.LandingPageController.showLandingPage()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.ProfilePageController.listProfiles"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sharePicture""", """controllers.SharePictureController.sharePicture"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sharePicture""", """controllers.SharePictureController.upload"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """likePicture/""" + "$" + """id<[^/]+>""", """controllers.SharePictureController.handleLikes(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """commentOnPicture/""" + "$" + """id<[^/]+>""", """controllers.SharePictureController.handleComment(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sortBy/""", """controllers.SharePictureController.sortBy"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """seeMore""", """controllers.SharePictureController.showPicDetails(id:Long)"""),
    Nil
  ).foldLeft(Seq.empty[(String, String, String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String, String, String)]
    case l => s ++ l.asInstanceOf[List[(String, String, String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_6.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_UserController_showLoginForm2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UserController_showLoginForm2_invoker = createInvoker(
    UserController_4.showLoginForm,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "showLoginForm",
      Nil,
      "GET",
      this.prefix + """login""",
      """ user/admin login""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_UserController_processLoginAttempt3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("doLogin")))
  )
  private[this] lazy val controllers_UserController_processLoginAttempt3_invoker = createInvoker(
    UserController_4.processLoginAttempt,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "processLoginAttempt",
      Nil,
      "POST",
      this.prefix + """doLogin""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_UserController_showRegistrationForm4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_UserController_showRegistrationForm4_invoker = createInvoker(
    UserController_4.showRegistrationForm,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "showRegistrationForm",
      Nil,
      "GET",
      this.prefix + """register""",
      """user registration""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_UserController_processUserRegistration5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("doRegister")))
  )
  private[this] lazy val controllers_UserController_processUserRegistration5_invoker = createInvoker(
    UserController_4.processUserRegistration,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "processUserRegistration",
      Nil,
      "POST",
      this.prefix + """doRegister""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_AuthenticatedUserController_logout6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_AuthenticatedUserController_logout6_invoker = createInvoker(
    AuthenticatedUserController_0.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthenticatedUserController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """ pages for authenticated users""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_LandingPageController_showLandingPage7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("landingPage")))
  )
  private[this] lazy val controllers_LandingPageController_showLandingPage7_invoker = createInvoker(
    LandingPageController_2.showLandingPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LandingPageController",
      "showLandingPage",
      Nil,
      "GET",
      this.prefix + """landingPage""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ProfilePageController_listProfiles8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_ProfilePageController_listProfiles8_invoker = createInvoker(
    ProfilePageController_3.listProfiles,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfilePageController",
      "listProfiles",
      Nil,
      "GET",
      this.prefix + """profile""",
      """ show contacts""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_SharePictureController_sharePicture9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sharePicture")))
  )
  private[this] lazy val controllers_SharePictureController_sharePicture9_invoker = createInvoker(
    SharePictureController_1.sharePicture,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SharePictureController",
      "sharePicture",
      Nil,
      "GET",
      this.prefix + """sharePicture""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_SharePictureController_upload10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sharePicture")))
  )
  private[this] lazy val controllers_SharePictureController_upload10_invoker = createInvoker(
    SharePictureController_1.upload,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SharePictureController",
      "upload",
      Nil,
      "POST",
      this.prefix + """sharePicture""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_SharePictureController_handleLikes11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("likePicture/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SharePictureController_handleLikes11_invoker = createInvoker(
    SharePictureController_1.handleLikes(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SharePictureController",
      "handleLikes",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """likePicture/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_SharePictureController_handleComment12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("commentOnPicture/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SharePictureController_handleComment12_invoker = createInvoker(
    SharePictureController_1.handleComment(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SharePictureController",
      "handleComment",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """commentOnPicture/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_SharePictureController_sortBy13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sortBy/")))
  )
  private[this] lazy val controllers_SharePictureController_sortBy13_invoker = createInvoker(
    SharePictureController_1.sortBy,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SharePictureController",
      "sortBy",
      Nil,
      "POST",
      this.prefix + """sortBy/""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_SharePictureController_showPicDetails14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("seeMore")))
  )
  private[this] lazy val controllers_SharePictureController_showPicDetails14_invoker = createInvoker(
    SharePictureController_1.showPicDetails(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SharePictureController",
      "showPicDetails",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """seeMore""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_6.index())
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_5.versioned(path, file))
      }
  
    // @LINE:12
    case controllers_UserController_showLoginForm2_route(params@_) =>
      call { 
        controllers_UserController_showLoginForm2_invoker.call(UserController_4.showLoginForm)
      }
  
    // @LINE:13
    case controllers_UserController_processLoginAttempt3_route(params@_) =>
      call { 
        controllers_UserController_processLoginAttempt3_invoker.call(UserController_4.processLoginAttempt)
      }
  
    // @LINE:16
    case controllers_UserController_showRegistrationForm4_route(params@_) =>
      call { 
        controllers_UserController_showRegistrationForm4_invoker.call(UserController_4.showRegistrationForm)
      }
  
    // @LINE:17
    case controllers_UserController_processUserRegistration5_route(params@_) =>
      call { 
        controllers_UserController_processUserRegistration5_invoker.call(UserController_4.processUserRegistration)
      }
  
    // @LINE:20
    case controllers_AuthenticatedUserController_logout6_route(params@_) =>
      call { 
        controllers_AuthenticatedUserController_logout6_invoker.call(AuthenticatedUserController_0.logout)
      }
  
    // @LINE:21
    case controllers_LandingPageController_showLandingPage7_route(params@_) =>
      call { 
        controllers_LandingPageController_showLandingPage7_invoker.call(LandingPageController_2.showLandingPage())
      }
  
    // @LINE:24
    case controllers_ProfilePageController_listProfiles8_route(params@_) =>
      call { 
        controllers_ProfilePageController_listProfiles8_invoker.call(ProfilePageController_3.listProfiles)
      }
  
    // @LINE:25
    case controllers_SharePictureController_sharePicture9_route(params@_) =>
      call { 
        controllers_SharePictureController_sharePicture9_invoker.call(SharePictureController_1.sharePicture)
      }
  
    // @LINE:26
    case controllers_SharePictureController_upload10_route(params@_) =>
      call { 
        controllers_SharePictureController_upload10_invoker.call(SharePictureController_1.upload)
      }
  
    // @LINE:27
    case controllers_SharePictureController_handleLikes11_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SharePictureController_handleLikes11_invoker.call(SharePictureController_1.handleLikes(id))
      }
  
    // @LINE:28
    case controllers_SharePictureController_handleComment12_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SharePictureController_handleComment12_invoker.call(SharePictureController_1.handleComment(id))
      }
  
    // @LINE:29
    case controllers_SharePictureController_sortBy13_route(params@_) =>
      call { 
        controllers_SharePictureController_sortBy13_invoker.call(SharePictureController_1.sortBy)
      }
  
    // @LINE:31
    case controllers_SharePictureController_showPicDetails14_route(params@_) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_SharePictureController_showPicDetails14_invoker.call(SharePictureController_1.showPicDetails(id))
      }
  }
}
