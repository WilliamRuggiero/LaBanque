package controllers;

import java.util.List;

import models.User;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.*;

public class Presentation extends Controller {

    public static Result PresentationBanque() {
        return ok(PresentationBanque.render());   
   }
}

