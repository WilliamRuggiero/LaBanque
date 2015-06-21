package controllers;

import java.util.ArrayList;
import java.util.List;

import models.CustomerCompteCourant;
import models.User;
import play.mvc.*;
import play.data.Form;
import play.mvc.Controller;
import formData.demandeOffres.DemandeOffre;
import formData.userRegister.NewUserData;
import views.html.page.backEnd.login.accueil;
import views.html.page.backEnd.register.*;
import views.html.page.backEnd.userManager.*;

//POUR QUE SEULS CEUX QUI SONT LOGUES ACCEDENT A CES PAGES
@Security.Authenticated(Securite.class)
public class BackEnd extends Controller {

	public static Result userPost(){
		ArrayList <String> list = new ArrayList<String>();
		list.add("Mâle");
		list.add("Femelle");
		NewUserData formData = new NewUserData();

		Form<NewUserData> form = Form.form(NewUserData.class).fill(formData);
        return ok(registerUser.render(form, User.findByEmail(session().get("email")),list));  
	}
	
	
 	public static Result userPostPost() {
 		ArrayList <String> list = new ArrayList<String>();
		list.add("Mâle");
		list.add("Femelle");
    	Form<NewUserData> form = Form.form(NewUserData.class).bindFromRequest();
    	
    	if(form.hasErrors()) {
    		return ok(registerUser.render(form, User.findByEmail(session().get("email")),list));
    	} 
    	else {
    		User u = User.findByEmail(form.get().email);
    		//POUR RENDRE L'EMAIL UNIQUE
    		Integer rowCount = u.find.where().eq("email", form.get().email).findRowCount(); 
    		if(rowCount != 0){
    			flash("error", "Cet email existe déjà!");
    			return ok(registerUser.render(form, User.findByEmail(session().get("email")),list));
    		}
    		else{
	        	NewUserData data = form.get();
	        	data.buildUser();	
	        	return ok(registerSucess.render());
    		}
        	
    	}
    }
 	
 	public static Result accueilAdmin(){
		return ok(accueil.render(User.findByEmail(session().get("email"))));
	}
 	
 	public static Result listClients(){
 		return ok(listClients.render(User.find.orderBy("userId").findList(), User.findByEmail(session().get("email"))));
 	}
 	
 	public static Result demandeOffre(){
 		DemandeOffre formData = new DemandeOffre();
 		
 		List<CustomerCompteCourant> customer = CustomerCompteCourant.find.orderBy("customerId").findList();
 		for(int i = 0;i <customer.size();i++){
 			Form<DemandeOffre> form = Form.form(DemandeOffre.class).fill(formData);
 		}
 		return ok(demandesOffres.render(form, customer, User.findByEmail(session().get("email"))));
 	}
 	
 	public static Result accepteCompteCourant(){
 		Form<DemandeOffre> form = Form.form(DemandeOffre.class).bindFromRequest();
 		
 		List<CustomerCompteCourant> customer = CustomerCompteCourant.find.orderBy("customerId").findList();
 		
 		for(CustomerCompteCourant c : customer){
 			DemandeOffre data = form.get();
 			data.applyToCustomer(c);
 			return null;
 		}
 		return null;
 	}
}

//teaching.gaaloul@gmail.com