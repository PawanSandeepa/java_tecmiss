
package Technical_Officer;

import com.mysql.jdbc.ResultSetRow;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import mycode.dbconnect;
import net.proteanit.sql.DbUtils;


public class Medical extends javax.swing.JInternalFrame {

    Connection con=null;
    PreparedStatement pst =null;
    ResultSet rs =null;
    
    
 
    public Medical() {
        initComponents();
        
        con=dbconnect.connect();
        
        tableload();
    }

    
    public void tableload(){
        try {
            String table ="select * from medical order by m_id";
            pst = con.prepareStatement(table);
            
            rs =pst.executeQuery();
            
            mtable.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidlable = new javax.swing.JLabel();
        aidlable = new javax.swing.JLabel();
        datelable = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        status = new javax.swing.JLabel();
        did = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        searchtextbox = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        sid = new javax.swing.JTextField();
        medicalid_lable = new javax.swing.JLabel();
        aidlable1 = new javax.swing.JLabel();
        mid = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mtable = new javax.swing.JTable();
        scode = new javax.swing.JComboBox<>();
        state = new javax.swing.JComboBox<>();
        delete = new javax.swing.JButton();
        tp = new javax.swing.JComboBox<>();
        aidlable2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Medical");
        setPreferredSize(new java.awt.Dimension(891, 514));
        getContentPane().setLayout(null);

        sidlable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sidlable.setForeground(new java.awt.Color(255, 255, 255));
        sidlable.setText("Student ID");
        getContentPane().add(sidlable);
        sidlable.setBounds(12, 93, 86, 22);

        aidlable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aidlable.setForeground(new java.awt.Color(255, 255, 255));
        aidlable.setText("Doctor ID");
        getContentPane().add(aidlable);
        aidlable.setBounds(12, 139, 77, 22);

        datelable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        datelable.setForeground(new java.awt.Color(255, 255, 255));
        datelable.setText("Date");
        getContentPane().add(datelable);
        datelable.setBounds(12, 258, 36, 22);

        add.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(26, 362, 105, 31);

        clear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clear.setText("clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear);
        clear.setBounds(26, 411, 105, 31);

        status.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        status.setForeground(new java.awt.Color(255, 255, 255));
        status.setText("Status");
        getContentPane().add(status);
        status.setBounds(12, 304, 49, 22);

        did.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(did);
        did.setBounds(116, 136, 191, 28);

        update.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(202, 362, 105, 31);

        searchtextbox.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        searchtextbox.setForeground(new java.awt.Color(204, 204, 204));
        searchtextbox.setToolTipText("enter student id");
        searchtextbox.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        searchtextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtextboxActionPerformed(evt);
            }
        });
        getContentPane().add(searchtextbox);
        searchtextbox.setBounds(417, 14, 281, 28);
        searchtextbox.getAccessibleContext().setAccessibleName("");

        date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(date);
        date.setBounds(116, 255, 191, 28);

        search.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(716, 13, 85, 31);

