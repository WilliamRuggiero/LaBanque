package controllers;

import models.User;
import play.*;
import play.mvc.Http.Context;
import play.mvc.*;

public class Securite extends Security.Authenticator {
	@Override
    public String getUsername(Context ctx) {
		User u = User.findByEmail(ctx.session().get("email"));
		if(ctx.session().get("email") != null){
			if(u.isAdmin == false){
				return null;
			}
			else{
				 return ctx.session().get("email");
			}
		}
		else return null;
    }

	@Override
    public Result onUnauthorized(Context ctx) {
        return redirect(routes.LoginBackEnd.indexAdmin());
    }

}
