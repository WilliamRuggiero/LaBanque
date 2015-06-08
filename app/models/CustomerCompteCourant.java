package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import play.db.ebean.Model;

@Entity
public class CustomerCompteCourant extends Model {
	
	public static Finder<Long,CustomerCompteCourant> find = new Finder<Long,CustomerCompteCourant>(Long.class, CustomerCompteCourant.class);
	
	@Id
	public Long customerId;
	
	@JoinColumn(name = "userId")
	public Long userId;
	
	public String genre;
	public String lastName;
	public String bornName;	
	public String suscribeDate;
	public String nationality;
	public String whereIsBorn;
	public String familySituation;
	public String fiscalResidence;
	public String knowTheBank;
	
	public boolean validateByAdmin;
	
	public boolean compteCourantSuscribe;
	public boolean livretASuscribe;
	public boolean PELSuscribe;
	public boolean cartesSuscribe;
	
	@OneToOne 
	public User user;
	
	
	public CustomerCompteCourant
					(Long customerId,
					Long userId,
					
					String genre, 
					String lastName, 
					String bornName, 
					String suscribeDate,
					String nationality, 
					String whereIsBorn, 
					String familySituation,
					String fiscalResidence,
					String knowTheBank,
					
					boolean validateByAdmin,
					
					boolean compteCourantSuscribe,
					boolean livretASuscribe,
					boolean PELSuscribe,
					boolean cartesSuscribe,
					User user
					) {
		this.customerId = customerId;
		this.userId = userId;
		this.genre = genre;
		this.lastName = lastName;
		this.bornName = bornName;
		this.suscribeDate = suscribeDate;
		this.nationality = nationality;
		this.whereIsBorn = whereIsBorn;
		this.familySituation = familySituation;
		this.fiscalResidence = fiscalResidence;
		this.knowTheBank = knowTheBank;
		this.validateByAdmin = validateByAdmin;
		this.compteCourantSuscribe = compteCourantSuscribe;
		this.livretASuscribe = livretASuscribe;
		this.PELSuscribe = PELSuscribe;
		this.cartesSuscribe = cartesSuscribe;
		this.user = user;
	}
	
	// Cherche un utilisateur avec cet email et ce password
	//public static Customer login(String email, String password) {
     //   return find.where()
       //     .eq("email", email)
         //   .eq("password", password)
         //   .findUnique();
    //}
	//Rechercher l'utilisateur avec ce bornName
	public static CustomerCompteCourant findByName(String lastName) {
       return find.where().eq("lastName", lastName).findUnique();
    }
	
	public static boolean findAlreadyAccount(){
		return find.where().eq("compteCourantSuscribe",true).findUnique() != null;
	}
	
	 
	// public static int findRowCount(Customer custom, String bornName){
	//	 return find.where().eq("bornName", bornName).findRowCount();
	 //}
}
