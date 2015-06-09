package controllers;

import formData.userRegister.NewUserData;
import play.data.Form;
import play.mvc.Result;
import play.mvc.Security;
import models.CustomerCompteCourant;
import models.User;
import play.mvc.Controller;
import views.html.page.inscription.confirmInscri;
import views.html.page.userOverview.*;

//POUR QUE SEULS CEUX QUI SONT LOGUES ACCEDENT A CES PAGES

@Security.Authenticated(SecuriteUser.class)
public class Profil extends Controller{
	public static Result profilUser(){
		return ok(userOverview.render(User.findByEmail(session().get("email")), CustomerCompteCourant.find.orderBy("userId").findList()));
	}
	
	public static Result formModif(){
		
		NewUserData formData = new NewUserData();

		Form<NewUserData> form = Form.form(NewUserData.class).fill(formData);
		return ok(modifProfil.render(form,User.findByEmail(session().get("email"))));  
	}
	
	public static Result modifProfil(){
		Form<NewUserData> form = Form.form(NewUserData.class).bindFromRequest();

		if(form.hasErrors()) {
			return ok(modifProfil.render(form,User.findByEmail(session().get("email")))); 
		} 
		else {
			User u = User.findByEmail(form.get().email);
			//POUR RENDRE L'EMAIL UNIQUE
			Integer rowCount = u.find.where().eq("email", form.get().email).findRowCount(); 
    		if(rowCount != 0 && !u.email.equals(session().get("email"))){
    			flash("error", "Cet email existe déjà");
    			return ok(modifProfil.render(form,User.findByEmail(session().get("email")))); 
    		}
    		else {
    			
    			if(!form.get().confirmPassword.equals(form.get().passwordHash)){
    		
	    			flash("error1","Les mots de passe ne correpondent pas");
	    			return ok(modifProfil.render(form,User.findByEmail(session().get("email")))); 
    			}
	    		else{
	    			return null;
	    		}
    		}
		}
	}
}
