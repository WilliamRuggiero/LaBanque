package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.page.presentationBanque.*;

public class Presentation extends Controller {

    public static Result presentationBanque() {
        return ok(bankOverview.render());   
   }
}

