package formData.userLogin;

import models.User;
import play.data.validation.Constraints.Required;

public class UserLogin {

	@Required
	public String email;

	@Required
	public String password;

	public String validate() {
		if(User.login(email, password) == null) {
			return "Erreur d'identifiant ou de mot de passe";
		}
		return null;
	}
}

