/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dell
 */
public class dbconnect {
    public static Connection connect(){
        Connection conn=null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        }
         catch(Exception e){
        System.out.println(e);
    }
        return conn; 
}
public static void main(String[] args){
    System.out.println(connect());
}
}