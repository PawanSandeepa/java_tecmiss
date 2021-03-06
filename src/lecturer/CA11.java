package lecturer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Dell
 */
public class CA11 extends javax.swing.JInternalFrame {
                Connection conn = null;
              PreparedStatement psd = null;
    /**
     * Creates new form CA11
     */
    public CA11() {
        initComponents();
        conn = dbconnect.connect();

    }
    
    public void insertMarks(){
        String st_no = jIndexNo.getText();
        String Q1 = jQ1.getText();
        Integer.parseInt(Q1);
        String Q2 = jQ2.getText();
        Integer.parseInt(Q2);
        String Q3 = jQ3.getText();
        Integer.parseInt(Q3);
        String mid = jMid.getText();
        Integer.parseInt(mid);
        String f_theory = jFT.getText();
        Integer.parseInt(f_theory);
        String f_prac = jFP.getText();
        Integer.parseInt(f_prac);
 
        int p= JOptionPane.showConfirmDialog(null, "Are you sure want to add ?", "Add Marks", JOptionPane.YES_NO_OPTION);
        if(p==0){
            try {
                String qu = "INSERT INTO dsa(s_id,Q1,Q2,Q3,mid,f_theory,f_practicle)values('"+st_no+"','"+Q1+"','"+Q2+"','"+ Q3+"','"+ mid+"','"+f_theory+"','"+f_prac+"')";
                psd = conn.prepareStatement(qu);
                psd.executeUpdate();
                JOptionPane.showMessageDialog(null,"Inseted successfully");
            } catch (SQLException ex) {
                Logger.getLogger(CA11.class.getName()).log(Level.SEVERE, null, ex);
            }
        }       
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jFP = new javax.swing.JTextField();
        jMid = new javax.swing.JTextField();
        jQ3 = new javax.swing.JTextField();
        jQ1 = new javax.swing.JTextField();
        jQ2 = new javax.swing.JTextField();
        jFT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jIndexNo = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Marks Here");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 216, 53));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Q2");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 49, 39));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Q1");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 36, 39));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Mid");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 49, 39));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Q3");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 49, 39));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Final practical");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, 39));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Final theory");
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, 39));
        jPanel1.add(jFP, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 122, 39));
        jPanel1.add(jMid, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 60, 39));
        jPanel1.add(jQ3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 50, 39));
        jPanel1.add(jQ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 60, 39));
        jPanel1.add(jQ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 50, 39));
        jPanel1.add(jFT, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 122, 39));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Index number:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 27));

        jIndexNo.setText("TG");
        jPanel1.add(jIndexNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 159, 27));

        btnCancel.setText("Cancel");
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 88, 42));

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 88, 42));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lecturer/light-blue-abstract-wallpaper-19.jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 788, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        insertMarks();
    }//GEN-LAST:event_btnInsertActionPerformed
    
    public void setVisible(){
        jMid.disable();
    }
    
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnInsert;
    private javax.swing.JTextField jFP;
    private javax.swing.JTextField jFT;
    private javax.swing.JTextField jIndexNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jMid;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jQ1;
    private javax.swing.JTextField jQ2;
    private javax.swing.JTextField jQ3;
    // End of variables declaration//GEN-END:variables
}
