package application;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ConBD {
		
		public static  ConBD connect;
	    public static String driver="org.postgresql.Driver";
	    public static String url="jdbc:postgresql://localhost:5432/postgres";
	    public static String username="postgres";
	    public static String password="123456";

		   public ConBD get_connection() {
			   try{ 
			         Class.forName(driver);
					 return (ConBD) DriverManager .getConnection(url, username, password );
                   }catch (SQLException | ClassNotFoundException e ){
				  e .printStackTrace();
			         System.out.println("Error Opning DB!");
					 
				 }
				 return null;
		    
		    
		   }

		public static PreparedStatement prepareStatement(String sql) {
			// TODO Auto-generated method stub
			return null;
		}

	
}
