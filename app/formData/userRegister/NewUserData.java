package formData.userRegister;

import models.User;
import play.data.validation.Constraints;
import play.data.validation.Constraints.Required;
import javax.persistence.*;
import org.mindrot.jbcrypt.BCrypt;

public class NewUserData {
    
    public Long userId;

    @Required(message = "Ce champ est obligatoire")
    public String firstName;
    
    @Required(message = "Ce champ est obligatoire")
    public String lastName;
    
    @Required(message = "Ce champ est obligatoire")
    @Constraints.Email(message = "Veuillez entrer un email")
    public String email;
    
    @Required(message = "Ce champ est obligatoire")
    public String telephone;
    
    @Required(message = "Ce champ est obligatoire")
    @Constraints.MinLength(value =6, message="Veuillez entrer au moins 6 caractères") //message = "Ce champ demande au minimum 6 caractères")
	public String passwordHash;
    
    
    @Required(message = "Ce champ est obligatoire")
    @Constraints.MinLength(value =6, message="Veuillez entrer au moins 6 caractères") //message = "Ce champ demande au minimum 6 caractères")
	public String confirmPassword;
    
    @Required(message = "Ce champ est obligatoire")
	public String releveIdentiteBancaire;
    
    @Required(message = "Ce champ est obligatoire")
	public String sex;
    
    public boolean isAdmin; 
    
    
    public User buildUser(){
    	User user = new User (userId,firstName,lastName,email,telephone,passwordHash,releveIdentiteBancaire,sex,isAdmin);
    	user.passwordHash = BCrypt.hashpw(user.passwordHash, BCrypt.gensalt());
    	
    	user.save();
    	return user;
    }
}
