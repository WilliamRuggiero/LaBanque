package formData.userSuscribe;

import java.sql.Date;
import models.Customer;
import play.data.validation.Constraints.Required;

public class CompteCourantSuscribe {
    
    public Long customerId;

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
    
    
    public Customer buildCustomer(){
    	Customer custo = new Customer (
    			customerId, 
    			genre,
    			lastName,
    			bornName,
    			suscribeDate,
    			nationality, 
    			whereIsBorn, 
    			familySituation, 
    			fiscalResidence,
    			knowTheBank,
    			validateByAdmin
    			);
    	
    	custo.save();
    	return custo;
    }
}
