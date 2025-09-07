
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

object userLogin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[models.User],Call,Session,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[models.User], postUrl: Call)(implicit session: Session, request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("User Login", session)/*2.29*/ {_display_(Seq[Any](format.raw/*2.31*/("""
    """),_display_(/*3.6*/defining(play.core.PlayVersion.current)/*3.45*/ { version =>_display_(Seq[Any](format.raw/*3.58*/("""
    """),format.raw/*4.5*/("""<div class="wrapper fadeInDown">

    <div id="user-login-form">

        """),_display_(/*8.10*/request/*8.17*/.flash.data.map/*8.32*/{ case (name, value) =>_display_(Seq[Any](format.raw/*8.55*/("""
            """),format.raw/*9.13*/("""<div>"""),_display_(/*9.19*/name),format.raw/*9.23*/(""": """),_display_(/*9.26*/value),format.raw/*9.31*/("""</div>
        """)))}),format.raw/*10.10*/("""

        """),format.raw/*12.70*/("""
        """),_display_(if(form.hasGlobalErrors)/*13.34*/ {_display_(Seq[Any](format.raw/*13.36*/("""
            """),_display_(/*14.14*/form/*14.18*/.globalErrors.map/*14.35*/ { (error: FormError) =>_display_(Seq[Any](format.raw/*14.59*/("""
                """),format.raw/*15.17*/("""<div>
                    Error: """),_display_(/*16.29*/error/*16.34*/.key),format.raw/*16.38*/(""": """),_display_(/*16.41*/error/*16.46*/.message),format.raw/*16.54*/("""
                """),format.raw/*17.17*/("""</div>
            """)))}),format.raw/*18.14*/("""
        """)))} else {null} ),format.raw/*19.10*/("""

        """),_display_(/*21.10*/helper/*21.16*/.form(postUrl, Symbol("id") -> "user-login-form")/*21.65*/ {_display_(Seq[Any](format.raw/*21.67*/("""

        """),_display_(/*23.10*/helper/*23.16*/.CSRF.formField),format.raw/*23.31*/("""

        """),_display_(/*25.10*/helper/*25.16*/.inputText(
            form("username"),
            Symbol("label") -> "Username",
            Symbol("placeholder") -> "username",
            Symbol("id") -> "username",
            Symbol("size") -> 60
        )),format.raw/*31.10*/("""

        """),_display_(/*33.10*/helper/*33.16*/.inputPassword(
            form("password"),
            Symbol("label") -> "password",
            Symbol("placeholder") -> "password",
            Symbol("id") -> "password",
            Symbol("size") -> 60
        )),format.raw/*39.10*/("""
            """),format.raw/*40.13*/("""<input type="submit" value="Log In">
            """)))}),format.raw/*41.14*/("""
    """),format.raw/*42.5*/("""</div>
</div>
    """)))}),format.raw/*44.6*/("""
""")))}),format.raw/*45.2*/("""
"""))
      }
    }
  }

  def render(form:Form[models.User],postUrl:Call,session:Session,request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(form,postUrl)(session,request)

  def f:((Form[models.User],Call) => (Session,MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (form,postUrl) => (session,request) => apply(form,postUrl)(session,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/userLogin.scala.html
                  HASH: 08eafdfcfcb2db69036fe5823d1b10f4ba451000
                  MATRIX: 817->1|1010->102|1045->129|1084->131|1115->137|1162->176|1212->189|1243->194|1344->269|1359->276|1382->291|1442->314|1482->327|1514->333|1538->337|1567->340|1592->345|1639->361|1677->432|1738->466|1778->468|1819->482|1832->486|1858->503|1920->527|1965->544|2026->578|2040->583|2065->587|2095->590|2109->595|2138->603|2183->620|2234->640|2288->650|2326->661|2341->667|2399->716|2439->718|2477->729|2492->735|2528->750|2566->761|2581->767|2818->983|2856->994|2871->1000|3112->1220|3153->1233|3234->1283|3266->1288|3315->1307|3347->1309
                  LINES: 22->1|27->2|27->2|27->2|28->3|28->3|28->3|29->4|33->8|33->8|33->8|33->8|34->9|34->9|34->9|34->9|34->9|35->10|37->12|38->13|38->13|39->14|39->14|39->14|39->14|40->15|41->16|41->16|41->16|41->16|41->16|41->16|42->17|43->18|44->19|46->21|46->21|46->21|46->21|48->23|48->23|48->23|50->25|50->25|56->31|58->33|58->33|64->39|65->40|66->41|67->42|69->44|70->45
                  -- GENERATED --
              */
          