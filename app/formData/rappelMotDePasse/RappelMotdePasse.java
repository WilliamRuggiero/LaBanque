package formData.rappelMotDePasse;

import play.data.validation.Constraints;
import play.data.validation.Constraints.Required;

public class RappelMotdePasse {

	@Required(message = "Ce champ est obligatoire")
    @Constraints.Email(message = "Veuillez entrer un email")
    public String email;
	
}
