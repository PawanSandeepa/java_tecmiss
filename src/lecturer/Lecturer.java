/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturer;

/**
 *
 * @author Dell
 */
public class Lecturer extends javax.swing.JFrame {

    /**
     * Creates new form Lecturer
     */
    
   
    public Lecturer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jstudentmarks = new javax.swing.JButton();
        jLecture = new javax.swing.JLabel();
        jLecViews = new javax.swing.JDesktopPane();
        jUpdate = new javax.swing.JButton();
        jmodify = new javax.swing.JButton();
        jupload = new javax.swing.JButton();
        jstudent = new javax.swing.JButton();
        jeligibility = new javax.swing.JButton();
        btnAttendance = new javax.swing.JButton();
        btnAttendance1 = new javax.swing.JButton();
        btnGPA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jstudentmarks.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jstudentmarks.setText("Student marks");
        jstudentmarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jstudentmarksActionPerformed(evt);
            }
        });

        jLecture.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLecture.setText(" Lecture");

        jLecViews.setPreferredSize(new java.awt.Dimension(891, 514));

        javax.swing.GroupLayout jLecViewsLayout = new javax.swing.GroupLayout(jLecViews);
        jLecViews.setLayout(jLecViewsLayout);
        jLecViewsLayout.setHorizontalGroup(
            jLecViewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 898, Short.MAX_VALUE)
        );
        jLecViewsLayout.setVerticalGroup(
            jLecViewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );

        jUpdate.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jUpdate.setText("My Profile");
        jUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateActionPerformed(evt);
            }
        });

        jmodify.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jmodify.setText("Courses");
        jmodify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmodifyActionPerformed(evt);
            }
        });

        jupload.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jupload.setText("Upload marks");
        jupload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juploadActionPerformed(evt);
            }
        });

        jstudent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jstudent.setText("Student details");
        jstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jstudentActionPerformed(evt);
            }
        });

        jeligibility.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jeligibility.setText("Student eligibility");
        jeligibility.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jeligibilityActionPerformed(evt);
            }
        });

        btnAttendance.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAttendance.setText("Stndt Attndnce");
        btnAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttendanceActionPerformed(evt);
            }
        });

        btnAttendance1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAttendance1.setText("Student Medical");
        btnAttendance1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttendance1ActionPerformed(evt);
            }
        });

        btnGPA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGPA.setText("Student GPA");
        btnGPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGPAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 541, Short.MAX_VALUE)
                .addComponent(jLecture, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239)
                .addComponent(jUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnGPA, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(btnAttendance1, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(btnAttendance, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(jstudent, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(jupload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jmodify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jstudentmarks, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jeligibility, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(986, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(261, Short.MAX_VALUE)
                    .addComponent(jLecViews, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLecture, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(jmodify, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jupload, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jstudent, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jstudentmarks, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jeligibility, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAttendance1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(83, 83, 83)
                    .addComponent(jLecViews, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                    .addGap(22, 22, 22)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jstudentmarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jstudentmarksActionPerformed
        MarksAndGPA mag = new MarksAndGPA();
        jLecViews.add(mag).setVisible(true);
    }//GEN-LAST:event_jstudentmarksActionPerformed

    private void jUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateActionPerformed
        Update up = new Update();
        jLecViews.add(up).setVisible(true);
    }//GEN-LAST:event_jUpdateActionPerformed

    private void jmodifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmodifyActionPerformed
      Course cse=new Course();
      jLecViews.add(cse).setVisible(true);
      
    }//GEN-LAST:event_jmodifyActionPerformed

    private void juploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juploadActionPerformed
        Marks mrk = new Marks();
        jLecViews.add(mrk).setVisible(true);
    }//GEN-LAST:event_juploadActionPerformed

    private void jstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jstudentActionPerformed
        Details dtl = new Details();
        jLecViews.add(dtl).setVisible(true);
    }//GEN-LAST:event_jstudentActionPerformed

    private void jeligibilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jeligibilityActionPerformed
        Steligiblity eligib = new Steligiblity();
        jLecViews.add(eligib).setVisible(true);
    }//GEN-LAST:event_jeligibilityActionPerformed

    private void btnAttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttendanceActionPerformed
        Attnd att = new Attnd();
        jLecViews.add(att).setVisible(true);
    }//GEN-LAST:event_btnAttendanceActionPerformed

    private void btnAttendance1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttendance1ActionPerformed
        Medical medi = new Medical();
        jLecViews.add(medi).setVisible(true);
    }//GEN-LAST:event_btnAttendance1ActionPerformed

    private void btnGPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGPAActionPerformed
        CalGPA cal = new CalGPA();
        jLecViews.add(cal).setVisible(true);
    }//GEN-LAST:event_btnGPAActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Lecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lecturer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAttendance;
    private javax.swing.JButton btnAttendance1;
    private javax.swing.JButton btnGPA;
    private javax.swing.JDesktopPane jLecViews;
    private javax.swing.JLabel jLecture;
    private javax.swing.JButton jUpdate;
    private javax.swing.JButton jeligibility;
    private javax.swing.JButton jmodify;
    private javax.swing.JButton jstudent;
    private javax.swing.JButton jstudentmarks;
    private javax.swing.JButton jupload;
    // End of variables declaration//GEN-END:variables
}
