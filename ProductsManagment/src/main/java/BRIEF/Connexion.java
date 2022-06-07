package BRIEF;
import java.sql.*;


public class Connexion {


    public static void main (String[]args) {
        Connexion sqlConnect=new Connexion();
        System.out.println(sqlConnect.get_connection());
         }


   public Connection get_connection() {
      Connection connection = null;
        String url="jdbc:postgresql://localhost:5432/BRIEF 6";
        String username="postgres";
        String password="123456";

    try{
         Class.forName("org.postgresql.Driver");
          connection=DriverManager.getConnection(url, username, password);
        if(connection!=null) {
            System.out.println("connect");
        }else {
            System.out.println("not connected");
        }
    } catch (Exception e) {
        e.printStackTrace();
           }
    return null;

            }

}


