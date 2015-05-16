package controllers;

import play.*;

import play.mvc.*;

import views.html.*;

import views.html.page.offres.*;

	public class Offres extends Controller {

	public static Result CompteCourant() {
	    	return ok(CompteCourant.render());
	    }
	public static Result LivretA() {
	    	return ok(LivretA.render());
	    }
	public static Result Cartes() {
	    	return ok(Cartes.render());
	    }
	public static Result PEL() {
	    	return ok(PEL.render());
	    }


}