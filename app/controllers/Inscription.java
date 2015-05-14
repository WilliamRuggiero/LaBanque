package controllers;

import play.*;
import play.mvc.*;
import views.html.*;

	public class Inscription extends Controller {

	public static Result Inscri() {
	    return ok(Inscri.render());
	}
	public static Result RappelMotDePasse() {
    	return ok(MotDePasse.render());
    }
	
	
	

}