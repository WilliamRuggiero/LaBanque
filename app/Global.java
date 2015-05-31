import models.User;
import play.Application;
import play.GlobalSettings;
import play.Logger;


public class Global extends GlobalSettings {

  @Override
  public void onStart(Application app) {
    Logger.info("Application has started");
    
    System.out.print("toto");
    
   // User u = new User((long) 1,"William","RUGGIERO","ruggierowilliam@gmail.com","0622030466","azerty","AA","male",true);
   // User v = new User((long) 2,"William","RUGGIERO","ruggierowilliam@gmail.fr","0622030466","azerty","AA","male",false);
	
   // u.save();
   // v.save();
  
  
}

@Override
  public void onStop(Application app) {
    Logger.info("Application shutdown...");
  }  
    
}