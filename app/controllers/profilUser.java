package controllers;

import java.util.List;

import models.User;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.*;

public class profilUser extends Controller {

    public static Result ProfilUse() {
        return ok(Profil.render());   
   }
}

