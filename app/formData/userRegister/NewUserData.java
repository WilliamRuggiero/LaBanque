package formData.userRegister;

import models.User;
import play.data.validation.Constraints;
import play.data.validation.Constraints.Required;

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
	public String password;
    
    @Required(message = "Ce champ est obligatoire")
    @Constraints.MinLength(value =6, message="Veuillez entrer au moins 6 caractères") //message = "Ce champ demande au minimum 6 caractères")
	public String confirmPassword;
    
    @Required(message = "Ce champ est obligatoire")
	public String releveIdentiteBancaire;
    
    @Required
	public String sex;
    
    public boolean isAdmin; 
    
    
    public User buildUser(){
    	User user = new User (userId,firstName,lastName,email,telephone,password,releveIdentiteBancaire,sex,isAdmin);
    	user.save();
    	return user;
    }
    
    /*public String  validate() {
       

        if (isBlank(password)) {
            return "Password is required";
        }

        if (isBlank(confirmPassword)) {
            return "Confirm Password is required";
        }


        if (!password.equals(confirmPassword)) {
            return "Passwords do not match";
        }

        return null;
    }*/

    private boolean isBlank(String input) {
        return input == null || input.isEmpty() || input.trim().isEmpty();
    }
}
