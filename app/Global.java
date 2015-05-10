import models.User;
import play.Application;
import play.GlobalSettings;
import play.Logger;


public class Global extends GlobalSettings {

  @Override
  public void onStart(Application app) {
    Logger.info("Application has started");
    
    System.out.print("toto");
  
    User u = new User("william","ruggiero", "william.ruggiero@gmail.com", "1234", "1234", "0656789876");
    u.save();
}

@Override
  public void onStop(Application app) {
    Logger.info("Application shutdown...");
  }  
    
}