
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

object submitPicture extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Session,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit session: Session, request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import views.html.helper.CSRF


Seq[Any](format.raw/*1.83*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Share Picture", session)/*4.32*/ {_display_(Seq[Any](format.raw/*4.34*/("""
  """),format.raw/*5.3*/("""<style>
          .btn-original"""),format.raw/*6.24*/("""{"""),format.raw/*6.25*/("""
            """),format.raw/*7.13*/("""text-align: left;
          """),format.raw/*8.11*/("""}"""),format.raw/*8.12*/("""
          """),format.raw/*9.11*/(""".btn-right"""),format.raw/*9.21*/("""{"""),format.raw/*9.22*/("""
            """),format.raw/*10.13*/("""text-align: right;
          """),format.raw/*11.11*/("""}"""),format.raw/*11.12*/("""
          """),format.raw/*12.11*/(""".form-group """),format.raw/*12.23*/("""{"""),format.raw/*12.24*/("""
              """),format.raw/*13.15*/("""display: flex;
              margin-bottom: 10px;
          """),format.raw/*15.11*/("""}"""),format.raw/*15.12*/("""

          """),format.raw/*17.11*/("""label """),format.raw/*17.17*/("""{"""),format.raw/*17.18*/("""
              """),format.raw/*18.15*/("""display: inline-block;
              width: 150px;
              text-align: right;
              margin-right: 10px;
          """),format.raw/*22.11*/("""}"""),format.raw/*22.12*/("""

          """),format.raw/*24.11*/("""input[type="file"] """),format.raw/*24.30*/("""{"""),format.raw/*24.31*/("""
              """),format.raw/*25.15*/("""display: inline-block;
          """),format.raw/*26.11*/("""}"""),format.raw/*26.12*/("""

          """),format.raw/*28.11*/("""textarea """),format.raw/*28.20*/("""{"""),format.raw/*28.21*/("""
              """),format.raw/*29.15*/("""width: 100%;
              height: 400px;
              resize: none;
          """),format.raw/*32.11*/("""}"""),format.raw/*32.12*/("""
          """),format.raw/*33.11*/(""".form-center """),format.raw/*33.24*/("""{"""),format.raw/*33.25*/("""
              """),format.raw/*34.15*/("""display:flex;
              justify-content: center;
          """),format.raw/*36.11*/("""}"""),format.raw/*36.12*/("""
  """),format.raw/*37.3*/("""</style>
  <div class="form-center">
      <form action=""""),_display_(/*39.22*/routes/*39.28*/.SharePictureController.upload),format.raw/*39.58*/("""" method="post" enctype="multipart/form-data">
          <div class="form-group">
          <label for="image">Select Picture:</label>
              """),_display_(/*42.16*/CSRF/*42.20*/.formField),format.raw/*42.30*/("""
              """),format.raw/*43.15*/("""<input type="file" id="image" name="picture" style="display: inline-block;"><br>
          </div>

          <div class="form-group">
            <label for="desc">Description:</label>
            <textarea id="desc" name="desc" style="height: 400px; width: 600px;"></textarea>
          </div>
          <div>
              <button type="submit">Upload Picture</button>
              <a href=""""),_display_(/*52.25*/routes/*52.31*/.SharePictureController.sharePicture),format.raw/*52.67*/("""" class="btn btn-primary">Cancel</a>
          </div>
      </form>
  </div>
""")))}),format.raw/*56.2*/("""

"""))
      }
    }
  }

  def render(session:Session,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply()(session,request)

  def f:(() => (Session,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = () => (session,request) => apply()(session,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/submitPicture.scala.html
                  HASH: b0093d6c48797d96acdf4894d12259a72b9c875e
                  MATRIX: 790->1|916->84|975->82|1002->114|1029->116|1067->146|1106->148|1135->151|1193->182|1221->183|1261->196|1316->224|1344->225|1382->236|1419->246|1447->247|1488->260|1545->289|1574->290|1613->301|1653->313|1682->314|1725->329|1813->389|1842->390|1882->402|1916->408|1945->409|1988->424|2144->552|2173->553|2213->565|2260->584|2289->585|2332->600|2393->633|2422->634|2462->646|2499->655|2528->656|2571->671|2679->751|2708->752|2747->763|2788->776|2817->777|2860->792|2951->855|2980->856|3010->859|3095->917|3110->923|3161->953|3338->1103|3351->1107|3382->1117|3425->1132|3847->1527|3862->1533|3919->1569|4027->1647
                  LINES: 22->1|25->2|28->1|29->3|30->4|30->4|30->4|31->5|32->6|32->6|33->7|34->8|34->8|35->9|35->9|35->9|36->10|37->11|37->11|38->12|38->12|38->12|39->13|41->15|41->15|43->17|43->17|43->17|44->18|48->22|48->22|50->24|50->24|50->24|51->25|52->26|52->26|54->28|54->28|54->28|55->29|58->32|58->32|59->33|59->33|59->33|60->34|62->36|62->36|63->37|65->39|65->39|65->39|68->42|68->42|68->42|69->43|78->52|78->52|78->52|82->56
                  -- GENERATED --
              */
          