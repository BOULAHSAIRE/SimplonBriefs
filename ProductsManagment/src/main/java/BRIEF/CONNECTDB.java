package BRIEF;
import java.sql.Connection;
import java.sql.DriverManager; 
public class CONNECTDB {
	
	
	
	public static Connection get_connection() {
		Connection connection=null;
	        String url="jdbc:postgresql://localhost:5432/BRIEF 6";
	        String username="postgres";
	        String password="123456";

	

try { 
	Class.forName("org.postgresql.Driver");
    connection=DriverManager.getConnection(url, username, password);

		

   return connection; 
	
	
} catch(Exception e) {
	System.out.println(e);
}

return null;

}}