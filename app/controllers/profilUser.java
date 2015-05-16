package controllers;

import java.util.List;

import models.User;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.*;
import views.html.page.userOverview.*;

public class profilUser extends Controller {

    public static Result profilUse() {
        return ok(userOverview.render());   
   }
}

