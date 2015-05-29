package controllers;
import java.util.ArrayList;
import java.util.List;

import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import formData.userLogin.UserLogin;
import formData.userRegister.NewUserData;
//import views.html.page.backEnd.listClients;
import views.html.page.backEnd.login.*;


public class LoginBackEnd extends Controller {

	public static Result indexAdmin(){

		UserLogin formData = new UserLogin();

		Form<UserLogin> form = Form.form(UserLogin.class).fill(formData);
		return ok(loginAdmin.render(form));
	}

	//Ouvre la session
	public static Result connectBackOffice() {
		Form<UserLogin> form = Form.form(UserLogin.class).bindFromRequest();

		if(form.hasErrors()) {
			flash("error", "Erreur d'identifiant ou de mot de passe");
			return badRequest(loginAdmin.render(form));
			//return ok(loginAdmin.render(form));
		} 
		else {
			User u = User.findByEmail(form.get().email);
			if(u.isAdmin == false){
				flash("error", "Vous n'êtes pas administrateur");
				return badRequest(loginAdmin.render(form));
			}
			else{
				session("email", form.get().email);	
				//return redirect(routes.LoginBackEnd.accueilAdmin());
				return ok(accueil.render(User.findByEmail(form.get().email)));
			}
		}
	}

	//Ferme la session
	public static Result logout() {
		session().clear();
		flash("success", "Vous êtes déconnecté(e)");
		return redirect(routes.LoginBackEnd.indexAdmin());
	}
}
