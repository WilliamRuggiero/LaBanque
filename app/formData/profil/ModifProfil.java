package formData.profil;

import play.data.validation.Constraints;
import play.data.validation.Constraints.Required;
import models.User;

public class ModifProfil {
    
    public Long userId;
    
    @Required(message = "Ce champ est obligatoire")
    public String telephone;
   
    @Required(message = "Ce champ est obligatoire")
    @Constraints.MinLength(value =6, message="Veuillez entrer au moins 6 caractères") //message = "Ce champ demande au minimum 6 caractères")
    public String passwordHash;

    @Required(message = "Ce champ est obligatoire")
    @Constraints.MinLength(value =6, message="Veuillez entrer au moins 6 caractères") //message = "Ce champ demande au minimum 6 caractères")
    public String confirmPassword;
    
    public void modifProfil(User user){
    	userId = user.userId;
    	telephone = user.telephone;
    	passwordHash = user.passwordHash;
    }
    
    public void applyToUser(User user){
    	user.updateUser(telephone, passwordHash);
    }
}
