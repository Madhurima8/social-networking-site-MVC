// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:9
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:20
  class ReverseAuthenticatedUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def logout: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
  }

  // @LINE:24
  class ReverseProfilePageController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def listProfiles: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "profile")
    }
  
  }

  // @LINE:12
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def showLoginForm: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:13
    def processLoginAttempt: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "doLogin")
    }
  
    // @LINE:16
    def showRegistrationForm: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:17
    def processUserRegistration: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "doRegister")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:25
  class ReverseSharePictureController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def upload: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "sharePicture")
    }
  
    // @LINE:31
    def showPicDetails(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "seeMore" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:29
    def sortBy: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "sortBy/")
    }
  
    // @LINE:25
    def sharePicture: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sharePicture")
    }
  
    // @LINE:28
    def handleComment(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "commentOnPicture/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:27
    def handleLikes(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "likePicture/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:21
  class ReverseLandingPageController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def showLandingPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "landingPage")
    }
  
  }


}
