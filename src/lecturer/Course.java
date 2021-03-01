/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturer;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Dell
 */
public final class Course extends javax.swing.JInternalFrame {
        Connection conn = null;
        PreparedStatement psd = null;
        ResultSet rs = null;
        InputStream in;
        InputStream input;
        OutputStream output;
        String files;
        String getFile;
        dbCon con = new dbCon();
        
    public Course() {        
        conn = dbconnect.connect();
       
        initComponents();
        courseDetails();
        showFiles();
    }

    public void courseDetails(){
         if(cCode.getSelectedItem().equals("TCS2122")){
             String sql = "select c_code,d_id,c_name from course WHERE c_code = 'TCS2122' limit 1";
         
          try {
            
            psd = conn.prepareStatement(sql);
            rs = psd.executeQuery();
          
            while(rs.next()){
               String getId = rs.getString("d_id");
               String getCoursename= rs.getString("c_name");
              
                jDep_name.setText(getId); 
                jcoursetitle.setText(getCoursename);
                  
            }
        } catch (Exception e) {
            System.out.println(e);
        }
         }  
        else if(cCode.getSelectedItem().equals("ENG2122")){
             String sql = "select c_code,d_id,c_name from course WHERE c_code = 'ENG2122' limit 1";
         
          try {
            
            psd = conn.prepareStatement(sql);
            rs = psd.executeQuery();
          
            while(rs.next()){
               String getId = rs.getString("d_id");
               String getCoursename= rs.getString("c_name");
              
                jDep_name.setText(getId); 
                jcoursetitle.setText(getCoursename);
                  
            }
        } catch (Exception e) {
            System.out.println(e);
        }
         }  
         
       else if(cCode.getSelectedItem().equals("ICT2123")){
             String sql = "select c_code,d_id,c_name from course WHERE c_code = 'ICT2123' limit 1";
         
          try {
            
            psd = conn.prepareStatement(sql);
            rs = psd.executeQuery();
          
            while(rs.next()){
               String getId = rs.getString("d_id");
               String getCoursename= rs.getString("c_name");
              
                jDep_name.setText(getId); 
                jcoursetitle.setText(getCoursename);
                  
            }
        } catch (Exception e) {
            System.out.println(e);
        }
         }   
          else if(cCode.getSelectedItem().equals("ICT2153")){
             String sql = "select c_code,d_id,c_name from course WHERE c_code = 'ICT2153' limit 1";
         
          try {
            
            psd = conn.prepareStatement(sql);
            rs = psd.executeQuery();
          
            while(rs.next()){
               String getId = rs.getString("d_id");
               String getCoursename= rs.getString("c_name");
              
                jDep_name.setText(getId); 
                jcoursetitle.setText(getCoursename);
                  
            }
        } catch (Exception e) {
            System.out.println(e);
        }
         }   
         else if(cCode.getSelectedItem().equals("ICT2113")){
             String sql = "select c_code,d_id,c_name from course WHERE c_code = 'ICT2113' limit 1";
         
          try {
            
            psd = conn.prepareStatement(sql);
            rs = psd.executeQuery();
          
            while(rs.next()){
               String getId = rs.getString("d_id");
               String getCoursename= rs.getString("c_name");
              
                jDep_name.setText(getId); 
                jcoursetitle.setText(getCoursename);
                  
            }
        } catch (Exception e) {
            System.out.println(e);
        }
         }   
         else {
             String sql = "select c_code,d_id,c_name from course WHERE c_code = 'ICT2133' limit 1";
         
          try {
            
            psd = conn.prepareStatement(sql);
            rs = psd.executeQuery();
          
            while(rs.next()){
               String getId = rs.getString("d_id");
               String getCoursename= rs.getString("c_name");
              
                jDep_name.setText(getId); 
                jcoursetitle.setText(getCoursename);
                  
            }
        } catch (Exception e) {
            System.out.println(e);
        }
         }   
    }
    
