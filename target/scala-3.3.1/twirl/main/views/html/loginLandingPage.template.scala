
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

object loginLandingPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Seq[SharePicture],Int,Session,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(detail: Seq[SharePicture],sort:Int)(implicit session: Session, request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import views.html.helper.CSRF


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Welcome to Play", session)/*4.34*/{_display_(Seq[Any](format.raw/*4.35*/("""
    """),format.raw/*5.5*/("""<head>
        <style>
            #leftbox """),format.raw/*7.22*/("""{"""),format.raw/*7.23*/("""
                """),format.raw/*8.17*/("""float: left;
                width: 25%;
                height: 280px;
            """),format.raw/*11.13*/("""}"""),format.raw/*11.14*/("""

            """),format.raw/*13.13*/("""#middlebox """),format.raw/*13.24*/("""{"""),format.raw/*13.25*/("""
                """),format.raw/*14.17*/("""float: left;
                width: 50%;
                height: 280px;
            """),format.raw/*17.13*/("""}"""),format.raw/*17.14*/("""

            """),format.raw/*19.13*/("""#rightbox """),format.raw/*19.23*/("""{"""),format.raw/*19.24*/("""
                """),format.raw/*20.17*/("""float: right;
                width: 25%;
                height: 280px;
            """),format.raw/*23.13*/("""}"""),format.raw/*23.14*/("""

            """),format.raw/*25.13*/("""h1 """),format.raw/*25.16*/("""{"""),format.raw/*25.17*/("""
                """),format.raw/*26.17*/("""text-align: center;
            """),format.raw/*27.13*/("""}"""),format.raw/*27.14*/("""
        """),format.raw/*28.9*/("""</style>
    </head>

    <body>
        <div>
            <h1>Welcome! You are logged in.</h1>
            <form action=""""),_display_(/*34.28*/routes/*34.34*/.SharePictureController.sortBy),format.raw/*34.64*/("""" method="post">
                """),_display_(/*35.18*/CSRF/*35.22*/.formField),format.raw/*35.32*/("""
                """),format.raw/*36.17*/("""<label for="sorting">Sort By:</label>
                <select onchange="this.form.submit()" name="sorting" id="sorting">
                    <option value=0  """),_display_(/*38.39*/(if(sort == 0) "selected" else "")),format.raw/*38.73*/(""">No Sorting</option>
                    <option value=1  """),_display_(/*39.39*/(if(sort == 1) "selected" else "")),format.raw/*39.73*/(""">Date in Asc</option>
                    <option value=2  """),_display_(/*40.39*/(if(sort == 2) "selected" else "")),format.raw/*40.73*/(""">Date in Desc</option>
                    <option value=3  """),_display_(/*41.39*/(if(sort == 3) "selected" else "")),format.raw/*41.73*/(""">No. of likes Asc</option>
                    <option value=4  """),_display_(/*42.39*/(if(sort == 5) "selected" else "")),format.raw/*42.73*/(""">No. of likes Desc</option>
                </select>
                <noscript>
                    <input type="submit" value="sort">
                </noscript>
            </form>

            """),_display_(/*49.14*/for(picture <- detail) yield /*49.36*/{_display_(Seq[Any](format.raw/*49.37*/("""
                """),format.raw/*50.17*/("""<div class="col-sm-6">
                <div class="card" style="width: 18rem;">
                    <img src=""""),_display_(/*52.32*/picture/*52.39*/.image),format.raw/*52.45*/("""" class="card-img-top img-thumbnail" alt="">
                    <div class="card-body">
                        <h3>Added on """),_display_(/*54.39*/picture/*54.46*/.date),format.raw/*54.51*/(""" """),format.raw/*54.52*/("""by """),_display_(/*54.56*/picture/*54.63*/.addedBy),format.raw/*54.71*/("""</h3>
                            <!--<h5 class="card-title">Card title</h5>-->
                        <p class="card-text">Description : """),_display_(/*56.61*/picture/*56.68*/.description),format.raw/*56.80*/("""</p>
                        <h4><button type="button">Likes</button> : """),_display_(/*57.69*/picture/*57.76*/.likes),format.raw/*57.82*/("""<br>
                            Comments:</h4>
                        <!--for limiting the comments to 2 in the front page-->
                        """),_display_(/*60.26*/for((comment, index) <- picture.comments.zipWithIndex.take(2)) yield /*60.88*/ {_display_(Seq[Any](format.raw/*60.90*/("""
                            """),format.raw/*61.29*/("""<h5> """),_display_(/*61.35*/comment/*61.42*/.username),format.raw/*61.51*/(""" """),format.raw/*61.52*/(""": """),_display_(/*61.55*/comment/*61.62*/.lines),format.raw/*61.68*/("""</h5>
                        """)))}),format.raw/*62.26*/("""
                        """),_display_(if(picture.comments.length > 2)/*63.57*/ {_display_(Seq[Any](format.raw/*63.59*/("""
                            """),format.raw/*64.29*/("""<p>See more comments...</p>
                        """)))} else {null} ),format.raw/*65.26*/("""
                        """),format.raw/*66.25*/("""<a href=""""),_display_(/*66.35*/routes/*66.41*/.SharePictureController.showPicDetails(picture.id)),format.raw/*66.91*/("""" class="btn btn-primary">See More</a>
                    </div>
                </div>
                </div>
            """)))}),format.raw/*70.14*/("""
        """),format.raw/*71.9*/("""</div>
    </body>
    <script>

    </script>
