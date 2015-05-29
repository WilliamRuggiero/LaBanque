package controllers;

import models.User;
import play.mvc.Result;
import play.data.Form;
import play.mvc.Controller;
import formData.userRegister.NewUserData;
import views.html.page.backEnd.register.*;
import views.html.page.indexContent.*;
import views.html.page.backEnd.*;
import views.html.page.backEnd.userManager.*;

public class BackEnd extends Controller {

	public static Result userPost(){
		NewUserData formData = new NewUserData();

		Form<NewUserData> form = Form.form(NewUserData.class).fill(formData);
        return ok(registerUser.render(form));  
	}
	
	
 	public static Result userPostPost() {
    	Form<NewUserData> form = Form.form(NewUserData.class).bindFromRequest();
    	
    	if(form.hasErrors()) {
    		return ok(registerUser.render(form));
    	} 
    	else {
    		User u = User.findByEmail(form.get().email);
    		//POUR RENDRE L'EMAIL UNIQUE
    		Integer rowCount = u.find.where().eq("email", form.get().email).findRowCount(); 
    		if(rowCount != 0){
    			flash("error", "Cet email existe déjà!");
    			return ok(registerUser.render(form));
    		}
    		else{
	        	NewUserData data = form.get();
	        	data.buildUser();
	        	//return redirect(routes.index());		
	        	return ok(registerSucess.render());
    		}
        	
    	}
    }
 	
 	public static Result listClients(){
 		return ok(listClients.render(User.find.orderBy("userId").findList()));
 	}
}

//teaching.gaaloul@gmail.com