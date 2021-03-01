package lecturer;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
   
/**
 *
 * @author Dell
 */

public class dbCon {
   public Connection con;
    public Statement st;
    public ResultSet resultset;
    private String sql;
    PreparedStatement pre_Sta;
 
 
    public void getConnection() {
        try {        
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
            st = con.createStatement();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(dbCon.class.getName()).log(Level.SEVERE, null, ex);
        }

          
    }
    
    
     public void setSql(String str){
        try {
            resultset=st.executeQuery(str);
        } catch (SQLException ex) {
            Logger.getLogger(dbCon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     public void setSqlVW(String str){
        try {
            st.execute(str);
        } catch (SQLException ex) {
            Logger.getLogger(dbCon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    public void qExeInsert(String sql){
        try {
                st.executeUpdate(sql);
        } catch (SQLException ex) {
                Logger.getLogger(dbCon.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void qExeUpdate(String sql){
        try {
                st.executeUpdate(sql);
        } catch (SQLException ex) {
                Logger.getLogger(dbCon.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void qExeDelete(String sql){
        try {
                st.executeUpdate(sql);
        } catch (SQLException ex) {
                Logger.getLogger(dbCon.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     
    public ResultSet getResultSet(){    
        
        return resultset;   
    }
    

}
