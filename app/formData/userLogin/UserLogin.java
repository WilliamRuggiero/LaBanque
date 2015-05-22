package formData.userLogin;

import models.User;
import play.data.validation.Constraints.Required;

public class UserLogin {

    @Required
    public String email;
  
    @Required
	public String password;
}
