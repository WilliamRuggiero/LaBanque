package formData.demandeOffres;

import models.CustomerCompteCourant;

public class DemandeOffre {

	public Long customerId;
	
	public boolean validateByAdmin;
	
	public Long userId;
	
	public void accepteOffre(CustomerCompteCourant c){
		customerId = c.customerId;
		validateByAdmin = c.validateByAdmin;
		userId = c.userId;
	}
	
	public void applyToCustomer(CustomerCompteCourant c){
		c.updateCompteCourantUser(validateByAdmin);
	}
}
