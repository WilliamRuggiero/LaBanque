package controllers;

import play.mvc.Result;
import play.mvc.Controller;
import views.html.page.souscription.compteCourant.*;

public class Souscription extends Controller{

	public static Result compteCourant1() {
		return ok(compteCourant1.render());
	}
	
	public static Result compteCourant2() {
		return ok(compteCourant2.render());
	}
}
