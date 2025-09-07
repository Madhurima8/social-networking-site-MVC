
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

object pictureDetails extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[SharePicture,Session,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(singlePic: SharePicture)(implicit session: Session, request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import views.html.helper.CSRF
/*4.2*/import play.api.data.Forms._
/*5.2*/import views.html.helper._


Seq[Any](format.raw/*1.106*/("""
"""),format.raw/*3.1*/("""    """),format.raw/*3.52*/("""
"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/main("Welcome to Play", session)/*7.34*/ {_display_(Seq[Any](format.raw/*7.36*/("""
    """),format.raw/*8.5*/("""<head>

    </head>

    <body>
        <div class="jumbotron">
            <div class="d-flex flex-row">
"""),format.raw/*15.41*/("""
                """),format.raw/*16.17*/("""<div class="p-2">
                    <h2>Added on : """),_display_(/*17.37*/singlePic/*17.46*/.date),format.raw/*17.51*/(""" """),format.raw/*17.52*/("""by """),_display_(/*17.56*/singlePic/*17.65*/.addedBy),format.raw/*17.73*/(""" """),format.raw/*17.74*/("""</h2><br>
                    <img src=""""),_display_(/*18.32*/singlePic/*18.41*/.image),format.raw/*18.47*/("""" class="fit-container rounded float-left" alt="Image">

                    <form action=""""),_display_(/*20.36*/routes/*20.42*/.SharePictureController.handleLikes(singlePic.id)),format.raw/*20.91*/("""" method="post" >
                        """),_display_(/*21.26*/CSRF/*21.30*/.formField),format.raw/*21.40*/("""
                       """),format.raw/*22.24*/("""<button type="submit">Likes</button>
                        : """),_display_(/*23.28*/singlePic/*23.37*/.likes),format.raw/*23.43*/("""
                    """),format.raw/*24.21*/("""</form>

                </div>

                <div class="p-2" >

                    <h2>Description :</h2>
                    <h3>"""),_display_(/*31.26*/singlePic/*31.35*/.description),format.raw/*31.47*/("""</h3><br>
                    <h2>Comments:</h2>
                    """),_display_(if(singlePic.comments != null)/*33.52*/ {_display_(Seq[Any](format.raw/*33.54*/("""
                        """),_display_(/*34.26*/for(comment <- singlePic.comments) yield /*34.60*/ {_display_(Seq[Any](format.raw/*34.62*/("""
                            """),format.raw/*35.29*/("""<div class="comment">
                                <h3>"""),_display_(/*36.38*/comment/*36.45*/.username),format.raw/*36.54*/(""": """),_display_(/*36.57*/comment/*36.64*/.lines),format.raw/*36.70*/("""</h3>
                            </div>
                        """)))}),format.raw/*38.26*/("""
                """)))} else {null} ),format.raw/*39.18*/("""
                    """),format.raw/*40.21*/("""<form action=""""),_display_(/*40.36*/routes/*40.42*/.SharePictureController.handleComment(singlePic.id)),format.raw/*40.93*/("""" method="post">
                        """),_display_(/*41.26*/CSRF/*41.30*/.formField),format.raw/*41.40*/("""
                        """),format.raw/*42.25*/("""<div class="input-group">
                            <span class="input-group-text">Add a Comment</span>
                            <textarea id="comment" name="comment" class="form-control" aria-label="With textarea"></textarea>
                        </div>
                        <button type="submit">
                        Upload comment
                        </button>
                    </form>
                </div>
            </div>
            """)))}),format.raw/*52.14*/("""
        """),format.raw/*53.9*/("""</div>
    </body>
"""))
      }
    }
  }

  def render(singlePic:SharePicture,session:Session,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(singlePic)(session,request)

  def f:((SharePicture) => (Session,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (singlePic) => (session,request) => apply(singlePic)(session,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/pictureDetails.scala.html
                  HASH: ffa79c03602912da1a9c613c0e97e4609ec1960d
                  MATRIX: 804->1|953->107|990->190|1026->220|1083->105|1110->137|1141->188|1168->247|1195->249|1235->281|1274->283|1305->288|1439->434|1484->451|1565->505|1583->514|1609->519|1638->520|1669->524|1687->533|1716->541|1745->542|1813->583|1831->592|1858->598|1977->690|1992->696|2062->745|2132->788|2145->792|2176->802|2228->826|2319->890|2337->899|2364->905|2413->926|2577->1063|2595->1072|2628->1084|2755->1184|2795->1186|2848->1212|2898->1246|2938->1248|2995->1277|3081->1336|3097->1343|3127->1352|3157->1355|3173->1362|3200->1368|3297->1434|3359->1452|3408->1473|3450->1488|3465->1494|3537->1545|3606->1587|3619->1591|3650->1601|3703->1626|4200->2092|4236->2101
                  LINES: 22->1|25->2|26->4|27->5|30->1|31->3|31->3|32->6|33->7|33->7|33->7|34->8|41->15|42->16|43->17|43->17|43->17|43->17|43->17|43->17|43->17|43->17|44->18|44->18|44->18|46->20|46->20|46->20|47->21|47->21|47->21|48->22|49->23|49->23|49->23|50->24|57->31|57->31|57->31|59->33|59->33|60->34|60->34|60->34|61->35|62->36|62->36|62->36|62->36|62->36|62->36|64->38|65->39|66->40|66->40|66->40|66->40|67->41|67->41|67->41|68->42|78->52|79->53
                  -- GENERATED --
              */
          