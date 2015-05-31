package controllers;

import java.util.ArrayList;

import formData.userSuscribe.CompteCourantSuscribe;
import play.data.Form;
import play.mvc.Result;
import play.mvc.Controller;
import play.mvc.Security;
import views.html.page.souscription.compteCourant.*;

@Security.Authenticated(SecuriteUser.class)
public class Souscription extends Controller{

	public static Result compteCourant1() {
		return ok(compteCourant1.render());
	}
	
	public static Result compteCourant2() {
		CompteCourantSuscribe formData = new CompteCourantSuscribe();
		ArrayList List = new ArrayList();
		List.add("Mâle");
		List.add("Femâle");
		Form<CompteCourantSuscribe> form = Form.form(CompteCourantSuscribe.class).fill(formData);
		return ok(compteCourant2.render(form, List));
	}
}
