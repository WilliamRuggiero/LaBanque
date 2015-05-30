package controllers;

import play.mvc.Result;
import play.mvc.Security;
import models.User;
import play.mvc.Controller;
import views.html.page.userOverview.userOverview;

//POUR QUE SEULS CEUX QUI SONT LOGUES ACCEDENT A CES PAGES

@Security.Authenticated(SecuriteUser.class)
public class Profil extends Controller{
	public static Result profilUser(){
		return ok(userOverview.render(User.findByEmail(session().get("email"))));
	}
}
