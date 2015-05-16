package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;
import views.html.page.login.*;
import views.html.page.inscription.*;
import views.html.form.*;


	public class Inscription extends Controller {

	public static Result Inscri() {
	    return ok(userRegistration.render());
	}
	public static Result rappelMotDePasse() {
    	return ok(userForget.render());
    }
	
	
	

}