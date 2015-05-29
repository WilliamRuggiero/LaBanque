package controllers;

import play.*;
import play.mvc.Http.Context;
import play.mvc.*;

public class Securite extends Security.Authenticator {
	@Override
    public String getUsername(Context ctx) {
        return ctx.session().get("email");
    }

	@Override
    public Result onUnauthorized(Context ctx) {
        return redirect(routes.LoginBackEnd.indexAdmin());
    }

}