    public void addMaterial(){
         String upURL = fileURL.getText();
         File pdfFile = new File(upURL);
         String c_Code = cCode.getSelectedItem().toString();
         byte[] pdfData = new byte[(int) pdfFile.length()];
            try {
                DataInputStream dis = new DataInputStream(new FileInputStream(pdfFile));
                dis.readFully(pdfData);
                dis.close();
                String myString = "jdbc:mysql://localhost:3306/project";
                conn = DriverManager.getConnection(myString, "root","");
                PreparedStatement ps = conn.prepareStatement("INSERT INTO material (filename,pdf_file,c_code) values (?,?,?)");
                ps.setString(1, files);
                ps.setBytes(2, pdfData);
                ps.setString(3,c_Code );
                ps.executeUpdate();
            
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
            }         
    }
    
    public void fetchFile() {
        int index = tblFiles.getSelectedRow();
        TableModel model = tblFiles.getModel();
        getFile = model.getValueAt(index, 0).toString();   
		try {
                    	//query to fetch file from database
			String sql= "Select pdf_file from material where filename='"+getFile+"'";
			psd = conn.prepareStatement(sql);
                        rs = psd.executeQuery();			
			in = null;
			while (rs.next()) {
				in = rs.getBinaryStream(1);
			}
			int available1 = in.available();
			byte[] bt = new byte[available1];
			in.read(bt);

			// new pdf file to store extracted data
			FileOutputStream fout = new FileOutputStream("D:/"+getFile+".pdf");
			DataOutputStream dout = new DataOutputStream(fout);                  
			dout.write(bt, 0, bt.length);
			fout.close();
                        JOptionPane.showMessageDialog(null,"File Downloaded");			
		} catch (Exception e) {
			System.out.println(e);
		}
    }
    
   public void showFiles(){
        String c_Code = cCode.getSelectedItem().toString();
        con.getConnection();                    
        con.setSql("SELECT filename as FileName,c_Code as CourseCode FROM material where c_code='"+c_Code+"'");          
        ResultSet result = con.getResultSet();
        tblFiles.setModel(DbUtils.resultSetToTableModel(result));   
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        cCode = new javax.swing.JComboBox<>();
        jcTitle1 = new javax.swing.JLabel();
        jcoursetitle = new javax.swing.JLabel();
        jdep_name = new javax.swing.JLabel();
        fileURL = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        addMaterial = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFiles = new javax.swing.JTable();
        jDep_name = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cCode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a course", "TCS2122", "ENG2122", "ICT2123", "ICT2153", "ICT2113", "ICT2133", " " }));
        cCode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cCodeItemStateChanged(evt);
            }
        });
        cCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCodeActionPerformed(evt);
            }
        });
        jPanel1.add(cCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 18, 107, 31));

        jcTitle1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jcTitle1.setText("Course Title");
        jPanel1.add(jcTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 85, 135, 22));
        jPanel1.add(jcoursetitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 151, 251, 31));

        jdep_name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jdep_name.setText("Department Name");
        jPanel1.add(jdep_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 135, 22));
        jPanel1.add(fileURL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 224, 34));

        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 88, 34));

        addMaterial.setText("Upload");
        addMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMaterialActionPerformed(evt);
            }
        });
        jPanel1.add(addMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 105, 34));

        tblFiles.setModel(new javax.swing.table.DefaultTableModel(
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
        tblFiles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFilesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFiles);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 302, 313, 310));
        jPanel1.add(jDep_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 85, 226, 31));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lecturer/light-blue-abstract-wallpaper-19.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(300, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCodeActionPerformed
        courseDetails();
    }//GEN-LAST:event_cCodeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            JFileChooser choose = new JFileChooser();
            choose.showOpenDialog(null);
            File f = choose.getSelectedFile();
            String fileName = f.getAbsolutePath();
            fileURL.setText(fileName);
            this.files = f.getName();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMaterialActionPerformed
            addMaterial();
        
    }//GEN-LAST:event_addMaterialActionPerformed

    private void tblFilesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFilesMouseClicked
            fetchFile();
    }//GEN-LAST:event_tblFilesMouseClicked

    private void cCodeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cCodeItemStateChanged
        showFiles();
    }//GEN-LAST:event_cCodeItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMaterial;
    private javax.swing.JComboBox<String> cCode;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JTextField fileURL;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jDep_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jcTitle1;
    private javax.swing.JLabel jcoursetitle;
    private javax.swing.JLabel jdep_name;
    private javax.swing.JTable tblFiles;
    // End of variables declaration//GEN-END:variables
}
