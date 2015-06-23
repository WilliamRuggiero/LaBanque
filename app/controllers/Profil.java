package controllers;

import formData.profil.ModifProfil;
import play.data.Form;
import play.mvc.Result;
import play.mvc.Security;
import models.CustomerCompteCourant;
import models.User;
import play.mvc.Controller;
import views.html.page.userOverview.*;

//POUR QUE SEULS CEUX QUI SONT LOGUES ACCEDENT A CES PAGES

@Security.Authenticated(SecuriteUser.class)
public class Profil extends Controller{
	
	public static Result historique(){
		User u = User.findByEmail(session().get("email"));
		Integer ind = 0;
		for(int i = 0; i <CustomerCompteCourant.find.orderBy("userId").findList().size(); i++){
			 if(CustomerCompteCourant.find.orderBy("userId").findList().get(i).userId == u.userId){
				 ind = ind + 1;
			 }
		}
		
		return ok(historique.render(u, CustomerCompteCourant.find.orderBy("userId").findList(),ind));
	}
	public static Result profilUser(){
		return ok(userOverview.render(User.findByEmail(session().get("email")), CustomerCompteCourant.find.orderBy("userId").findList()));
	}
	
	public static Result formModif(){
		User u = User.findByEmail(session().get("email"));
		
		ModifProfil formData = new ModifProfil();

		Form<ModifProfil> form = Form.form(ModifProfil.class).fill(formData);
		return ok(modifProfil.render(form,u));  
	}
	
	public static Result modifProfil(){
		User u = User.findByEmail(session().get("email"));
				
		Form<ModifProfil> form = Form.form(ModifProfil.class).bindFromRequest();

		if(form.hasErrors()) {
			return ok(modifProfil.render(form,u)); 
		} 
		else {
			if(!form.get().confirmPassword.equals(form.get().passwordHash)){
	    		
    			flash("error1","Les mots de passe ne correpondent pas");
    			return ok(modifProfil.render(form,u));
			}else{
	    			ModifProfil data = form.get();
		        	data.applyToUser(u);
	    			return ok(confirmModif.render(u));
			}
    	}
	}
}
