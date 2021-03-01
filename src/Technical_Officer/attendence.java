
package Technical_Officer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import mycode.dbconnect;
import net.proteanit.sql.DbUtils;


public class attendence extends javax.swing.JInternalFrame {

    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    public attendence() {
        initComponents();
        
        con=dbconnect.connect();
        
        //table load
        
        
        tableload();
        
        
        
    }
    
    public void tableload(){
        
        String get_table="select * from attendance";
        
        try {
            pst=con.prepareStatement(get_table);
            rs=pst.executeQuery();
            
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidlable = new javax.swing.JLabel();
        aidlable = new javax.swing.JLabel();
        scodelable = new javax.swing.JLabel();
        hourslable = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        datelable = new javax.swing.JLabel();
        aid = new javax.swing.JTextField();
        sid = new javax.swing.JTextField();
        hours = new javax.swing.JComboBox<>();
        timelable1 = new javax.swing.JLabel();
        tp = new javax.swing.JComboBox<>();
        add = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        update = new javax.swing.JButton();
        searchaid = new javax.swing.JTextField();
        searchaidb = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        date = new javax.swing.JTextField();
        state = new javax.swing.JComboBox<>();
        midlable = new javax.swing.JLabel();
        mid = new javax.swing.JLabel();
        scode = new javax.swing.JComboBox<>();
        amid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        searchsid = new javax.swing.JTextField();
        searchsidb = new javax.swing.JButton();
        aidlable1 = new javax.swing.JLabel();
        sidlable1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Attendence");
        setPreferredSize(new java.awt.Dimension(891, 514));
        getContentPane().setLayout(null);

        sidlable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sidlable.setForeground(new java.awt.Color(255, 255, 255));
        sidlable.setText("Student ID");
        getContentPane().add(sidlable);
        sidlable.setBounds(12, 61, 86, 22);

        aidlable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aidlable.setForeground(new java.awt.Color(255, 255, 255));
        aidlable.setText("Attendence ID");
        getContentPane().add(aidlable);
        aidlable.setBounds(12, 20, 113, 22);

        scodelable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        scodelable.setForeground(new java.awt.Color(255, 255, 255));
        scodelable.setText("subject code");
        getContentPane().add(scodelable);
        scodelable.setBounds(12, 89, 99, 22);

        hourslable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hourslable.setForeground(new java.awt.Color(255, 255, 255));
        hourslable.setText("Hours");
        getContentPane().add(hourslable);
        hourslable.setBounds(12, 171, 46, 22);

        status.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        status.setForeground(new java.awt.Color(255, 255, 255));
        status.setText("Status");
        getContentPane().add(status);
        status.setBounds(12, 212, 49, 22);

        datelable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        datelable.setForeground(new java.awt.Color(255, 255, 255));
        datelable.setText("date");
        getContentPane().add(datelable);
        datelable.setBounds(12, 261, 34, 22);

        aid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(aid);
        aid.setBounds(174, 17, 193, 28);

        sid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(sid);
        sid.setBounds(174, 58, 184, 28);

        hours.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hours.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select hours", "1", "2", "3", "4" }));
        getContentPane().add(hours);
        hours.setBounds(174, 168, 184, 28);

        timelable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        timelable1.setForeground(new java.awt.Color(255, 255, 255));
        timelable1.setText("Theory/Practical");
        getContentPane().add(timelable1);
        timelable1.setBounds(12, 130, 126, 22);

        tp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select t/p", "theory", "practical" }));
        getContentPane().add(tp);
        tp.setBounds(174, 127, 184, 28);

        add.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(51, 341, 105, 31);

        clear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clear.setText("clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear);
        clear.setBounds(209, 385, 105, 31);

        update.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(209, 341, 105, 31);

        searchaid.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        searchaid.setForeground(new java.awt.Color(204, 204, 204));
        searchaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchaidActionPerformed(evt);
            }
        });
        getContentPane().add(searchaid);
        searchaid.setBounds(499, 18, 255, 28);

