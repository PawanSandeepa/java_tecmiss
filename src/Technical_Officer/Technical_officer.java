
package Technical_Officer;

import java.awt.Toolkit;



public class Technical_officer extends javax.swing.JFrame {

    
    public String person = "tec2017252";

    public Technical_officer() {
        initComponents();
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        attendence = new javax.swing.JButton();
        medical = new javax.swing.JButton();
        log_out = new javax.swing.JButton();
        profile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pane = new javax.swing.JDesktopPane();
        notification1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("technical officer");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1134, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(1134, 626));
        getContentPane().setLayout(null);

        attendence.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        attendence.setText("Update attendence");
        attendence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendenceActionPerformed(evt);
            }
        });
        getContentPane().add(attendence);
        attendence.setBounds(22, 112, 160, 34);

        medical.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        medical.setText("Update medical");
        medical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalActionPerformed(evt);
            }
        });
        getContentPane().add(medical);
        medical.setBounds(22, 192, 160, 34);

        log_out.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        log_out.setText("Log out");
        log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_outActionPerformed(evt);
            }
        });
        getContentPane().add(log_out);
        log_out.setBounds(20, 530, 160, 34);

        profile.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        profile.setText("Update profile");
        profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileActionPerformed(evt);
            }
        });
        getContentPane().add(profile);
        profile.setBounds(22, 272, 160, 35);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Technical officer");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(405, 17, 324, 44);

        javax.swing.GroupLayout paneLayout = new javax.swing.GroupLayout(pane);
        pane.setLayout(paneLayout);
        paneLayout.setHorizontalGroup(
            paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        paneLayout.setVerticalGroup(
            paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
        );

        getContentPane().add(pane);
        pane.setBounds(212, 79, 891, 514);

        notification1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        notification1.setText("Notification");
        getContentPane().add(notification1);
        notification1.setBounds(22, 362, 160, 34);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Technical_Officer/light-blue-abstract-wallpaper-19.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1130, 630);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void attendenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendenceActionPerformed
       pane.removeAll();
        attendence atdnc = new attendence();
       pane.add(atdnc).setVisible(true);
    }//GEN-LAST:event_attendenceActionPerformed

    private void medicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalActionPerformed
        pane.removeAll();
        Medical med = new Medical();
        pane.add(med).setVisible(true);
    }//GEN-LAST:event_medicalActionPerformed

    private void profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileActionPerformed
        pane.removeAll();
        Update update = new Update();
        pane.add(update).setVisible(true);
    }//GEN-LAST:event_profileActionPerformed

    private void log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_outActionPerformed
        /*
        person=null;
        
        login log=new login();
        log.setVisible(true);*/
        this.dispose();
    }//GEN-LAST:event_log_outActionPerformed


    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Technical_officer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attendence;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton log_out;
    private javax.swing.JButton medical;
    private javax.swing.JButton notification1;
    private javax.swing.JDesktopPane pane;
    private javax.swing.JButton profile;
    // End of variables declaration//GEN-END:variables
}
