package formData.userRegister;

import models.User;
import play.data.validation.Constraints.Required;

public class NewUserData {
    
    public Long userId;

    @Required(message = "Ce champ est obligatoire")
    public String firstName;
    @Required(message = "Ce champ est obligatoire")
    public String lastName;
    @Required(message = "Ce champ est obligatoire")
    public String email;
    @Required(message = "Ce champ est obligatoire")
    public String telephone;
    @Required(message = "Ce champ est obligatoire")
	public String password;
    @Required(message = "Ce champ est obligatoire")
	public String releveIdentiteBancaire;
    @Required
	public String sex;
    
    
    public User buildUser(){
    	User user = new User (userId,firstName,lastName,email,telephone,password,releveIdentiteBancaire,sex);
    	user.save();
    	return user;
    }
}
