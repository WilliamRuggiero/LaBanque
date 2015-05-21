package models;

import javax.persistence.Entity;
import javax.persistence.Id;


import play.db.ebean.Model;

@Entity
public class User extends Model {
	
	public static Finder<Long,User> find = new Finder<Long,User>(Long.class, User.class);
	
	@Id
	public Long userId;
	
	public String lastName;
	public String firstName;
	public String email;
	public String password;
	public String telephone;
	public String releveIdentiteBancaire;
	public String sex;
	
	public User(Long userId, String lastName, String firstName, String email, String password, String telephone, String releveIdentiteBancaire, String sex) {
		this.userId = userId;
		this.lastName = lastName;
		this.firstName = firstName;
		this.email  = email;
		this.password = password;
		this.telephone = telephone;
		this.releveIdentiteBancaire = releveIdentiteBancaire;
		this.sex = sex;
	}

}
