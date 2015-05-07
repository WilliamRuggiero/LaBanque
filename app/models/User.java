package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class User extends Model {
	
	public static Finder<Long,User> find = new Finder<Long,User>(Long.class, User.class);
	
	@Id
	public Long userId;
	
	public String name;
	public String firstName;
	
	public User(String name, String firstName) {
		this.name = name;
		this.firstName=firstName;
	}

}
