package controllers;

import play.mvc.Result;
import play.data.Form;
import play.mvc.Controller;
import formData.userRegister.NewUserData;

import views.html.page.backEnd.register.*;

public class BackEnd extends Controller {

	public static Result demoPost(){
		NewUserData formData = new NewUserData();

		Form<NewUserData> form = Form.form(NewUserData.class).fill(formData);
        return ok(registerUser.render(form));
        
        
	}
	
	
	
 	public static Result demoPostPost() {
 		
 		
    	Form<NewUserData> form = Form.form(NewUserData.class).bindFromRequest();
    	return ok(form.toString());
    }
}