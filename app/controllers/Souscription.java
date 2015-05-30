package controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import models.Customer;
import formData.userSuscribe.CompteCourantSuscribe;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.page.souscription.compteCourant.compteCourant1;
import views.html.page.souscription.compteCourant.compteCourant2;
import views.html.page.souscription.compteCourant.compteCourant3;

public class Souscription extends Controller{

	public static Result compteCourant1() {
		return ok(compteCourant1.render());
	}
	
	public static Result compteCourant2() {
		
		
		CompteCourantSuscribe formData = new CompteCourantSuscribe();

		Form<CompteCourantSuscribe> form = Form.form(CompteCourantSuscribe.class).fill(formData);
		Date maDate = new Date(); 
		// affichage: 
		String dateString=maDate.toString();
		System.out.println(maDate.toString()); 
		return ok(compteCourant2.render(dateString,form));
	}
	
	public static Result addCustomer() {
		Date maDate = new Date(); 
		// affichage: 
		String dateString=maDate.toString();
		System.out.println(dateString); 
			
		Form<CompteCourantSuscribe> form = Form.form(CompteCourantSuscribe.class).bindFromRequest();
		if(form.hasErrors()) {
			System.out.println(1);
			return ok(compteCourant2.render(dateString,form));
		} 
		else {
			Customer custo = Customer.findByName(form.get().lastName);
			//POUR RENDRE LE NOM UNIQUE
			Integer rowCount = custo.find.where().eq("lastName", form.get().lastName).findRowCount(); 
    		if(rowCount != 0){
    			flash("error", "Cet email existe déjà!");
    			System.out.println(2);
    			return ok(compteCourant2.render(dateString,form));
    		}
    		else{
    		CompteCourantSuscribe data = form.get();
			data.buildCustomer();
			Customer custom = Customer.findByName(form.get().lastName);
			System.out.println(3);
			return ok(compteCourant3.render(custom));
    		}
		}
		
		
		
    		}
		}
	//}
