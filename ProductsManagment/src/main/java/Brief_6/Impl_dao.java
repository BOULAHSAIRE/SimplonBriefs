package Brief_6;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import BRIEF.Connexion;
import brief6.ProductsManagment.Produit;
import brief6.ProductsManagment.category;
import brief6.ProductsManagment.category.Category;

   public class Impl_dao  implements DAO {
       Connexion sqlConnect=new Connexion();
       public Impl_dao(int id,String name) {
       }
       
        
	    @Override
	  //insert Category 
	    public boolean insert(Category category ) {
  		// TODO Auto-generated method stub
	        @SuppressWarnings("unused")
			Connexion sqlConnect=new Connexion();

	     	try {
	        PreparedStatement stmt = connection.prepareStatement("INSERT INTO " +category.getId()+ category.getArticle() + " (Id,Article) VALUES (?,?)");
		        stmt.setInt(1, category.getId());
                stmt.setString(2, category.getArticle());
	        int i = stmt.executeUpdate();
	      if(i == 1) {
	        return true;
	      }
		    stmt.close();
		    connection.close();

	    } 
	     	catch (SQLException e) {
	        e.printStackTrace();
	    }
	    
	    return false;
	    }
	  
	     @Override
	    //insert PProduit 
	      public boolean insert(Produit produit) {
		  		// TODO Auto-generated method stub
		  		  try {
		  	        PreparedStatement stmt = connection.prepareStatement("INSERT INTO " + Produit.getname() + " ( name, Quantite, prix,  category_id) VALUES (?, ?, ?, ?)");
				        stmt.setInt(1, Produit.getId());
	                stmt.setString(2, Produit.getname());
		  	        stmt.setInt(3, Produit.getPrix());
		  	        stmt.setString(4, Produit.getQuantite());
		  	        stmt.setInt(5, Produit.getcategory_id());

		  	        int i = stmt.executeUpdate();

		  	      if(i == 1) {
		  	        return true;
		  	      }
		  	      
		  		  } catch (SQLException e) {
		  		        e.printStackTrace();
		  		    }

		  		return false;
		  	
		 }
	 @Override
	 public boolean updateCategorie(Category category) {
	 	// TODO Auto-generated method stub
		 try {
		        PreparedStatement stmt = connection.prepareStatement("UPDATE " + category.getArticle() + " SET id=?, Article=?,  updated_at=NOW() WHERE id=?");
		        stmt.setInt(1, category.getId());
             stmt.setString(2, category.getArticle() );
		        stmt.setInt(3, category.getId());

		        int i = stmt.executeUpdate();
		      if(i == 1) {
		  	    return true;
		      }
			    stmt.close();
			    connection.close();

		    } catch (SQLException e) {
		        e.printStackTrace();				

		    }
	return false;
	 }
		@Override
		public boolean updateProduit(Produit Produit) {
			// TODO Auto-generated method stub
			try {
				PreparedStatement stmt = connection.prepareStatement("Update" + Produit.getname() + " Set  id=? , name=?, Quantite=?, prix=?, category_id=?, updated_at=now() WHERE id=?");
				stmt.setString(1, Produit.getname());
							        stmt.setInt(1, Produit.getId());
							        stmt.setString(2, Produit.getQuantite());
							        stmt.setInt(3, Produit.getPrix());
							        stmt.setInt(4, Produit.getcategory_id());

							        int i = stmt.executeUpdate();
								      if(i == 1) {
								  	    return true;
								      }
									    stmt.close();
									    connection.close();

								    } catch (SQLException ex) {
								        ex.printStackTrace();
								    }

								    return false;
				 		 }
					
		  
		
		 @Override
			//delete category 
		    	public boolean deletecategorie(int id) {
				// TODO Auto-generated method stub
			 try {
			        Statement stmt = connection.createStatement();
			        int i = 0;
					try {
						i = stmt.executeUpdate("DELETE FROM " + category.getarticle() + " WHERE id=" + id);
					} catch (Exception e) {
						// TODO Auto-generated  block
						e.printStackTrace();
					}

			      if(i == 1) {
			        return true;
			      }
				    stmt.close();
				    connection.close();

			    } catch (SQLException e) {
			        e.printStackTrace();
			}
			
			 
				return false;
			}
			

	
		@Override
		public boolean deleteProduit(int id) {
			// TODO Auto-generated method stub
			 try {
			        Statement stmt = connection.createStatement();
			        int i = stmt.executeUpdate("DELETE FROM " + Produit.getname() + " WHERE id=" + id);

			      if(i == 1) {
			        return true;
			      }
				    stmt.close();
				    connection.close();

			    } catch (SQLException e) {
			        e.printStackTrace();
			
			return false;
		}
			return false;
   }
		}