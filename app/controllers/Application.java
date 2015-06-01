package controllers;

import java.util.ArrayList;
import java.util.List;
<<<<<<< HEAD

import models.User;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.page.indexContent.index;

=======
import models.User;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.page.indexContent.*;
>>>>>>> c84e6db37793a6a628f03f0f82d715fa023f7f9a

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

   
    
    
   
 }

