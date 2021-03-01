
package student;

import mycode.*;
import java.sql.Connection;
import java.sql.DriverManager;


public class dbconnect {
    
    public static Connection connect(){
        Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return con;
    }
    
}
