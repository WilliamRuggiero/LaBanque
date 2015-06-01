package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import play.db.ebean.Model;
import models.User;

@Entity
public class Customer extends Model {
	
	public static Finder<Long,Customer> find = new Finder<Long,Customer>(Long.class, Customer.class);
	
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
	
	public Customer(Long customerId,
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
					boolean validateByAdmin
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
		this.validateByAdmin = validateByAdmin; }
	
	// Cherche un utilisateur avec cet email et ce password
	//public static Customer login(String email, String password) {
     //   return find.where()
       //     .eq("email", email)
         //   .eq("password", password)
         //   .findUnique();
    //}
	//Rechercher l'utilisateur avec ce bornName
	public static Customer findByName(String lastName) {
       return find.where().eq("lastName", lastName).findUnique();
    }
	 
	// public static int findRowCount(Customer custom, String bornName){
	//	 return find.where().eq("bornName", bornName).findRowCount();
	 //}
}
