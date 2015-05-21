package formData.userRegister;

import models.User;
import play.data.validation.Constraints.Required;

public class NewUserData {
    
    public Long userId;

    @Required
    public String firstName;
    @Required
    public String lastName;
    @Required
    public String email;
    @Required
    public String telephone;
    @Required
	public String password;
    @Required
	public String releveIdentiteBancaire;
    @Required
	public String sex;
    
    
    
    public User buildUser(){
    	User user = new User (userId,firstName,lastName,email,telephone,password,releveIdentiteBancaire,sex);
    	user.save();
    	return user;
    }
}
