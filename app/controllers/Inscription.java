package controllers;

import formData.userRegister.NewUserData;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;
import views.html.page.login.*;
import views.html.page.backEnd.register.registerUser;
import views.html.page.inscription.*;
import views.html.form.*;

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
    	NewUserData data = form.get();
    	data.buildUser();		
    	return ok(userRegistration.render(form));
	}
}

public static Result rappelMotDePasse() {
	return ok(userForget.render());
}
	
	
	

}