package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import play.db.ebean.Model;

@Entity
public class CustomerDocuments extends Model {
	
	public static Finder<Long,CustomerDocuments> find = new Finder<Long,CustomerDocuments>(Long.class, CustomerDocuments.class);
	
	@Id
	public Long uploadId;
	
	public String identite;
	
	@OneToOne
	public User user;
	
	
	public CustomerDocuments
					(Long uploadId,
					String identite,
					
					User user
					) {
		this.uploadId = uploadId;
		this.identite = identite;
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
	public static CustomerDocuments findByName(String lastName) {
       return find.where().eq("lastName", lastName).findUnique();
    }
	
	public static boolean findAlreadyAccount(Long id){
		return find.where().eq("compteCourantSuscribe",true).eq("userId", id).findUnique() != null;
	}
	
	 
	// public static int findRowCount(Customer custom, String bornName){
	//	 return find.where().eq("bornName", bornName).findRowCount();
	 //}
}
