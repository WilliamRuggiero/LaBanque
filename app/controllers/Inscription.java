package controllers;

import models.User;
import formData.userRegister.NewUserData;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.page.login.*;
import views.html.page.inscription.*;

public class Inscription extends Controller {

	public static Result Inscri() {
		NewUserData formData = new NewUserData();

		Form<NewUserData> form = Form.form(NewUserData.class).fill(formData);
		return ok(userRegistration.render(form));  
	}

	public static Result addUser() {
		Form<NewUserData> form = Form.form(NewUserData.class).bindFromRequest();

		if(form.hasErrors()) {
			return ok(userRegistration.render(form));
		} 
		else {
			User u = User.findByEmail(form.get().email);
			//POUR RENDRE L'EMAIL UNIQUE
			Integer rowCount = u.find.where().eq("email", form.get().email).findRowCount(); 
    		if(rowCount != 0){
    			flash("error", "Cet email existe déjà!");
    			return ok(userRegistration.render(form));
    		}
    		else{
			NewUserData data = form.get();
			data.buildUser();
			User v = User.findByEmail(form.get().email);
			return ok(confirmInscri.render(v));
    		}
		}
	}

	public static Result rappelMotDePasse() {
		return ok(userForget.render());
	}




}