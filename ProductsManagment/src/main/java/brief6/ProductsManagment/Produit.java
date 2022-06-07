package brief6.ProductsManagment;
public class Produit {
               private static int id ;
			   private static String name;
			   private static String Quantite;
			   private static int prix;
			  
			
			   Produit(int id ,String name,String Quantite, int prix ){
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

			public static String getQuantite() {
				return Quantite;
			}

			public static void setQuantite(String quantite) {
				Quantite = quantite;
			}

			public static int getPrix() {
				return prix;
			}

			public static void setPrix(int prix) {
				Produit.prix = prix;
			}

			
			
			
			
			
			public static int getcategory_id() {
				// TODO Auto-generated method stub
				return 0;
			}
	}

			 
