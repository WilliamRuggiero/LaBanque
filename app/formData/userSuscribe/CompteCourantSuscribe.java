package formData.userSuscribe;

import models.CustomerCompteCourant;
import models.User;
import play.data.validation.Constraints.Required;

public class CompteCourantSuscribe {
    
    public Long customerId;
    
    public Long userId;

    @Required(message = "Ce champ est obligatoire")
    public String genre;
    
    @Required(message = "Ce champ est obligatoire")
    public String lastName;
    
    
    public String bornName;
    
    @Required(message = "Ce champ est obligatoire")
    public String suscribeDate;
    
    @Required(message = "Ce champ est obligatoire")
    public String nationality;
    
    @Required(message = "Ce champ est obligatoire")
    public String whereIsBorn;
    
    @Required(message = "Ce champ est obligatoire")
    public String familySituation;
    
    @Required(message = "Ce champ est obligatoire")
    public String fiscalResidence;
    
    @Required(message = "Ce champ est obligatoire")
    public String knowTheBank;
    
    public boolean validateByAdmin;
    
    public boolean compteCourantSuscribe;
    public boolean livretASuscribe;
    public boolean PELSuscribe;
    public boolean cartesSuscribe;
   
    public CustomerCompteCourant buildCustomer(User user){
    	CustomerCompteCourant custo = new CustomerCompteCourant (
    			customerId, 
    			userId,
    			genre,
    			lastName,
    			bornName,
    			suscribeDate,
    			nationality, 
    			whereIsBorn, 
    			familySituation, 
    			fiscalResidence,
    			knowTheBank, 
    			validateByAdmin,
    			compteCourantSuscribe,
    			livretASuscribe,
    			PELSuscribe,
    			cartesSuscribe,
    			user
    			);
    	
    	custo.save();
    	return custo;
    }
}
