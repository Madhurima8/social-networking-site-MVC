// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {

  // @LINE:9
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:20
  class ReverseAuthenticatedUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthenticatedUserController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
  }

  // @LINE:24
  class ReverseProfilePageController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def listProfiles: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProfilePageController.listProfiles",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def showLoginForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.showLoginForm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:13
    def processLoginAttempt: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.processLoginAttempt",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "doLogin"})
        }
      """
    )
  
    // @LINE:16
    def showRegistrationForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.showRegistrationForm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:17
    def processUserRegistration: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.processUserRegistration",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "doRegister"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:25
  class ReverseSharePictureController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def upload: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SharePictureController.upload",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sharePicture"})
        }
      """
    )
  
    // @LINE:31
    def showPicDetails: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SharePictureController.showPicDetails",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "seeMore" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:29
    def sortBy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SharePictureController.sortBy",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sortBy/"})
        }
      """
    )
  
    // @LINE:25
    def sharePicture: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SharePictureController.sharePicture",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sharePicture"})
        }
      """
    )
  
    // @LINE:28
    def handleComment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SharePictureController.handleComment",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "commentOnPicture/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:27
    def handleLikes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SharePictureController.handleLikes",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "likePicture/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseLandingPageController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def showLandingPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LandingPageController.showLandingPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "landingPage"})
        }
      """
    )
  
  }


}
