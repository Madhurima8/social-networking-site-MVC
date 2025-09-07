
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

object userRegister extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[models.User],Call,Session,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(registrationForm: Form[models.User], postUrl: Call)(implicit session: Session, request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("User Registration", session)/*2.36*/ {_display_(Seq[Any](format.raw/*2.38*/("""
    """),_display_(/*3.6*/defining(play.core.PlayVersion.current)/*3.45*/ { version =>_display_(Seq[Any](format.raw/*3.58*/("""
    """),format.raw/*4.5*/("""<div class="wrapper fadeInDown">

    <div id="user-login-form">

        """),_display_(/*8.10*/request/*8.17*/.flash.data.map/*8.32*/{ case (name, value) =>_display_(Seq[Any](format.raw/*8.55*/("""
            """),format.raw/*9.13*/("""<div>"""),_display_(/*9.19*/name),format.raw/*9.23*/(""": """),_display_(/*9.26*/value),format.raw/*9.31*/("""</div>
        """)))}),format.raw/*10.10*/("""

        """),format.raw/*12.70*/("""
        """),_display_(if(registrationForm.hasGlobalErrors)/*13.46*/ {_display_(Seq[Any](format.raw/*13.48*/("""
            """),_display_(/*14.14*/registrationForm/*14.30*/.globalErrors.map/*14.47*/ { (error: FormError) =>_display_(Seq[Any](format.raw/*14.71*/("""
                """),format.raw/*15.17*/("""<div>
                    Error: """),_display_(/*16.29*/error/*16.34*/.key),format.raw/*16.38*/(""": """),_display_(/*16.41*/error/*16.46*/.message),format.raw/*16.54*/("""
                """),format.raw/*17.17*/("""</div>
            """)))}),format.raw/*18.14*/("""
        """)))} else {null} ),format.raw/*19.10*/("""

        """),_display_(/*21.10*/helper/*21.16*/.form(postUrl, Symbol("id") -> "user-registration-form")/*21.72*/ {_display_(Seq[Any](format.raw/*21.74*/("""

        """),_display_(/*23.10*/helper/*23.16*/.CSRF.formField),format.raw/*23.31*/("""

        """),_display_(/*25.10*/helper/*25.16*/.inputText(
            registrationForm("username"),
            Symbol("label") -> "Username",
            Symbol("placeholder") -> "username",
            Symbol("id") -> "username",
            Symbol("size") -> 60
        )),format.raw/*31.10*/("""

        """),_display_(/*33.10*/helper/*33.16*/.inputPassword(
            registrationForm("password"),
            Symbol("label") -> "password",
            Symbol("placeholder") -> "password",
            Symbol("id") -> "password",
            Symbol("size") -> 60
        )),format.raw/*39.10*/("""

            """),format.raw/*41.13*/("""<input type="submit" value="Register">
            """)))}),format.raw/*42.14*/("""
    """),format.raw/*43.5*/("""</div>
</div>
    """)))}),format.raw/*45.6*/("""
""")))}),format.raw/*46.2*/("""
"""))
      }
    }
  }

  def render(registrationForm:Form[models.User],postUrl:Call,session:Session,request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(registrationForm,postUrl)(session,request)

  def f:((Form[models.User],Call) => (Session,MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (registrationForm,postUrl) => (session,request) => apply(registrationForm,postUrl)(session,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/userRegister.scala.html
                  HASH: 7f2b4162ec727a316f56a9cc0cfb6f7b2a9cb695
                  MATRIX: 820->1|1025->114|1067->148|1106->150|1137->156|1184->195|1234->208|1265->213|1366->288|1381->295|1404->310|1464->333|1504->346|1536->352|1560->356|1589->359|1614->364|1661->380|1699->451|1772->497|1812->499|1853->513|1878->529|1904->546|1966->570|2011->587|2072->621|2086->626|2111->630|2141->633|2155->638|2184->646|2229->663|2280->683|2334->693|2372->704|2387->710|2452->766|2492->768|2530->779|2545->785|2581->800|2619->811|2634->817|2883->1045|2921->1056|2936->1062|3189->1294|3231->1308|3314->1360|3346->1365|3395->1384|3427->1386
                  LINES: 22->1|27->2|27->2|27->2|28->3|28->3|28->3|29->4|33->8|33->8|33->8|33->8|34->9|34->9|34->9|34->9|34->9|35->10|37->12|38->13|38->13|39->14|39->14|39->14|39->14|40->15|41->16|41->16|41->16|41->16|41->16|41->16|42->17|43->18|44->19|46->21|46->21|46->21|46->21|48->23|48->23|48->23|50->25|50->25|56->31|58->33|58->33|64->39|66->41|67->42|68->43|70->45|71->46
                  -- GENERATED --
              */
          