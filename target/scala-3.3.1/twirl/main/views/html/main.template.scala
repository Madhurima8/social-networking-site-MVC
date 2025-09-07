
package views.html

import _root_.play.twirl.api.TwirlFeatureImports.*
import _root_.play.twirl.api.TwirlHelperImports.*
import scala.language.adhocExtensions
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Session,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String, session: Session)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.50*/("""


"""),format.raw/*10.1*/("""<!DOCTYPE html>
<html lang="en">

<head>
    <title>"""),_display_(/*14.13*/title),format.raw/*14.18*/("""</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" media="screen" href='"""),_display_(/*16.50*/routes/*16.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*16.97*/("""'>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</head>

<body>

        <!------ Include the above in your HEAD tag ---------->

    <div class="container-fluid">
            <!-- Second navbar for categories -->
        <nav class="navbar navbar-default">
            <div class="container">
                    <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href=""""),_display_(/*38.52*/routes/*38.58*/.HomeController.index()),format.raw/*38.81*/("""">Home</a>
                </div>

                    <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right">
                    """),_display_(if(session.get(models.Global.SESSION_USERNAME_KEY).isEmpty)/*44.81*/ {_display_(Seq[Any](format.raw/*44.83*/("""
                        """),format.raw/*45.25*/("""<li><a href=""""),_display_(/*45.39*/routes/*45.45*/.UserController.showLoginForm),format.raw/*45.74*/("""">Login</a></li>
                        <li><a href=""""),_display_(/*46.39*/routes/*46.45*/.UserController.showRegistrationForm),format.raw/*46.81*/("""">Register</a></li>
                    """)))}else/*47.28*/{_display_(Seq[Any](format.raw/*47.29*/("""
                        """),format.raw/*48.25*/("""<li><a href=""""),_display_(/*48.39*/routes/*48.45*/.SharePictureController.sharePicture),format.raw/*48.81*/("""">Share picture</a></li>
                        <li><a href=""""),_display_(/*49.39*/routes/*49.45*/.ProfilePageController.listProfiles),format.raw/*49.80*/("""">Profile</a></li>
                        <li><a href=""""),_display_(/*50.39*/routes/*50.45*/.LandingPageController.showLandingPage()),format.raw/*50.85*/("""">Back to landing page</a></li>
                        <li><a href=""""),_display_(/*51.39*/routes/*51.45*/.AuthenticatedUserController.logout),format.raw/*51.80*/("""">Logout</a></li>
                    """)))}),format.raw/*52.22*/("""
                    """),format.raw/*53.21*/("""</ul>

                </div><!-- /.navbar-collapse -->
            </div><!-- /.container -->
        </nav><!-- /.navbar -->

    </div><!-- /.container-fluid -->
    """),_display_(/*60.6*/content),format.raw/*60.13*/("""
"""),format.raw/*61.1*/("""</body>

</html>"""))
      }
    }
  }

  def render(title:String,session:Session,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,session)(content)

  def f:((String,Session) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,session) => (content) => apply(title,session)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/main.scala.html
                  HASH: 32eb7084ac7aef342aa49beb4de50648fcf4419a
                  MATRIX: 1038->266|1181->314|1214->320|1298->377|1324->382|1486->517|1501->523|1563->564|2763->1737|2778->1743|2822->1766|3199->2116|3239->2118|3293->2144|3334->2158|3349->2164|3399->2193|3482->2249|3497->2255|3554->2291|3619->2339|3658->2340|3712->2366|3753->2380|3768->2386|3825->2422|3916->2486|3931->2492|3987->2527|4072->2585|4087->2591|4148->2631|4246->2702|4261->2708|4317->2743|4388->2783|4438->2805|4641->2982|4669->2989|4698->2991
                  LINES: 27->7|32->7|35->10|39->14|39->14|41->16|41->16|41->16|63->38|63->38|63->38|69->44|69->44|70->45|70->45|70->45|70->45|71->46|71->46|71->46|72->47|72->47|73->48|73->48|73->48|73->48|74->49|74->49|74->49|75->50|75->50|75->50|76->51|76->51|76->51|77->52|78->53|85->60|85->60|86->61
                  -- GENERATED --
              */
          