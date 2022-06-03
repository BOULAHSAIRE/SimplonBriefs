package simplon.co.simplon.brief5;
public class Etudiante {

		private int id  ;
		private String Prenom ;
		private String Nom;
		private String email;
		private String Adresse;
		private String Ville;
		private String Pays ;
		

		    public static String tableEtud="Etudiante";
		    public Etudiante() {
		    }
		    public Etudiante(String Nom, String Prenom, String email,String Adresse, String Ville, String Pays) {
		    
		    		this.email = email;
		    		this.Nom  = Nom;
		    		this.Prenom = Prenom;
		    		this.Adresse = Adresse;
		    		this.Ville = Ville;
		    		this.Pays = Pays;

		    	}
		    public Etudiante(int id, String Nom, String Prenom, String email, String adresse, String Ville,
	    			String Pays ) {
	    		this.id = id;
	    		this.email = email;
	    		this.Nom = Nom;
	    		this.Prenom = Prenom;
	    		this.Adresse = adresse;
	    		this.Ville = Ville;
	    		this.Pays = Pays;
	    		
	    	}
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getPrenom() {
				return Prenom;
			}
			public void setPrenom(String prenom) {
				Prenom = prenom;
			}
			public String getNom() {
				return Nom;
			}
			public void setNom(String nom) {
				Nom = nom;
			}
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			public String getAdresse() {
				return Adresse;
			}
			public void setAdresse(String adresse) {
				Adresse = adresse;
			}
			public String getVille() {
				return Ville;
			}
			public void setVille(String ville) {
				Ville = ville;
			}
			public String getPays() {
				return Pays;
			}
			public void setPays(String pays) {
				Pays = pays;
			}
			@Override
			public String toString() {
				return "Etudiante [id=" + id + ", Prenom=" + Prenom + ", Nom=" + Nom + ", email=" + email + ", Adresse="
						+ Adresse + ", Ville=" + Ville + ", Pays=" + Pays + "]";
			}
		
		
			
			}

