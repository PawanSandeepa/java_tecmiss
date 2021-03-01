/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import mycode.dbconnect;

/**
 *
 * @author Uddhika
 */
public class Attendence extends javax.swing.JInternalFrame {

        String person="tec006";
    
        PreparedStatement pst=null;
        Connection con=null;
        ResultSet rs=null;
    
    public Attendence() {
        initComponents();
        
        con=dbconnect.connect();
        
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        attsearch = new javax.swing.JButton();
        attsubject = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        attpercentage = new javax.swing.JLabel();

        setTitle("Attendence");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Subject code :");

        attsearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        attsearch.setText("Search");
        attsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attsearchActionPerformed(evt);
            }
        });

        attsubject.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        attsubject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select subject", "OOAD", "Internet application development", "System analysis", "Data structure and algorithms", "Economics", "English" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Attendence");

        attpercentage.setText("percentage");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(attsubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(attsearch))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(attpercentage)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(attsearch)
                    .addComponent(attsubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(attpercentage))
                .addContainerGap(258, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void attsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attsearchActionPerformed
       String subject=attsubject.getSelectedItem().toString();
       String subject_id=null;
        
        try {
            String getscode="select s_code from subject where s_name='"+ subject +"' limit 1";
            pst=con.prepareStatement(getscode);
            rs=pst.executeQuery();  
            
            while(rs.next()){
                subject_id=rs.getString("s_code");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
       
        String getAttendence="select count(a_id) as count from attendance where s_id='"+ person +"' and s_code='"+ subject_id +"'";
        String spresentcount=null;
        try {
            pst=con.prepareStatement(getAttendence);
            rs=pst.executeQuery();
            
            
            while(rs.next()){
                spresentcount=rs.getString("count");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        int presentcount=Integer.parseInt(spresentcount);
        
        String Attendence="select count(a_id) as count from attendence where s_code='"+ subject_id +"'";
        
        String scount=null;
        try {
            pst=con.prepareStatement(getAttendence);
            rs=pst.executeQuery();
            
            
            while(rs.next()){
                scount=rs.getString("count");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        int count=Integer.parseInt(scount);
        float presentage=presentcount/count*100;
        
        String spresentage=String.valueOf(presentage);
        String nspresentage=spresentage+"%";
        
        attpercentage.setText(nspresentage);
            
            
            
    }//GEN-LAST:event_attsearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel attpercentage;
    private javax.swing.JButton attsearch;
    private javax.swing.JComboBox<String> attsubject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
