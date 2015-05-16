package controllers;

import java.util.List;

import models.User;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.page.presentationBanque.*;
import views.html.*;

public class Presentation extends Controller {

    public static Result presentationBanque() {
        return ok(bankOverview.render());   
   }
}

