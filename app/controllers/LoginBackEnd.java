package controllers;

import java.util.ArrayList;
import java.util.List;

import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import formData.userLogin.UserLogin;
import formData.userRegister.NewUserData;
import views.html.page.backEnd.login.*;

public class LoginBackEnd extends Controller {
	
	public static Result indexAdmin(){
		
		UserLogin formData = new UserLogin();

		Form<UserLogin> form = Form.form(UserLogin.class).fill(formData);
		return ok(loginAdmin.render(form));
	}
	
	public static Result connectBackOffice() {
    	Form<UserLogin> form = Form.form(UserLogin.class).bindFromRequest();
    	
    	if(form.hasErrors()) {
    		return ok(loginAdmin.render(form));
    	} 
    	else {
        	UserLogin data = form.get();
        	//return redirect(routes.index());		
        	return ok(loginAdmin.render(form));
    	}
    }
}
