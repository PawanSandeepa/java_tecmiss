 
package Technical_Officer;

import com.mysql.jdbc.Connection;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Update extends javax.swing.JInternalFrame {

    
    
    
        String person = "tec22";
                
 
        Connection con = null;
        PreparedStatement pst = null;
        Statement st=null;
        ResultSet rs = null;
        
 
    
    
    public Update() {
        
        initComponents();
        
        //connect the database...........
        con = dbconnect.connect();
       // System.out.println("connection is ok");
       
       oldpasswordl.setVisible(false);
       oldpassword.setVisible(false);
       newpasswordl.setVisible(false);
       newpassword.setVisible(false);
       rnewpasswordl.setVisible(false);
       rnewpassword.setVisible(false);
       cpasswordbutton.setVisible(false);
       statechange.setVisible(false);
       
        detailload();
        
    }

    public void detailload(){
        
         String sql = "SELECT * FROM technical_officer WHERE tec_id = '"+ person +"' limit 1";
        try {
            
            
                //System.out.println("inside detail");
             pst=con.prepareStatement(sql);
            //st=con.createStatement();
            //pst = con.createStatement();
            
            //System.out.println("under the statement");
            
            rs = pst.executeQuery();
            //rs = st.executeQuery(sql);

            
            
           // System.out.println(sql);
            while(rs.next()){
                String getid = rs.getString("to_id");
                String getdepartment = rs.getString("d_id");
                String name = rs.getString("to_name");
                String contact = rs.getString("to_contact");
                

                 id.setText(getid);
                 tecname.setText(name);
                 teccontact.setText(contact);
                 department.setText(getdepartment);
            }
            
            String url="/profilepic/"+person+".png";
            /*ImageIcon profile=new ImageIcon("../profilepic/252.png");
            profilepic.setIcon(profile);
            */
            
            profilepic.setIcon(new javax.swing.ImageIcon(getClass().getResource(url))); // NOI18N
            
            
            
             
        } catch (Exception e) {
            System.out.println(e);
        }
                
    }
    
    public static String md5(String pwd){
        
        String md5=null;
        if(null==pwd)
            return null;
        
        try {
            MessageDigest digest=MessageDigest.getInstance("MD5");
            digest.update(pwd.getBytes(),0,pwd.length());
            md5=new BigInteger(1,digest.digest()).toString(16);
            
            
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        return md5;
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tecnamelable = new javax.swing.JLabel();
        idlable = new javax.swing.JLabel();
        contactlable = new javax.swing.JLabel();
        departmentlable = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        teccontact = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        tecname = new javax.swing.JLabel();
        profilepic = new javax.swing.JLabel();
        department = new javax.swing.JLabel();
        rnewpassword = new javax.swing.JTextField();
        statechange = new javax.swing.JLabel();
        rnewpasswordl = new javax.swing.JLabel();
        newpasswordl = new javax.swing.JLabel();
        newpassword = new javax.swing.JTextField();
        oldpasswordl = new javax.swing.JLabel();
        oldpassword = new javax.swing.JTextField();
        passwordbutton = new javax.swing.JButton();
        cpasswordbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Update");
        setPreferredSize(new java.awt.Dimension(891, 514));
        getContentPane().setLayout(null);

        tecnamelable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tecnamelable.setForeground(new java.awt.Color(255, 255, 255));
        tecnamelable.setText("Name");
        getContentPane().add(tecnamelable);
        tecnamelable.setBounds(40, 70, 45, 22);

        idlable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        idlable.setForeground(new java.awt.Color(255, 255, 255));
        idlable.setText("Your ID");
        getContentPane().add(idlable);
        idlable.setBounds(40, 20, 61, 22);

        contactlable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        contactlable.setForeground(new java.awt.Color(255, 255, 255));
        contactlable.setText("Contact no.");
        getContentPane().add(contactlable);
        contactlable.setBounds(40, 170, 91, 22);

        departmentlable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        departmentlable.setForeground(new java.awt.Color(255, 255, 255));
        departmentlable.setText("Department");
        getContentPane().add(departmentlable);
        departmentlable.setBounds(40, 120, 92, 22);

        update.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(100, 390, 105, 31);

        teccontact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(teccontact);
        teccontact.setBounds(250, 170, 246, 28);

        id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setText("Your ID");
        getContentPane().add(id);
        id.setBounds(250, 20, 246, 22);

        tecname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tecname.setForeground(new java.awt.Color(255, 255, 255));
        tecname.setText("Name");
        getContentPane().add(tecname);
        tecname.setBounds(250, 70, 250, 22);
        getContentPane().add(profilepic);
        profilepic.setBounds(600, 20, 250, 250);

        department.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        department.setForeground(new java.awt.Color(255, 255, 255));
        department.setText("Department");
        getContentPane().add(department);
        department.setBounds(250, 120, 240, 22);

        rnewpassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(rnewpassword);
        rnewpassword.setBounds(250, 330, 246, 28);

        statechange.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        statechange.setForeground(new java.awt.Color(255, 255, 255));
        statechange.setText("re-enter new password");
        getContentPane().add(statechange);
        statechange.setBounds(570, 390, 280, 22);

        rnewpasswordl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rnewpasswordl.setForeground(new java.awt.Color(255, 255, 255));
        rnewpasswordl.setText("re-enter new password");
        getContentPane().add(rnewpasswordl);
        rnewpasswordl.setBounds(40, 330, 200, 22);

        newpasswordl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        newpasswordl.setForeground(new java.awt.Color(255, 255, 255));
        newpasswordl.setText("new password");
        getContentPane().add(newpasswordl);
        newpasswordl.setBounds(40, 280, 130, 22);

        newpassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(newpassword);
        newpassword.setBounds(250, 280, 246, 28);

        oldpasswordl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        oldpasswordl.setForeground(new java.awt.Color(255, 255, 255));
        oldpasswordl.setText("old password");
        getContentPane().add(oldpasswordl);
        oldpasswordl.setBounds(40, 230, 130, 22);

        oldpassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(oldpassword);
        oldpassword.setBounds(250, 230, 246, 28);

        passwordbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordbutton.setText("password");
        passwordbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(passwordbutton);
        passwordbutton.setBounds(250, 390, 180, 31);

        cpasswordbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cpasswordbutton.setText("change password");
        cpasswordbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpasswordbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(cpasswordbutton);
        cpasswordbutton.setBounds(250, 390, 180, 31);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Technical_Officer/light-blue-abstract-wallpaper-19.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 880, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        
        int answer=JOptionPane.showConfirmDialog(null, "Do you realy wand update");
        
        if(answer==0){
        
            String contact=teccontact.getText();

            String update="update technical_officer set to_contact='"+ contact +"' where to_id = '"+ person +"' limit 1";

            try {
                pst=con.prepareStatement(update);
                pst.execute();
            } catch (Exception e) {
                System.out.println(e);
            }
        
        
        }
    }//GEN-LAST:event_updateActionPerformed

    private void passwordbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordbuttonActionPerformed
       oldpasswordl.setVisible(true);
       oldpassword.setVisible(true);
       newpasswordl.setVisible(true);
       newpassword.setVisible(true);
       rnewpasswordl.setVisible(true);
       rnewpassword.setVisible(true);
       cpasswordbutton.setVisible(true);
       passwordbutton.setVisible(false);
       //statechange.setVisible(true);
       
       
       
       
       
    }//GEN-LAST:event_passwordbuttonActionPerformed

    private void cpasswordbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpasswordbuttonActionPerformed
        
       oldpasswordl.setVisible(false);
       oldpassword.setVisible(false);
       newpasswordl.setVisible(false);
       newpassword.setVisible(false);
       rnewpasswordl.setVisible(false);
       rnewpassword.setVisible(false);
       cpasswordbutton.setVisible(false);
       passwordbutton.setVisible(true);
       statechange.setVisible(true);
        
       String oldpwd=oldpassword.getText();
       String mdoldpwd=md5(oldpwd);
       
       String newpwd=newpassword.getText();
       String mdnewpwd=md5(newpwd);
       
       String rnewpwd=rnewpassword.getText();
       //String mdrnewpwd=md5(rnewpwd);
       
       
       String getoldsql="select * from technical_officer where to_id='"+ person +"'";
        try {
            pst=con.prepareStatement(getoldsql);
            rs=pst.executeQuery();
            String getold=null;
            while(rs.next()){
                //System.out.println("while loop");
                getold = rs.getString("password");
                
            }
            if(getold.equals(mdoldpwd)){
                //check passwords are mach...
                if(newpwd.equals(rnewpwd)){
                    //do change password process.......
                    String setpwd="update technical_officer set password='"+ mdnewpwd +"' where to_id='"+ person +"' limit 1";
                    pst=con.prepareStatement(setpwd);
                    pst.execute();
                    
                    statechange.setText("password is changed...");
                    
                    oldpassword.setText("");
                    newpassword.setText("");
                    rnewpassword.setText("");
                    
                }else{
                    statechange.setText("passwords are note mach...");
                }
                
                
            }else{
                statechange.setText("old password is wrong...");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }//GEN-LAST:event_cpasswordbuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contactlable;
    private javax.swing.JButton cpasswordbutton;
    private javax.swing.JLabel department;
    private javax.swing.JLabel departmentlable;
    private javax.swing.JLabel id;
    private javax.swing.JLabel idlable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField newpassword;
    private javax.swing.JLabel newpasswordl;
    private javax.swing.JTextField oldpassword;
    private javax.swing.JLabel oldpasswordl;
    private javax.swing.JButton passwordbutton;
    private javax.swing.JLabel profilepic;
    private javax.swing.JTextField rnewpassword;
    private javax.swing.JLabel rnewpasswordl;
    private javax.swing.JLabel statechange;
    private javax.swing.JTextField teccontact;
    private javax.swing.JLabel tecname;
    private javax.swing.JLabel tecnamelable;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