""")))}))
      }
    }
  }

  def render(detail:Seq[SharePicture],sort:Int,session:Session,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(detail,sort)(session,request)

  def f:((Seq[SharePicture],Int) => (Session,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (detail,sort) => (session,request) => apply(detail,sort)(session,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/loginLandingPage.scala.html
                  HASH: cf5f5274ee302f2ac35a7ca236d8d43ae16abc46
                  MATRIX: 815->1|975->90|1033->120|1060->122|1100->154|1138->155|1169->160|1240->204|1268->205|1312->222|1424->306|1453->307|1495->321|1534->332|1563->333|1608->350|1720->434|1749->435|1791->449|1829->459|1858->460|1903->477|2016->562|2045->563|2087->577|2118->580|2147->581|2192->598|2252->630|2281->631|2317->640|2467->763|2482->769|2533->799|2594->833|2607->837|2638->847|2683->864|2869->1023|2924->1057|3010->1116|3065->1150|3152->1210|3207->1244|3295->1305|3350->1339|3442->1404|3497->1438|3722->1636|3760->1658|3799->1659|3844->1676|3982->1787|3998->1794|4025->1800|4179->1927|4195->1934|4221->1939|4250->1940|4281->1944|4297->1951|4326->1959|4493->2099|4509->2106|4542->2118|4642->2191|4658->2198|4685->2204|4865->2357|4943->2419|4983->2421|5040->2450|5073->2456|5089->2463|5119->2472|5148->2473|5178->2476|5194->2483|5221->2489|5283->2520|5367->2577|5407->2579|5464->2608|5561->2661|5614->2686|5651->2696|5666->2702|5737->2752|5893->2877|5929->2886
                  LINES: 22->1|25->2|28->3|29->4|29->4|29->4|30->5|32->7|32->7|33->8|36->11|36->11|38->13|38->13|38->13|39->14|42->17|42->17|44->19|44->19|44->19|45->20|48->23|48->23|50->25|50->25|50->25|51->26|52->27|52->27|53->28|59->34|59->34|59->34|60->35|60->35|60->35|61->36|63->38|63->38|64->39|64->39|65->40|65->40|66->41|66->41|67->42|67->42|74->49|74->49|74->49|75->50|77->52|77->52|77->52|79->54|79->54|79->54|79->54|79->54|79->54|79->54|81->56|81->56|81->56|82->57|82->57|82->57|85->60|85->60|85->60|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|87->62|88->63|88->63|89->64|90->65|91->66|91->66|91->66|91->66|95->70|96->71
                  -- GENERATED --
              */
          