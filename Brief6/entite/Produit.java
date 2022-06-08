package entite;
public class Produit {
	 private static int id ;
	  private static String name;
			   private static int Quantite;
			   private static int prix;
			  
			
			   public Produit(int id ,String name,int Quantite, int prix ){
				   this.id=id;
				   this.name = name;
			      this.Quantite =Quantite;
			      this.prix =prix;
			   }


		
			public static int getId() {
				return id;
			}



			public static void setId(int id) {
				Produit.id = id;
			}



			public static String getname() {
				return name;
			}

			public static void setname(String name) {
				Produit.name = name;
			}

			public static int getQuantite() {
				return Quantite;
			}

			public static void setQuantite(int quantite) {
				Quantite = quantite;
			}

			public static int getPrix() {
				return prix;
			}

			public static void setPrix(int prix) {
				Produit.prix = prix;
			}

			
			
			
	}

			 
