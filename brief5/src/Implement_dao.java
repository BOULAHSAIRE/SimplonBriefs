package simplon.co.simplon.brief5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;;

@SuppressWarnings({ "rawtypes", "unused" })
public class Implement_dao implements Dao_etudiant {

	Connection cn =  new Connect().get_connection();
		
		public Implement_dao(int id,String Nom, String Prenom, String email,String Adresse, String Ville, String Pays) {
		}

		public Implement_dao() {
			
		}
		@Override
	public boolean insertEtudiante(Etudiante Etud) {
		try {
			
			Connection cn =  new Connect().get_connection();
		
           String sql ="insert into etudiant (id,prenom,nom,email,adress,ville,pays) values (?,?,?,?,?,?,?)";
		      PreparedStatement PS = cn.prepareStatement(sql);
		    		 
		      PS.setInt(1, Etud.getId());
				PS.setString(2, Etud.getPrenom());
		        PS.setString(3, Etud.getNom());
		        PS.setString(4, Etud.getEmail());
		        PS.setString(5, Etud.getAdresse());
		        PS.setString(6, Etud.getVille());
		        PS.setString(7, Etud.getPays());
			        int i = PS.executeUpdate();
                    if(i ==  1) {
        				return true;	
                    }
			        
		}catch(Exception e ) {
			System.out.println(e);
		}
		return false;
	}	
	
	
	@Override
       public boolean  UpdateEtudiante  (int id, Etudiante Etud) {
	   Connection cn =  new Connect().get_connection();
	    try {
           String sql =("Update etudiant SET id=?, prenom=?,nom=?, email =?,adress=?,ville=?,pays=? WHERE id="+id);
		      PreparedStatement rs = cn.prepareStatement(sql);
		      rs.setInt(1, Etud.getId());
		      rs.setString(2, Etud.getPrenom());
		      rs.setString(3, Etud.getNom());
		      rs.setString(4, Etud.getEmail());
		      rs.setString(5, Etud.getAdresse());
		      rs.setString(6, Etud.getVille());
		      rs.setString(7, Etud.getPays());
           
		      int i = rs.executeUpdate();
		      if(i == 1) {
		  	    return true;
		      }
			   

		    } catch (Exception e) {
            System.out.println(e);    }

		    return false;
		}



@Override
public boolean deleteEtudiante(int id ,Etudiante Etud) {
	 Connection cn =  new Connect().get_connection();

	    try {
	    	String sql =("DELETE FROM Etudiant id=?, prenom=?,nom=?, email =?,adress=?,ville=?,pays=? WHERE id="+id);
		      PreparedStatement stm= cn.prepareStatement(sql);
	    	  stm.setInt(1, Etud.getId());
		      stm.setString(2, Etud.getPrenom());
		      stm.setString(3, Etud.getNom());
		      stm.setString(4, Etud.getEmail());
		      stm.setString(5, Etud.getAdresse());
		      stm.setString(6, Etud.getVille());
		      stm.setString(7, Etud.getPays());
      
	    
	        int i = stm.executeUpdate();
	       if(i == 1) {
	        return true;
	      }
	    }catch(Exception e) {
			   System.out.println(e);
		   }
	     return false;
      }	




}


