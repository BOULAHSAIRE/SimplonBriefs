package Brief_6;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import entite.Category;
import entite.Produit;
import main.DAO;

public class ProductDao implements DAO{

	public boolean insert(Produit por) {
		try {
       PreparedStatement stmt = sqlConnect.prepareStatement("INSERT INTO Produit  VALUES (?,?, ?, ? )");
       stmt.setInt(1, por.getId());
       stmt.setString(1,por.getname());
     stmt.setInt(2, por.getPrix());
     stmt.setInt(3, por.getQuantite());
      int i = stmt.executeUpdate();

      if(i == 1) {
	        return true;
    }
      
		  } catch (SQLException e) {
		        e.printStackTrace();
		  }
		return false;



	}

	public boolean update(Produit o) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement stmt = sqlConnect.prepareStatement("Update" + Produit.getname() + 
					" Set  id=? , name=?, Quantite=?, prix=?,  updated_at=now() WHERE id=?");
                            stmt.setInt(1, Produit.getId());
			                    stmt.setString(2, Produit.getname());
						        stmt.setInt(3, Produit.getQuantite());
						        stmt.setInt(4, Produit.getPrix());
					        int i = stmt.executeUpdate();
						      if(i == 1) {
						  	    return true;
						      }
							    stmt.close();
								    sqlConnect.close();

							    } catch (SQLException e) {
						        e.printStackTrace();
							   
		
		
		return false;
	}
		

	public boolean delete(int id) {
		// TODO Auto-generated method stub
		Statement stmt = sqlConnect.createStatement();
    int i = stmt.executeUpdate("DELETE FROM " + Produit.getname() + " WHERE id=" + id);	
	  if(i == 1) {
    return true;
	  }
	    
	}
		return false;
	}
	}