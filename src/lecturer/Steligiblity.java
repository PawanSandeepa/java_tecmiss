/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturer;

import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Dell
 */
public class Steligiblity extends javax.swing.JInternalFrame {

    /**
     * Creates new form Steligiblity
     */
    dbCon con = new dbCon();
    public Steligiblity() {
        initComponents();
        showMarks();
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
        jLabel3 = new javax.swing.JLabel();
        txtSID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        cCode = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Students Eligibility");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(280, 10, 260, 29);

        txtSID.setMinimumSize(new java.awt.Dimension(20, 50));
        txtSID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSIDKeyReleased(evt);
            }
        });
        jPanel1.add(txtSID);
        txtSID.setBounds(30, 100, 210, 30);

        jLabel1.setText("Student ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 70, 61, 14);

        btnSearch.setText("Search");
        jPanel1.add(btnSearch);
        btnSearch.setBounds(370, 100, 90, 30);

        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblList);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 150, 730, 210);

        cCode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economics", "Object Oriented Analysis & Design", "English", "Internet Application", "Data Structures", "System Analysis & Design", "All" }));
        cCode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cCodeItemStateChanged(evt);
            }
        });
        jPanel1.add(cCode);
        cCode.setBounds(260, 100, 90, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lecturer/light-blue-abstract-wallpaper-19.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 670);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void showMarks(){    
        con.getConnection();
        String crseCode = (String) cCode.getSelectedItem(); 
        if (crseCode=="Data Structures"){
            con.setSqlVW("DROP VIEW IF EXISTS CA_DSA");
            con.setSqlVW("create view CA_DSA as select s_id, case when Q1 > Q2 and Q1>Q3 and Q2>Q3 then (Q1+Q2)*0.05 when Q1 > Q2 and Q1>Q3 and Q2<Q3 then (Q1+Q3)*0.05 when Q2 > Q1 and Q2>Q3 and Q1>Q3 then (Q2+Q1)*0.05 when Q2 > Q1 and Q2>Q3 and Q1<Q3 then (Q2+Q3)*0.05 when Q3 > Q1 and Q3>Q2 and Q2>Q1 then (Q3+Q2)*0.05 else (Q3+Q1)*0.05 end as Quiz, mid*0.2 as Mid, f_practicle*0.3 as F_Practical from dsa");
            con.setSqlVW("DROP VIEW IF EXISTS tempEleg");
            con.setSqlVW("create view tempEleg as select (Quiz+Mid+F_Practical) as CA, a.s_id as Student_ID, count(a.s_id) as Days from attendances a,CA_DSA d where state ='present' and a.s_id=d.s_id group by a.s_id");             
            con.setSqlVW("DROP VIEW IF EXISTS tempEl2");
            con.setSqlVW("create view tempEl2 as SELECT CA, Student_ID,case WHEN  Days>1 then 'Elegible' else 'Not Elegible' end as Elegible FROM tempEleg ");  
            con.setSql("SELECT Student_ID,CA, Elegible FROM tempEl2 where Elegible='Elegible'");  
        } 
        else if (crseCode=="Economics"){
            con.setSqlVW("DROP VIEW IF EXISTS CA_Eco");
            con.setSqlVW("create view CA_Eco as select s_id, CASE WHEN Q1>Q2 AND Q1>Q3 AND Q1>Q4 THEN CASE WHEN Q2>Q3 AND Q2>Q4 THEN CASE  WHEN Q3>Q4 THEN (Q1+Q2+Q3)*0.033 ELSE (Q1+Q2+Q4)*0.033 END ELSE (Q1+Q3+Q4)*0.033  END ELSE (Q2+Q3+Q4)*0.033 END AS Quiz, (A2+A1)*0.05 as Assignment, mid*0.2 as Mid from economics");  
            con.setSqlVW("DROP VIEW IF EXISTS tempEleg");
            con.setSqlVW("create view tempEleg as select (Quiz+Mid+Assignment) as CA, a.s_id as Student_ID,count(a.s_id) as Days from attendances a,CA_Eco d where state ='present' and a.s_id=d.s_id group by a.s_id");             
            con.setSqlVW("DROP VIEW IF EXISTS tempEl2");
            con.setSqlVW("create view tempEl2 as SELECT CA, Student_ID,case WHEN  Days>1 then 'Elegible' else 'Not Elegible' end as Elegible FROM tempEleg ");  
            con.setSql("SELECT Student_ID,CA, Elegible FROM tempEl2 where Elegible='Elegible' and CA>40");  
        } 
            ResultSet result = con.getResultSet();
            tblList.setModel(DbUtils.resultSetToTableModel(result)); 
        
    }
    
    private void txtSIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSIDKeyReleased
      
    }//GEN-LAST:event_txtSIDKeyReleased

    private void cCodeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cCodeItemStateChanged
        showMarks();
    }//GEN-LAST:event_cCodeItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblList;
    private javax.swing.JTextField txtSID;
    // End of variables declaration//GEN-END:variables
}
