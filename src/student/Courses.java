/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import mycode.dbconnect;

/**
 *
 * @author Uddhika
 */
public class Courses extends javax.swing.JInternalFrame {

        String person="stu006";
    
        PreparedStatement pst=null;
        Connection con=null;
        ResultSet rs=null;
    
    public Courses() {
        initComponents();
        
        con=dbconnect.connect();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        courseidl = new javax.swing.JLabel();
        depnamel = new javax.swing.JLabel();
        coursecoordinatorl = new javax.swing.JLabel();
        attsearch = new javax.swing.JButton();
        csubject = new javax.swing.JComboBox<>();

        setTitle("Courses");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Course ID :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Course name :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Department name :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Course coordinator :");

        courseidl.setText("courseid");

        depnamel.setText("courseid");

        coursecoordinatorl.setText("courseid");

        attsearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        attsearch.setText("Search");
        attsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attsearchActionPerformed(evt);
            }
        });

        csubject.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        csubject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select subject", "OOAD", "Internet application development", "System analysis", "Data structure and algorithms", "Economics", "English" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(coursecoordinatorl)
                            .addComponent(depnamel)
                            .addComponent(courseidl)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(csubject, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(attsearch)))
                .addContainerGap(245, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(attsearch)
                        .addComponent(csubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(courseidl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(depnamel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(coursecoordinatorl))
                .addContainerGap(280, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void attsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attsearchActionPerformed
        String subject=csubject.getSelectedItem().toString();
        
        String details="select * from subject where s_name='"+ subject +"'";
         try {
            pst=con.prepareStatement(details);
            rs=pst.executeQuery();
            
        String courseid=null;
        
        String depname=null;    
        String coursecoordinator=null;
        
        while(rs.next()){
        
            courseid=rs.getString("s_code");
           
            depname=rs.getString("dep_name");
            coursecoordinator=rs.getString("lecture_id");
            
                }
        
            courseidl.setText(courseid);
           
            depnamel.setText(depname);
            coursecoordinatorl.setText(coursecoordinator);                 
                        
        
        } catch (Exception e) {
        }
    }//GEN-LAST:event_attsearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attsearch;
    private javax.swing.JLabel coursecoordinatorl;
    private javax.swing.JLabel courseidl;
    private javax.swing.JComboBox<String> csubject;
    private javax.swing.JLabel depnamel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
