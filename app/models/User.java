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
	public String password1;
	public String password2;
	public String Telephone;
	
	public User(String lastName, String firstName, String email, String password1, String password2, String Telephone) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.email  = email;
		this.password1 = password1;
		this.password2 = password2;
		this.Telephone = Telephone;
	}

}
