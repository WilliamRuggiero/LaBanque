package formData.userLogin;

import models.User;
import play.data.validation.Constraints.Required;

public class UserLogin {

    @Required
    public String email;
  
    @Required
	public String password;
  
    
   // public User buildUser(){
   //	User user = new User (userId,firstName,lastName,email,telephone,password,releveIdentiteBancaire,sex);
    //	user.save();
    	//return user;
    //}
}
