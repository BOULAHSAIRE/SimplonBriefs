package Brief_6;
import java.sql.Connection;
import BRIEF.CONNECTDB;
import brief6.ProductsManagment.Produit;
import brief6.ProductsManagment.category.Category;
public interface DAO {
	Connection connection= CONNECTDB.get_connection();
	
	//type of class 
		//create PProduit  
		public  boolean insert( Produit produit  );
		//create PProduit 
		 public boolean insert( Category  category  );
		
        //UPDATE 
	public boolean updateProduit(Produit Produit ); 
	  //UPDATE
	public boolean updateCategorie(Category category ); 
	//DELETE
	public boolean deleteproduit(int id );
	//DELETE
	public boolean deletecategorie(int id);
}
