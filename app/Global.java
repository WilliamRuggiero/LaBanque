import models.User;
import play.Application;
import play.GlobalSettings;
import play.Logger;


public class Global extends GlobalSettings {

  @Override
  public void onStart(Application app) {
    Logger.info("Application has started");
    
    System.out.print("toto");
  
  
}

@Override
  public void onStop(Application app) {
    Logger.info("Application shutdown...");
  }  
    
}