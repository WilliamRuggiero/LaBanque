package controllers;

import java.util.List;

import models.User;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
         return ok(index.render());   
    }
   
    public static Result userList() {
    	List<User> userList = User.find.all(); 
    	String str = "";
    	    
    	for(User u : userList) {
    		str += u.lastName+" "+u.firstName+" "+u.email+" "+u.password;
    		str += "\n";
    	}
    	
         return ok(str);
    }
    
    
    
 //hkzelhgerklhgerlkh
    
    

}

