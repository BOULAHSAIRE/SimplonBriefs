<<<<<<< HEAD
package brief6.ProductsManagment;

public class User {
	  private int id;
     private String name ;
     private String email;
     private String password;
     
     
     
     User(int id ,String name,String email, String password){
		   this.name = name;
	      this.email = email;
	      this.password = password;
	   }

     public  int getid() {
 		return id;
 	}
 	public void setid(int id) {
 		this.id = id;
 	}
     
	public  String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public  String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}






}
=======
package brief6.ProductsManagment;

public class User {
	  private int id;
     private String name ;
     private String email;
     private String password;
     
     
     
     User(int id ,String name,String email, String password){
		   this.name = name;
	      this.email = email;
	      this.password = password;
	   }

     public  int getid() {
 		return id;
 	}
 	public void setid(int id) {
 		this.id = id;
 	}
     
	public  String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public  String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}






}
>>>>>>> 5015d25f1214c251e600690e4bff5cf74461f5f9
