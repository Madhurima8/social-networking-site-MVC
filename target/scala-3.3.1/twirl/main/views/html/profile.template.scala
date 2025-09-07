
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

object profile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[Profile],Session,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(detail: List[Profile])(implicit session: Session):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Profile Details", session)/*3.34*/ {_display_(Seq[Any](format.raw/*3.36*/("""
  """),format.raw/*4.3*/("""<div class="wrapper fadeInUp">
    """),_display_(if(session.get(models.Global.SESSION_USERNAME_KEY))/*5.57*/ {_display_(Seq[Any](format.raw/*5.59*/("""
  """),format.raw/*6.3*/("""<table>
  <tr>
    <td>Name</td>
    <td>Country</td>
  </tr>
      """),_display_(/*11.8*/for(profile <- detail) yield /*11.30*/ {_display_(Seq[Any](format.raw/*11.32*/("""
        """),format.raw/*12.9*/("""<tr>
          <td>"""),_display_(/*13.16*/profile/*13.23*/.name),format.raw/*13.28*/("""</td>
          <td>"""),_display_(/*14.16*/profile/*14.23*/.country),format.raw/*14.31*/("""</td>
        </tr>
      """)))}),format.raw/*16.8*/("""
  """),format.raw/*17.3*/("""</table>
    """)))} else {null} ),format.raw/*18.6*/("""
  """),format.raw/*19.3*/("""</div>
""")))}),format.raw/*20.2*/("""
"""))
      }
    }
  }

  def render(detail:List[Profile],session:Session): play.twirl.api.HtmlFormat.Appendable = apply(detail)(session)

  def f:((List[Profile]) => (Session) => play.twirl.api.HtmlFormat.Appendable) = (detail) => (session) => apply(detail)(session)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/profile.scala.html
                  HASH: d61f0f73eb66292b39c6276e245c91c7d1321646
                  MATRIX: 784->1|928->52|955->54|995->86|1034->88|1063->91|1176->178|1215->180|1244->183|1339->252|1377->274|1417->276|1453->285|1500->305|1516->312|1542->317|1590->338|1606->345|1635->353|1692->380|1722->383|1779->397|1809->400|1847->408
                  LINES: 22->1|27->2|28->3|28->3|28->3|29->4|30->5|30->5|31->6|36->11|36->11|36->11|37->12|38->13|38->13|38->13|39->14|39->14|39->14|41->16|42->17|43->18|44->19|45->20
                  -- GENERATED --
              */
          