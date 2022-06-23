package DsAppl;
public class Candidat {
	 private int  Id;
	 private String FirstName;
	 private String LastName;
	 private String Email;
	 private String Adresse;
	 private String City;
	 private String Country;
	public Candidat(int id, String firstName, String lastName, String email, String adresse, String city,
			String country) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		Adresse = adresse;
		City = city;
		Country = country;
	
		
	
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public boolean delete(int id2) {
		return false;	
	}
	}