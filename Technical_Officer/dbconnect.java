
package Technical_Officer;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

import java.sql.*;
import javax.swing.*;

public class dbconnect {
    
    public static Connection connect(){
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
            //System.out.println("database is connectd");
            
        } catch (Exception e) {
            System.out.println(e);
        }
    return con;
    }
    
}
