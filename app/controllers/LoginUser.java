package controllers;
import java.util.ArrayList;
import java.util.List;

import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import formData.userLogin.UserLogin;
import views.html.page.backEnd.login.accueil;
import views.html.page.backEnd.login.loginAdmin;
import views.html.page.login.*;
import views.html.page.userOverview.userOverview;

public class LoginUser extends Controller {
	
	public static Result loginUser(){
		session().clear();
		UserLogin formData = new UserLogin();

		Form<UserLogin> form = Form.form(UserLogin.class).fill(formData);
		return ok(userLogin.render(form));
	}
	
	//Ouvre la session
		public static Result loUser() {
	    	Form<UserLogin> form = Form.form(UserLogin.class).bindFromRequest();
	    	
	    	if(form.hasErrors()) {
	    		flash("error", "Erreur d'identifiant ou de mot de passe");
	    		return badRequest(userLogin.render(form));
	    	} 
	    	else {
	    		User u = User.findByEmail(form.get().email);
	    		if(u.isAdmin == true){
	    			flash("error", "Vous êtes administrateur");
	        		return badRequest(userLogin.render(form));
	    		}
	    		else{
	    		session("email", form.get().email);	
	    		return redirect(routes.Profil.profilUser());
	    		}
	    	}
	    }
		
		//Ferme la session
		public static Result logout() {
			session().clear();
			flash("success", "Vous êtes déconnecté(e)");
			return redirect(routes.LoginUser.loginUser());
		}
}
