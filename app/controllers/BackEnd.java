package controllers;

import play.mvc.Result;
import play.data.Form;
import play.mvc.Controller;
import formData.userRegister.NewUserData;
import views.html.page.backEnd.register.*;
import views.html.page.indexContent.*;

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
        	NewUserData data = form.get();
        	data.buildUser();
        	//return redirect(routes.index());		
        	return ok(registerUser.render(form));
    	}
    }
}