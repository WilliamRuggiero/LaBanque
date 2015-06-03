package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import play.data.validation.Constraints;
import play.db.ebean.Model;
import org.mindrot.jbcrypt.BCrypt;

@Entity
public class User extends Model {
	
	public static Finder<Long,User> find = new Finder<Long,User>(Long.class, User.class);
	
	@Id
	public Long userId;
	public String firstName;
	public String lastName;
	public String email;
	public String telephone;
	public String passwordHash;
	public String releveIdentiteBancaire;
	public String sex;
	public boolean isAdmin;
	
	public User(Long userId,String firstName, String lastName,  String email, String telephone, String passwordHash,  String releveIdentiteBancaire, String sex, boolean isAdmin) {
		this.userId = userId;
		this.lastName = lastName;
		this.firstName = firstName;
		this.email  = email;
		this.passwordHash = passwordHash;
		this.telephone = telephone;
		this.releveIdentiteBancaire = releveIdentiteBancaire;
		this.sex = sex;
		this.isAdmin = isAdmin;
	}
	
	// Cherche un utilisateur avec cet email et ce password
	public static User login(String email, String password) {
        User user = User.find.where()
            .eq("email", email)
            .findUnique();
        if (user != null && BCrypt.checkpw(password, user.passwordHash)) {
              return user;
            } 
        else {
             return null;           }
    }
	//Rechercher l'utilisateur avec cet Email
	 public static User findByEmail(String email) {
         return find.where().eq("email", email).findUnique();
     }
	 
	 
	 public static int findRowCount(User u, String email){
		 return find.where().eq("email", email).findRowCount();
	 }
	 
	 
	 
}