        sid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidActionPerformed(evt);
            }
        });
        getContentPane().add(sid);
        sid.setBounds(116, 90, 191, 28);

        medicalid_lable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        medicalid_lable.setForeground(new java.awt.Color(255, 255, 255));
        medicalid_lable.setText("medical ID");
        getContentPane().add(medicalid_lable);
        medicalid_lable.setBounds(12, 50, 84, 22);

        aidlable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aidlable1.setForeground(new java.awt.Color(255, 255, 255));
        aidlable1.setText("Subject ID");
        getContentPane().add(aidlable1);
        aidlable1.setBounds(12, 177, 83, 28);

        mid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mid.setForeground(new java.awt.Color(255, 255, 255));
        mid.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mid.setText("medical ID will auto add");
        mid.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(mid);
        mid.setBounds(116, 50, 191, 22);

        mtable.setAutoCreateRowSorter(true);
        mtable.setModel(new javax.swing.table.DefaultTableModel(
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
        mtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(mtable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(314, 62, 561, 402);

        scode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        scode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select subject cod", "subject 1", "subject 2", "subject 3" }));
        getContentPane().add(scode);
        scode.setBounds(116, 177, 191, 28);

        state.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        state.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select state", "pass", "fail" }));
        getContentPane().add(state);
        state.setBounds(116, 301, 191, 28);

        delete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        delete.setText("delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(202, 411, 105, 31);

        tp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select type", "theary", "practical", "exam" }));
        getContentPane().add(tp);
        tp.setBounds(116, 218, 191, 28);

        aidlable2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aidlable2.setForeground(new java.awt.Color(255, 255, 255));
        aidlable2.setText("For what");
        getContentPane().add(aidlable2);
        aidlable2.setBounds(12, 218, 69, 28);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Technical_Officer/light-blue-abstract-wallpaper-19.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 890, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchtextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtextboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtextboxActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        if(sid.getText().trim().isEmpty() || did.getText().trim().isEmpty() ||   
                scode.getSelectedItem().equals("Select subject cod") ||
                tp.getSelectedItem().equals("Select type") ||
                date.getText().trim().isEmpty()||
                state.getSelectedItem().equals("Select state")
                
        ){
            JOptionPane.showMessageDialog(null,"please fill the form correctly");
        }else{
            
            String s_id=sid.getText();
            String d_id=did.getText();
            String s_code=scode.getSelectedItem().toString();
            String m_tp=tp.getSelectedItem().toString();
            String m_date=date.getText();
            String m_state=state.getSelectedItem().toString();

            try {
                String addquery="INSERT INTO medical (s_id,d_id,s_code,tp,date,status) values ('"+ s_id +"','"+ d_id +"','"+ s_code +"','"+ m_tp +"','"+ m_date +"','"+ m_state +"')";

                 pst=con.prepareStatement(addquery);

                 pst.execute();


            } catch (Exception e) {
                System.out.println(e);
            }


            tableload();
            
        }
    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        if(sid.getText().trim().isEmpty() || did.getText().trim().isEmpty() ||   
                scode.getSelectedItem().equals("Select subject cod") ||
                tp.getSelectedItem().equals("Select type") ||
                date.getText().trim().isEmpty()||
                state.getSelectedItem().equals("Select state")
                
        ){
            JOptionPane.showMessageDialog(null,"please fill the form correctly");
        }else{
        
            int answer=JOptionPane.showConfirmDialog(null,"Do you realy want to update");

            if(answer==0){

                String m_id=mid.getText();
                String s_id=sid.getText();
                String d_id=did.getText();
                String s_code=scode.getSelectedItem().toString();
                String m_tp=tp.getSelectedItem().toString();
                String m_date=date.getText();
                String m_state=state.getSelectedItem().toString();

                try {
                    String update="update medical set s_id='"+ s_id +"',d_id='"+ d_id +"',s_code='"+ s_code +"',tp='"+ m_tp +"',date='"+ m_date +"',status='"+ m_state +"' where m_id='"+ m_id +"' limit 1";
                    pst=con.prepareStatement(update);
                    pst.execute();


                } catch (Exception e) {
                    System.out.println(e);
                }


                tableload();
            }
        }
        
    }//GEN-LAST:event_updateActionPerformed

    private void sidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sidActionPerformed

    private void mtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mtableMouseClicked
        
        
        //get value in the table
        int row=mtable.getSelectedRow();
        String m_id=mtable.getValueAt(row, 0).toString();
        String s_id=mtable.getValueAt(row, 1).toString();
        String d_id=mtable.getValueAt(row, 2).toString();
        String s_code=mtable.getValueAt(row, 3).toString();
        String m_tp=mtable.getValueAt(row, 4).toString();
        String m_date=mtable.getValueAt(row, 5).toString();
        String m_state=mtable.getValueAt(row, 6).toString();
        
        
        mid.setText(m_id);
        sid.setText(s_id);
        did.setText(d_id);
        scode.setSelectedItem(s_code);
        tp.setSelectedItem(m_tp);
        date.setText(m_date);
        state.setSelectedItem(m_state);
        
        
    }//GEN-LAST:event_mtableMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int answer=JOptionPane.showConfirmDialog(null, "Do you realy want delete this");
        if(answer==0){
            String d_id=did.getText();
            
            try {
                String delete="delete from medical where d_id='"+ d_id +"' limit 1";
                pst=con.prepareStatement(delete);
                pst.execute();
                
                
            } catch (Exception e) {
                
                System.out.println(e);
            }
        
            mid.setText("medical id will auto add");
            
            sid.setText("");
            did.setText("");
            scode.setSelectedItem(0);
            tp.setSelectedItem(0);
            date.setText("");
            state.setSelectedItem(0);
        }
        tableload();
    }//GEN-LAST:event_deleteActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
            mid.setText("medical id will auto add");
            
            sid.setText("");
            did.setText("");
            scode.setSelectedItem(0);
            tp.setSelectedItem(0);
            date.setText("");
            state.setSelectedItem(0);
    }//GEN-LAST:event_clearActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
       
        String get=searchtextbox.getText();
        
        
        
        try {
            String table ="select * from medical where s_id like '%"+ get +"%'order by m_id";
            pst = con.prepareStatement(table);
            
            rs =pst.executeQuery();
            
            mtable.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_searchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel aidlable;
    private javax.swing.JLabel aidlable1;
    private javax.swing.JLabel aidlable2;
    private javax.swing.JButton clear;
    private javax.swing.JTextField date;
    private javax.swing.JLabel datelable;
    private javax.swing.JButton delete;
    private javax.swing.JTextField did;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel medicalid_lable;
    private javax.swing.JLabel mid;
    private javax.swing.JTable mtable;
    private javax.swing.JComboBox<String> scode;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchtextbox;
    private javax.swing.JTextField sid;
    private javax.swing.JLabel sidlable;
    private javax.swing.JComboBox<String> state;
    private javax.swing.JLabel status;
    private javax.swing.JComboBox<String> tp;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
