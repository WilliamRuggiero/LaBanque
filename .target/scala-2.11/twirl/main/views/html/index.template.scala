
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="fr">
<head>
  <title>Accueil - La banque Nationale</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
  <link rel="stylesheet" media="screen" href=""""),_display_(/*10.48*/routes/*10.54*/.Assets.at("stylesheets/home.css")),format.raw/*10.88*/("""">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

  <div class="row">
  	<div class="col-sm-4 hidden-xs"><img class="logoHeader" width=200px src=""""),_display_(/*15.78*/routes/*15.84*/.Assets.at("images/logo-banque-du-net.png")),format.raw/*15.127*/(""""></div>
  	<div class="col-sm-4 visible-xs EncartResponsiveTitre"></div>
  	<div class="col-sm-4 hidden-xs"><h2 class="titreHeader">La banque à domicile</h2></div>
  	<div class="col-sm-4 hidden-xs"><button type="button" class="btn btn-success BoutonHeader BoutonConnecter">Se connecter</button><button type="button" class="btn btn-warning BoutonHeader BoutonCompte">Créer un compte</button></div>
  	<!-- <div class="col-sm-4 visible-xs"><button type="button" class="btn btn-success BoutonHeaderResponsive BoutonConnecterResponsive">Se connecter</button></div>
  	<div class="col-sm-4 visible-xs"><button type="button" class="btn btn-warning BoutonHeaderResponsive BoutonCompteResponsive">Créer un compte</button></div> -->
<!--   	<div class="col-sm-2"><button type="button" class="btn btn-success BoutonHeader BoutonCompte">Créer un compte</button></div> -->
  </div>
  	<nav class="navbar navbar-default navbar-fixed-top hidden-xs">
		<div class="container-fluid">
  <!--   <div class="navbar-header">
      <a class="navbar-brand" href="#"><img class="logoNavbar" src="logo-banque-du-net.png"></a>
    </div> -->
    <div>
      <ul class="nav navbar-nav listeMenu">
        <li class="active"><a href="#">Accueil</a></li>
        <li><a href="#1">Présentation de la banque</a></li>
	        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#2">Offres <span class="caret"></span></a>
	          <ul class="dropdown-menu">
	          	<li><a href="#4">PEL</a></li>
	            <li><a href="#5">Cartes</a></li>
	            <li><a href="#6">Compte courant</a></li>
	          </ul>
	        </li>
        <li></li>
      </ul>
    </div>
  		</div>
	</nav>

	<nav class="navbar navbar-default navbar-fixed-top visible-xs">
		<div class="container-fluid">
  <!--   <div class="navbar-header">
      <a class="navbar-brand" href="#"><img class="logoNavbar" src="logo-banque-du-net.png"></a>
    </div> -->
    <div class="row">
      <ul class="nav navbar-nav listeMenuResponsive">
        
        <li>
       		<img class="LogoResponsiveNav" src=""""),_display_(/*54.47*/routes/*54.53*/.Assets.at("images/logo-banque-du-net.png")),format.raw/*54.96*/("""">	
       		<button type="button" class="btn btn-xs btn-success">Se connecter</button>
			<button type="button" class="btn btn-warning btn-xs">Créer un compte</button>
  		</li>

        <li class="active"><a href="#">Accueil</a></li>
        <li><a href="#1">Présentation de la banque</a></li>
	        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#2">Offres <span class="caret"></span></a>
	          <ul class="dropdown-menu">
	          	<li><a href="#4">PEL</a></li>
	            <li><a href="#5">Cartes</a></li>
	            <li><a href="#6">Compte courant</a></li>
	          </ul>
	        </li>
        <li></li>
      </ul>
    </div>
  		</div>
	</nav>

</head>
<body>

<div class="container">
  <br>
  <div id="myCarousel" class="carousel slide " data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src=""""),_display_(/*90.20*/routes/*90.26*/.Assets.at("images/1.jpg")),format.raw/*90.52*/("""" alt="Chania" width="360" height="245">
      </div>

      <div class="item">
        <a href="#56"><img src=""""),_display_(/*94.34*/routes/*94.40*/.Assets.at("images/2.jpg")),format.raw/*94.66*/("""" alt="Chania" width="360" height="245"> </a>
      </div>
    
      <div class="item">
        <img src=""""),_display_(/*98.20*/routes/*98.26*/.Assets.at("images/3.jpg")),format.raw/*98.52*/("""" alt="Flower" width="360" height="245">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>




<div class="container">
  <h3>Lorem Ipsum</h3>
  <div class="row">
    <div class="col-sm-3">
      <p>On the other hand, we denounce with righteous indignation and dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, that they cannot foresee the pain and trouble that are bound t</p>
    </div>
    <div class="col-sm-3"> 
      <p>On the other hand, we denounce with righteous indignation and dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, that they cannot foresee the pain and trouble that are bound t</p>
    </div>
    <div class="col-sm-3"> 
      <p>On the other hand, we denounce with righteous indignation and dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, that they cannot foresee the pain and trouble that are bound t</p>
    </div>
    <div class="col-sm-3">
      <p>On the other hand, we denounce with righteous indignation and dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, that they cannot foresee the pain and trouble that are bound t</p>
    </div>
    <div class="clearfix visible-lg"></div>
  </div>
</div>
<!-- 
<div class="container">
  <div class="row">
    <div class="col-md-3">
      <p>A fixed navigation bar stays visible in a fixed position (top or bottom) independent of the page scroll.</p>
    </div>
    <div class="col-md-3"> 
      <p>A fixed navigation bar stays visible in a fixed position (top or bottom) independent of the page scroll.</p>
    </div>
    <div class="col-md-3"> 
      <p>A fixed navigation bar stays visible in a fixed position (top or bottom) independent of the page scroll.</p>
    </div>
    <div class="col-md-3">
      <p>A fixed navigation bar stays visible in a fixed position (top or bottom) independent of the page scroll.</p>
    </div>
    <div class="clearfix visible-lg"></div>
  </div>
</div> -->

<nav class="navbar navbar-default Footer hidden-xs">
		<ul class="row ListeFooter hidden-xs">
			<div class="col-md-4"><a href="#34">Mentions Légales</a></div>
			<div class="col-md-4"><a href="#35">Plan du site</a></div>
			<div class="col-md-4"><a href="#36">ISEP ©</a></div>
		</div>
	</ul>
</nav>
<nav class="navbar navbar-default FooterResponsive visible-xs">
	<ul class="row ListeFooter visible-xs">
			<div class="col-md-4"><a href="#34">Mentions Légales</a></div>
			<div class="col-md-4"><a href="#35">Plan du site</a></div>
			<div class="col-md-4"><a href="#36">ISEP ©</a></div>
		</div>
	</ul>
</nav>
</body>
</html>"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Apr 21 17:11:42 CEST 2015
                  SOURCE: /Users/William/LaBanqueISEP/app/views/index.scala.html
                  HASH: 72a1c558bc3fadb56a6b93891f69310ecb31e338
                  MATRIX: 723->1|828->18|856->20|1215->352|1230->358|1285->392|1598->678|1613->684|1678->727|3786->2808|3801->2814|3865->2857|5104->4069|5119->4075|5166->4101|5306->4214|5321->4220|5368->4246|5503->4354|5518->4360|5565->4386
                  LINES: 26->1|29->1|31->3|38->10|38->10|38->10|43->15|43->15|43->15|82->54|82->54|82->54|118->90|118->90|118->90|122->94|122->94|122->94|126->98|126->98|126->98
                  -- GENERATED --
              */
          