        searchaidb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchaidb.setText("Search");
        searchaidb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchaidbActionPerformed(evt);
            }
        });
        getContentPane().add(searchaidb);
        searchaidb.setBounds(766, 17, 85, 31);

        delete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        delete.setText("delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(51, 385, 105, 31);

        date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(date);
        date.setBounds(174, 255, 184, 28);

        state.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        state.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select state", "present", "absent", "medical" }));
        getContentPane().add(state);
        state.setBounds(174, 209, 184, 28);

        midlable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        midlable.setForeground(new java.awt.Color(255, 255, 255));
        midlable.setText("Medical ID");
        getContentPane().add(midlable);
        midlable.setBounds(12, 299, 83, 22);

        mid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(mid);
        mid.setBounds(767, 436, 117, 0);

        scode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        scode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select subject code", "1", "2", "3", "4" }));
        getContentPane().add(scode);
        scode.setBounds(174, 86, 184, 28);

        amid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(amid);
        amid.setBounds(174, 296, 184, 28);

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(381, 110, 471, 309);

        searchsid.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        searchsid.setForeground(new java.awt.Color(204, 204, 204));
        searchsid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchsidActionPerformed(evt);
            }
        });
        getContentPane().add(searchsid);
        searchsid.setBounds(499, 62, 255, 28);

        searchsidb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchsidb.setText("Search");
        searchsidb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchsidbActionPerformed(evt);
            }
        });
        getContentPane().add(searchsidb);
        searchsidb.setBounds(766, 61, 85, 31);

        aidlable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aidlable1.setForeground(new java.awt.Color(255, 255, 255));
        aidlable1.setText("Attendence ID");
        getContentPane().add(aidlable1);
        aidlable1.setBounds(381, 17, 113, 22);

        sidlable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sidlable1.setForeground(new java.awt.Color(255, 255, 255));
        sidlable1.setText("Student ID");
        getContentPane().add(sidlable1);
        sidlable1.setBounds(381, 65, 86, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Technical_Officer/light-blue-abstract-wallpaper-19.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 910, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        
        if(aid.getText().trim().isEmpty() || sid.getText().trim().isEmpty() ||   
                date.getText().trim().isEmpty() ||
                scode.getSelectedItem().equals("Select subject code") ||
                tp.getSelectedItem().equals("select t/p")||
                hours.getSelectedItem().equals("Select hours")||
                state.getSelectedItem().equals("Select state")
        ){
                
            JOptionPane.showMessageDialog(null,"please fill the form correctly");
        
            
        }else{
            String a_id=null;
            String s_id=null;
            String s_code=null;
            String a_tp=null;
            String a_hours=null;
            String a_state=null;
            String a_date=null;
            String a_mid=null;

            a_id=aid.getText();
            s_id=sid.getText();
            s_code=scode.getSelectedItem().toString();
            a_tp=tp.getSelectedItem().toString();
            a_hours=hours.getSelectedItem().toString();
            a_state=state.getSelectedItem().toString();
            a_date=date.getText();
            
            int int_hours=Integer.parseInt(a_hours);
            
            if(state.getSelectedItem().equals("medical")){
                a_mid=amid.getText();
                int int_mid=Integer.parseInt(a_mid);
                
                String madd="insert into attendance value('"+ a_id +"','"+ s_id +"','"+ s_code +"','"+ a_tp +"',"+ int_hours +",'"+ a_state +"','"+ a_date +"',"+ int_mid +")";
               // System.out.println("inside medical input");
                
                try {
                    pst= con.prepareStatement(madd);
                    pst.execute();

                } catch (Exception e) {
                    System.out.println(e);
                }
                
                
                
            }else{
                String add="insert into attendance (a_id,s_id,s_code,tp,hours,state,date) value('"+ a_id +"','"+ s_id +"','"+ s_code +"','"+ a_tp +"',"+ int_hours +",'"+ a_state +"','"+ a_date +"')";
                
                try {
                    pst= con.prepareStatement(add);
                    pst.execute();

                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            
            

            tableload();
            

           // System.out.println(a_mid+" "+int_mid);

           

            
            
        }
    }//GEN-LAST:event_addActionPerformed

    private void searchaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchaidActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

        amid.setText("");
        
        int row=table.getSelectedRow();
        
        String a_id=(String) table.getValueAt(row, 0).toString();
        String s_id=(String) table.getValueAt(row, 1).toString();
        String s_code=(String) table.getValueAt(row, 2).toString();
        String a_tp=(String) table.getValueAt(row, 3).toString();
        String a_hours=(String) table.getValueAt(row, 4).toString();
        String a_state=(String) table.getValueAt(row, 5).toString();
        String a_date=(String) table.getValueAt(row, 6).toString();
        
        
        aid.setText(a_id);
        sid.setText(s_id);
        scode.setSelectedItem(s_code);
        tp.setSelectedItem(a_tp);
        hours.setSelectedItem(a_hours);
        state.setSelectedItem(a_state);
        date.setText(a_date);
           
        if("medical".equals(a_state)){
             String m_id=(String) table.getValueAt(row, 7).toString();
             amid.setText(m_id);
        }
            
        
        
    }//GEN-LAST:event_tableMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        
        int answer=JOptionPane.showConfirmDialog(null, "Do you realy want update");
        
        if(aid.getText().trim().isEmpty() || sid.getText().trim().isEmpty() ||   
                date.getText().trim().isEmpty() ||
                scode.getSelectedItem().equals("Select subject code") ||
                tp.getSelectedItem().equals("select t/p")||
                hours.getSelectedItem().equals("Select hours")||
                state.getSelectedItem().equals("Select state")
        ){
            JOptionPane.showMessageDialog(null,"please fill the form correctly");
        }else{
            
            if(answer==0){

                String a_id=aid.getText().toString();
                String s_id=sid.getText().toString();
                String s_code=scode.getSelectedItem().toString();
                String a_tp=tp.getSelectedItem().toString();
                String a_hours=hours.getSelectedItem().toString();
                String a_state=state.getSelectedItem().toString();
                String a_date=date.getText().toString();

                String update=null;

                int int_hours=Integer.parseInt(a_hours);
                
                if(state.getSelectedItem().equals("medical")){
                    
                    if(amid.getText().trim().isEmpty()){
                        JOptionPane.showMessageDialog(null,"please fill medical id");
                    }else{
                    
                         String a_mid=amid.getText().toString();
                         int int_mid=Integer.parseInt(a_mid);
                          update="update attendance set s_code='"+ s_code +"',tp='"+ a_tp +"',hours="+ int_hours +",state='"+ a_state +"',date='"+ a_date +"',m_id="+ int_mid +" where a_id='"+ a_id +"' and s_id='"+ s_id +"' limit 1";
                    }
                }else{
                    update="update attendance set s_code='"+ s_code +"',tp='"+ a_tp +"',hours="+ int_hours +",state='"+ a_state +"',date='"+ a_date +"' where a_id='"+ a_id +"' and s_id='"+ s_id +"' limit 1";

                }

                if(update!=null){
                
                    try {
                        pst=con.prepareStatement(update);
                        pst.execute();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                
                tableload();
            }
        
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        
        int answer=JOptionPane.showConfirmDialog(null, "Do you realy want delete this");
        
        if(answer==0){
            
            String a_id=aid.getText();
            String s_id=sid.getText();
            
            String delete="delete from attendance where a_id='"+ a_id +"' and s_id='"+ s_id +"' limit 1";
            
            try {
                pst=con.prepareStatement(delete);
                pst.execute();
                
                
            } catch (Exception e) {
                System.out.println(e);
            }
            
            
        }
        
        
        
        tableload();
    }//GEN-LAST:event_deleteActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        
        aid.setText("");
        sid.setText("");
        
        date.setText("");
        amid.setText("");
        
        
    }//GEN-LAST:event_clearActionPerformed

    private void searchaidbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchaidbActionPerformed
        
        
        String a_id=searchaid.getText();
        
        String get_table="select * from attendance where a_id like '%"+ a_id +"%'";
        
        try {
            pst=con.prepareStatement(get_table);
            rs=pst.executeQuery();
            
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }//GEN-LAST:event_searchaidbActionPerformed

    private void searchsidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchsidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchsidActionPerformed

    private void searchsidbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchsidbActionPerformed
       String s_id=searchsid.getText();
        
        String get_table="select * from attendance where s_id like '%"+ s_id +"%'";
        
        try {
            pst=con.prepareStatement(get_table);
            rs=pst.executeQuery();
            
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_searchsidbActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField aid;
    private javax.swing.JLabel aidlable;
    private javax.swing.JLabel aidlable1;
    private javax.swing.JTextField amid;
    private javax.swing.JButton clear;
    private javax.swing.JTextField date;
    private javax.swing.JLabel datelable;
    private javax.swing.JButton delete;
    private javax.swing.JComboBox<String> hours;
    private javax.swing.JLabel hourslable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mid;
    private javax.swing.JLabel midlable;
    private javax.swing.JComboBox<String> scode;
    private javax.swing.JLabel scodelable;
    private javax.swing.JTextField searchaid;
    private javax.swing.JButton searchaidb;
    private javax.swing.JTextField searchsid;
    private javax.swing.JButton searchsidb;
    private javax.swing.JTextField sid;
    private javax.swing.JLabel sidlable;
    private javax.swing.JLabel sidlable1;
    private javax.swing.JComboBox<String> state;
    private javax.swing.JLabel status;
    private javax.swing.JTable table;
    private javax.swing.JLabel timelable1;
    private javax.swing.JComboBox<String> tp;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
