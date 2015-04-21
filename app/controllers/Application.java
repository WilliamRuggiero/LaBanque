package controllers;

import play.*;

import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        // return ok(index.render("Your new application is ready."));
        return redirect(routes.Application.home());
    }
    
    public static Result home() {
    	home();
    }

}
