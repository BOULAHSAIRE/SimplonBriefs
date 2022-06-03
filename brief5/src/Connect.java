package simplon.co.simplon.brief5;
import java.sql.*;
public class Connect {
	public static  Connection connect;
    public static String driver="org.postgresql.Driver";
    public static String url="jdbc:postgresql://localhost:5432/postgres";
    public static String username="postgres";
    public static String password="123456";

	   public Connection get_connection() {
		   try{ 
		         Class.forName(driver);
				 return DriverManager.getConnection(url, username, password );

			 }catch(SQLException | ClassNotFoundException e){
				 e.printStackTrace();
		         System.out.println("Error Opning DB!");
				 
			 }
			 return null;

	
	}
	   
}
	    
	    










	





	




