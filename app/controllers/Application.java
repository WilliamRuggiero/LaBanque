package controllers;

import java.util.ArrayList;
import java.util.List;

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
    		str += u.lastName+" "+u.firstName+" "+u.email+" "+u.password1+" "+u.password2+" "+u.Telephone+" "+u.RIB+" "+u.sex;
    		str += "\n";
    	}
         return ok(str);
    }
    
   
 }

