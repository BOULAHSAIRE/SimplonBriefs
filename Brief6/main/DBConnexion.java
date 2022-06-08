package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnexion {


	 
	 public static Connection getConnection() {
         String driver="org.postgresql.Driver";

        String url="jdbc:postgresql://localhost:5432/BRIEF 6";
        String username="postgres";
        String password="123456";
		 
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


