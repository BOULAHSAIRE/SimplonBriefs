package Brief_6;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import entite.Category;
import main.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CategroyDao implements DAO<Category>{

	@Override
	public boolean insert(Category cat) {
		try {
		// TODO Auto-generated method stub
		 PreparedStatement stmt = sqlConnect.prepareStatement("INSERT INTO category VALUES (?,?)");
       stmt.setInt(1, cat.getId());
        stmt.setString(2, cat.getArticle());
    int i = stmt.executeUpdate();
  if(i == 1) {
 	  System.out.println("Insertion category reussie");
     return true;
   }
  stmt.close();
  sqlConnect.close();

} catch (SQLException e) {
e.printStackTrace();
}
		return false;
	}
  

@Override
	public boolean update(Category cat) {
		// TODO Auto-generated method stub
	try {
		 String sql = "update category set"
	        		+ "id ="+cat.getId()
	        		+ "article '"+cat.getArticle()
	        		+" where id="+cat.getId();
		 System.out.println(sql);
	        PreparedStatement stmt = sqlConnect.prepareStatement(sql);
	        stmt.executeUpdate();
	        if(stmt.executeUpdate()==1)
	        System.out.println(stmt.executeUpdate());
	       return true;
	       
	       
	    } catch (Exception e) {
	        System.out.println(e.getMessage());				
	      
	}
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		 try {
		        Statement stmt = sqlConnect.createStatement();
	        int i = 0;
				try {
					i = stmt.executeUpdate("DELETE * FROM category  WHERE idarticle=" + id);
				} catch (Exception e) {
				// TODO Auto-generated  block
				e.printStackTrace();
				}

	      if(i == 1) {
		        return true;
	      }
		    stmt.close();
			    sqlConnect.close();

		    } catch (SQLException e) {
	        e.printStackTrace();
		}
		

		return false;
	}

	@Override
	public Category findById(int id) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from category where id ="+id;
			PreparedStatement stmt = sqlConnect.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				System.out.println("La categorie ayant l'id "+id +" s'appelle "+rs.getString("article"));
				return new Category (rs.getInt("id"), rs.getString("article"));
			}
	} catch (Exception e) {
		System.out.println(e);
		}

		return null;
	}
}