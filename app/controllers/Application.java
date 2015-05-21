package controllers;

import java.util.ArrayList;
import views.html.page.login.*;
import java.util.List;

import formData.userLogin.UserLogin;
import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;
import views.html.page.indexContent.*;

public class Application extends Controller {

    public static Result index() {
    	List<String> imageList = new ArrayList<String>();
    	imageList.add("2");
    	imageList.add("3");
    	imageList.add("4");
    	
        return ok(index.render(imageList,"1"));   
    }
   
    public static Result userList() {
    	List<User> userList = User.find.all(); 
    	String str = "";
    	    
    	for(User u : userList) {
    		str += u.lastName+" "+u.firstName+" "+u.email+" "+u.password+" "+u.telephone+" "+u.releveIdentiteBancaire+" "+u.sex;
    		str += "\n";
    	}
         return ok(str);
    }
    
    public static Result loginUser(){
		UserLogin formData = new UserLogin();

		Form<UserLogin> form = Form.form(UserLogin.class).fill(formData);
	return ok(userLogin.render(form));
	}
    
    
   
 }

