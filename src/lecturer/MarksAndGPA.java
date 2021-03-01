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
public class MarksAndGPA extends javax.swing.JInternalFrame {

    /**
     * Creates new form MarksAndGPA
     */
    
    dbCon con = new dbCon();
     
    public MarksAndGPA() {
        initComponents();
        showMarks();  
    }
    
        public void showMarks(){    
        con.getConnection();
        String crseCode = (String) cCode.getSelectedItem(); 
        if (crseCode=="Economics"){
            con.setSqlVW("DROP VIEW IF EXISTS `tempEco`");
            con.setSqlVW("create view tempEco as select s_id as Student_ID, "
                    + "CASE WHEN Q1>Q2 AND Q1>Q3 AND Q1>Q4 THEN"
                    + "     CASE WHEN Q2>Q3 AND Q2>Q4 THEN"
                    + "         CASE  WHEN Q3>Q4 THEN"
                    + "             (Q1+Q2+Q3)*0.033"
                    + "         ELSE"
                    + "             (Q1+Q2+Q4)*0.033"
                    + "         END"
                    + "     ELSE"
                    + "         (Q1+Q3+Q4)*0.033"
                    + "     END"
                    + " ELSE"
                    + "     (Q2+Q3+Q4)*0.033"
                    + " END AS Quiz, (A2+A1)*0.05 as Assignment, mid*0.2 as Mid, f_theory*0.6 as Final_Theory from economics");             
            con.setSql("SELECT Student_ID,Quiz,Assignment,Mid,Final_Theory,(Quiz+Assignment+Mid+Final_Theory) as Final_Marks, case "
                    + "WHEN (Quiz+Mid+Assignment+Final_Theory) >=85 then "
                    + "'A+' "
                    +"WHEN (Quiz+Mid+Assignment+Final_Theory) >=80 then "
                    + "'A' "
                    +"WHEN (Quiz+Mid+Assignment+Final_Theory) >=75 then "
                    + "'A-' "
                    +"WHEN (Quiz+Mid+Assignment+Final_Theory) >=70 then "
                    + "'B+' "
                    +"WHEN (Quiz+Mid+Assignment+Final_Theory) >=65 then "
                    + "'B' "
                    +"WHEN (Quiz+Mid+Assignment+Final_Theory) >=60 then "
                    + "'B-' "
                    +"WHEN (Quiz+Mid+Assignment+Final_Theory) >=55 then "
                    + "'C+' "   
                    +"WHEN (Quiz+Mid+Assignment+Final_Theory) >=50 then "
                    + "'C' "
                    +"WHEN (Quiz+Mid+Assignment+Final_Theory) >=45 then "
                    + "'C-' "
                    +"WHEN (Quiz+Mid+Assignment+Final_Theory) >=40 then "
                    + "'D+' " 
                    +"else 'E'"
                    + "end as Grade FROM tempEco");          
        } 
        else if (crseCode=="Data Structures"){         
            con.setSqlVW("DROP VIEW IF EXISTS `temp`");
            con.setSqlVW("create view temp as select s_id as Student_ID, case when Q1 > Q2 and Q1>Q3 and Q2>Q3 then (Q1+Q2)*0.05 when Q1 > Q2 and Q1>Q3 and Q2<Q3 then (Q1+Q3)*0.05 when Q2 > Q1 and Q2>Q3 and Q1>Q3 then (Q2+Q1)*0.05 when Q2 > Q1 and Q2>Q3 and Q1<Q3 then (Q2+Q3)*0.05 when Q3 > Q1 and Q3>Q2 and Q2>Q1 then (Q3+Q2)*0.05 else (Q3+Q1)*0.05 end as Quiz, mid*.2 as Mid, f_practicle*0.3 as Practical, f_theory*0.4 as Final_Theory FROM dsa");               
            con.setSql("SELECT Student_ID,Quiz,Mid,Practical,Final_Theory,(Quiz+Mid+Practical+Final_Theory) as Final_Marks, case "
                    + "WHEN (Quiz+Mid+Practical+Final_Theory) >=85 then "
                    + "'A+' "
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=80 then "
                    + "'A' "
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=75 then "
                    + "'A-' "
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=70 then "
                    + "'B+' "
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=65 then "
                    + "'B' "
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=60 then "
                    + "'B-' "
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=55 then "
                    + "'C+' "   
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=50 then "
                    + "'C' "
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=45 then "
                    + "'C-' "
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=40 then "
                    + "'D+' " 
                    +"else 'E'"
                    + "end as Grade FROM temp");   
        }
        else if (crseCode=="Object Oriented Analysis & Design"){         
            con.setSqlVW("DROP VIEW IF EXISTS `tempOOD`");
            con.setSqlVW("create view tempOOD as select s_id as Student_ID, case when Q1 > Q2 and Q1>Q3 and Q2>Q3 then (Q1+Q2)*0.05 when Q1 > Q2 and Q1>Q3 and Q2<Q3 then (Q1+Q3)*0.05 when Q2 > Q1 and Q2>Q3 and Q1>Q3 then (Q2+Q1)*0.05 when Q2 > Q1 and Q2>Q3 and Q1<Q3 then (Q2+Q3)*0.05 when Q3 > Q1 and Q3>Q2 and Q2>Q1 then (Q3+Q2)*0.05 else (Q3+Q1)*0.05 end as Quiz,case when A1>A2 and A1>A3 and A2>A3 then (A1+A2)*0.1 when A1>A2 and A1>A3 and A2<A3 then (A1+A3)*0.1 when A2>A1 and A2>A3 and A1>A3 then (A2+A1)*0.1 when A2 > A1 and A2>A3 and A1<A3 then (A2+A3)*0.1 when A3 > A1 and A3>A2 and A2>A1 then (A3+A2)*0.1 else (A3+A1)*0.1 end as Assignment, f_practicle*0.4 as Practical, f_theory*0.3 as Final_Theory FROM ood");               
            con.setSql("SELECT Student_ID, Quiz,Assignment,Practical,Final_Theory,(Quiz+Assignment+Practical+Final_Theory) as Final_Marks, case "
                    + "WHEN (Quiz+Assignment+Practical+Final_Theory) >=85 then "
                    + "'A+' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=80 then "
                    + "'A' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=75 then "
                    + "'A-' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=70 then "
                    + "'B+' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=65 then "
                    + "'B' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=60 then "
                    + "'B-' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=55 then "
                    + "'C+' "   
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=50 then "
                    + "'C' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=45 then "
                    + "'C-' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=40 then "
                    + "'D+' " 
                    +"else 'E'"
                    + "end as Grade FROM tempOOD");   
        }
        
        else if (crseCode=="System Analysis & Design"){         
            con.setSqlVW("DROP VIEW IF EXISTS `tempSAD`");
            con.setSqlVW("create view tempSAD as select  s_id as Student_ID,  case when Q1 > Q2 and Q1>Q3 and Q2>Q3 then (Q1+Q2)*0.05 when Q1 > Q2 and Q1>Q3 and Q2<Q3 then (Q1+Q3)*0.05 when Q2 > Q1 and Q2>Q3 and Q1>Q3 then (Q2+Q1)*0.05 when Q2 > Q1 and Q2>Q3 and Q1<Q3 then (Q2+Q3)*0.05 when Q3 > Q1 and Q3>Q2 and Q2>Q1 then (Q3+Q2)*0.05 else (Q3+Q1)*0.05 end as Quiz, mid*.2 as Mid, f_practicle*0.3 as Practical, f_theory*0.4 as Final_Theory FROM system_analysis");               
            con.setSql("SELECT Student_ID,Quiz,Mid,Practical,Final_Theory,(Quiz+Mid+Practical+Final_Theory) as Final_Marks, case "
                    + "WHEN (Quiz+Mid+Practical+Final_Theory) >=85 then "
                    + "'A+' "
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=80 then "
                    + "'A' "
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=75 then "
                    + "'A-' "
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=70 then "
                    + "'B+' "
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=65 then "
                    + "'B' "
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=60 then "
                    + "'B-' "
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=55 then "
                    + "'C+' "   
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=50 then "
                    + "'C' "
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=45 then "
                    + "'C-' "
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=40 then "
                    + "'D+' " 
                    +"else 'E'"
                    + "end as Grade FROM tempSAD");   
        }
        
        else if (crseCode=="Internet Application"){         
            con.setSqlVW("DROP VIEW IF EXISTS `tempIA`");
            con.setSqlVW("create view tempIA as select s_id as Student_ID, case when Q1 > Q2 and Q1>Q3 and Q2>Q3 then (Q1+Q2)*0.05 when Q1 > Q2 and Q1>Q3 and Q2<Q3 then (Q1+Q3)*0.05 when Q2 > Q1 and Q2>Q3 and Q1>Q3 then (Q2+Q1)*0.05 when Q2 > Q1 and Q2>Q3 and Q1<Q3 then (Q2+Q3)*0.05 when Q3 > Q1 and Q3>Q2 and Q2>Q1 then (Q3+Q2)*0.05 else (Q3+Q1)*0.05 end as Quiz,case when A1>A2 and A1>A3 and A2>A3 then (A1+A2)*0.1 when A1>A2 and A1>A3 and A2<A3 then (A1+A3)*0.1 when A2>A1 and A2>A3 and A1>A3 then (A2+A1)*0.1 when A2 > A1 and A2>A3 and A1<A3 then (A2+A3)*0.1 when A3 > A1 and A3>A2 and A2>A1 then (A3+A2)*0.1 else (A3+A1)*0.1 end as Assignment, f_practicle*0.3 as Practical, f_theory*0.4 as Final_Theory FROM internet_application");               
            con.setSql("SELECT Student_ID,Quiz,Assignment,Practical,Final_Theory,(Quiz+Assignment+Practical+Final_Theory) as Final_Marks, case "
                    + "WHEN (Quiz+Assignment+Practical+Final_Theory) >=85 then "
                    + "'A+' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=80 then "
                    + "'A' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=75 then "
                    + "'A-' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=70 then "
                    + "'B+' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=65 then "
                    + "'B' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=60 then "
                    + "'B-' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=55 then "
                    + "'C+' "   
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=50 then "
                    + "'C' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=45 then "
                    + "'C-' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=40 then "
                    + "'D+' " 
                    +"else 'E'"
                    + "end as Grade FROM tempIA");   
        }
        else if (crseCode=="English"){         
            con.setSqlVW("DROP VIEW IF EXISTS `tempEng`");
            con.setSqlVW("create view tempEng as select s_id as Student_ID,case when Q1 > Q2 and Q1>Q3 and Q2>Q3 then (Q1+Q2)*0.05 when Q1 > Q2 and Q1>Q3 and Q2<Q3 then (Q1+Q3)*0.05 when Q2 > Q1 and Q2>Q3 and Q1>Q3 then (Q2+Q1)*0.05 when Q2 > Q1 and Q2>Q3 and Q1<Q3 then (Q2+Q3)*0.05 when Q3 > Q1 and Q3>Q2 and Q2>Q1 then (Q3+Q2)*0.05 else (Q3+Q1)*0.05 end as Quiz,case when A1>A2 and A1>A3 and A2>A3 then (A1+A2)*0.1 when A1>A2 and A1>A3 and A2<A3 then (A1+A3)*0.1 when A2>A1 and A2>A3 and A1>A3 then (A2+A1)*0.1 when A2 > A1 and A2>A3 and A1<A3 then (A2+A3)*0.1 when A3 > A1 and A3>A2 and A2>A1 then (A3+A2)*0.1 else (A3+A1)*0.1 end as Assignment, f_practicle*0.3 as Practical, f_theory*0.4 as Final_Theory FROM english");               
            con.setSql("SELECT Student_ID,Quiz,Assignment,Practical,Final_Theory,(Quiz+Assignment+Practical+Final_Theory) as Final_Marks, case "
                    + "WHEN (Quiz+Assignment+Practical+Final_Theory) >=85 then "
                    + "'A+' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=80 then "
                    + "'A' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=75 then "
                    + "'A-' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=70 then "
                    + "'B+' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=65 then "
                    + "'B' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=60 then "
                    + "'B-' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=55 then "
                    + "'C+' "   
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=50 then "
                    + "'C' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=45 then "
                    + "'C-' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=40 then "
                    + "'D+' " 
                    +"else 'E'"
                    + "end as Grade FROM tempEng");   
        }
        else{
            //task when click All
        }      
        
         ResultSet result = con.getResultSet();
         tblMarks.setModel(DbUtils.resultSetToTableModel(result));            
    }
    
    public void showMarksById(){    
        String sid = txtSID.getText();
        con.getConnection();
        
        String crseCode = (String) cCode.getSelectedItem(); 
        if (crseCode=="Economics"){
            con.setSqlVW("DROP VIEW IF EXISTS `tempEco`");
            con.setSqlVW("create view tempEco as select "
                    + "CASE WHEN Q1>Q2 AND Q1>Q3 AND Q1>Q4 THEN"
                    + "     CASE WHEN Q2>Q3 AND Q2>Q4 THEN"
                    + "         CASE  WHEN Q3>Q4 THEN"
                    + "             (Q1+Q2+Q3)*0.033"
                    + "         ELSE"
                    + "             (Q1+Q2+Q4)*0.033"
                    + "         END"
                    + "     ELSE"
                    + "         (Q1+Q3+Q4)*0.033"
                    + "     END"
                    + " ELSE"
                    + "     (Q2+Q3+Q4)*0.033"
                    + " END AS Quiz, (A2+A1)*0.05 as Assignment, mid*0.2 as Mid, f_theory*0.6 as Final_Theory from economics where s_id='"+sid+"'");             
            con.setSql("SELECT Quiz,Assignment,Mid,Final_Theory,(Quiz+Assignment+Mid+Final_Theory) as Final_Marks, case "
                    + "WHEN (Quiz+Mid+Assignment+Final_Theory) >=85 then "
                    + "'A+' "
                    +"WHEN (Quiz+Mid+Assignment+Final_Theory) >=80 then "
                    + "'A' "
                    +"WHEN (Quiz+Mid+Assignment+Final_Theory) >=75 then "
                    + "'A-' "
                    +"WHEN (Quiz+Mid+Assignment+Final_Theory) >=70 then "
                    + "'B+' "
                    +"WHEN (Quiz+Mid+Assignment+Final_Theory) >=65 then "
                    + "'B' "
                    +"WHEN (Quiz+Mid+Assignment+Final_Theory) >=60 then "
                    + "'B-' "
                    +"WHEN (Quiz+Mid+Assignment+Final_Theory) >=55 then "
                    + "'C+' "   
                    +"WHEN (Quiz+Mid+Assignment+Final_Theory) >=50 then "
                    + "'C' "
                    +"WHEN (Quiz+Mid+Assignment+Final_Theory) >=45 then "
                    + "'C-' "
                    +"WHEN (Quiz+Mid+Assignment+Final_Theory) >=40 then "
                    + "'D+' " 
                    +"else 'E'"
                    + "end as Grade FROM tempEco");          
        } 
        else if (crseCode=="Data Structures"){         
            con.setSqlVW("DROP VIEW IF EXISTS `temp`");
            con.setSqlVW("create view temp as select case when Q1 > Q2 and Q1>Q3 and Q2>Q3 then (Q1+Q2)*0.05 when Q1 > Q2 and Q1>Q3 and Q2<Q3 then (Q1+Q3)*0.05 when Q2 > Q1 and Q2>Q3 and Q1>Q3 then (Q2+Q1)*0.05 when Q2 > Q1 and Q2>Q3 and Q1<Q3 then (Q2+Q3)*0.05 when Q3 > Q1 and Q3>Q2 and Q2>Q1 then (Q3+Q2)*0.05 else (Q3+Q1)*0.05 end as Quiz, mid*.2 as Mid, f_practicle*0.3 as Practical, f_theory*0.4 as Final_Theory FROM dsa where s_id='"+sid+"'; ");               
            con.setSql("SELECT Quiz,Mid,Practical,Final_Theory,(Quiz+Mid+Practical+Final_Theory) as Final_Marks, case "
                    + "WHEN (Quiz+Mid+Practical+Final_Theory) >=85 then "
                    + "'A+' "
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=80 then "
                    + "'A' "
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=75 then "
                    + "'A-' "
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=70 then "
                    + "'B+' "
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=65 then "
                    + "'B' "
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=60 then "
                    + "'B-' "
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=55 then "
                    + "'C+' "   
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=50 then "
                    + "'C' "
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=45 then "
                    + "'C-' "
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=40 then "
                    + "'D+' " 
                    +"else 'E'"
                    + "end as Grade FROM temp");   
        }
        else if (crseCode=="Object Oriented Analysis & Design"){         
            con.setSqlVW("DROP VIEW IF EXISTS `tempOOD`");
            con.setSqlVW("create view tempOOD as select case when Q1 > Q2 and Q1>Q3 and Q2>Q3 then (Q1+Q2)*0.05 when Q1 > Q2 and Q1>Q3 and Q2<Q3 then (Q1+Q3)*0.05 when Q2 > Q1 and Q2>Q3 and Q1>Q3 then (Q2+Q1)*0.05 when Q2 > Q1 and Q2>Q3 and Q1<Q3 then (Q2+Q3)*0.05 when Q3 > Q1 and Q3>Q2 and Q2>Q1 then (Q3+Q2)*0.05 else (Q3+Q1)*0.05 end as Quiz,case when A1>A2 and A1>A3 and A2>A3 then (A1+A2)*0.1 when A1>A2 and A1>A3 and A2<A3 then (A1+A3)*0.1 when A2>A1 and A2>A3 and A1>A3 then (A2+A1)*0.1 when A2 > A1 and A2>A3 and A1<A3 then (A2+A3)*0.1 when A3 > A1 and A3>A2 and A2>A1 then (A3+A2)*0.1 else (A3+A1)*0.1 end as Assignment, f_practicle*0.4 as Practical, f_theory*0.3 as Final_Theory FROM ood where s_id='"+sid+"'; ");               
            con.setSql("SELECT Quiz,Assignment,Practical,Final_Theory,(Quiz+Assignment+Practical+Final_Theory) as Final_Marks, case "
                    + "WHEN (Quiz+Assignment+Practical+Final_Theory) >=85 then "
                    + "'A+' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=80 then "
                    + "'A' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=75 then "
                    + "'A-' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=70 then "
                    + "'B+' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=65 then "
                    + "'B' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=60 then "
                    + "'B-' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=55 then "
                    + "'C+' "   
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=50 then "
                    + "'C' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=45 then "
                    + "'C-' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=40 then "
                    + "'D+' " 
                    +"else 'E'"
                    + "end as Grade FROM tempOOD");   
        }
        
        else if (crseCode=="System Analysis & Design"){         
            con.setSqlVW("DROP VIEW IF EXISTS `tempSAD`");
            con.setSqlVW("create view tempSAD as select case when Q1 > Q2 and Q1>Q3 and Q2>Q3 then (Q1+Q2)*0.05 when Q1 > Q2 and Q1>Q3 and Q2<Q3 then (Q1+Q3)*0.05 when Q2 > Q1 and Q2>Q3 and Q1>Q3 then (Q2+Q1)*0.05 when Q2 > Q1 and Q2>Q3 and Q1<Q3 then (Q2+Q3)*0.05 when Q3 > Q1 and Q3>Q2 and Q2>Q1 then (Q3+Q2)*0.05 else (Q3+Q1)*0.05 end as Quiz, mid*.2 as Mid, f_practicle*0.3 as Practical, f_theory*0.4 as Final_Theory FROM system_analysis where s_id='"+sid+"'; ");               
            con.setSql("SELECT Quiz,Mid,Practical,Final_Theory,(Quiz+Mid+Practical+Final_Theory) as Final_Marks, case "
                    + "WHEN (Quiz+Mid+Practical+Final_Theory) >=85 then "
                    + "'A+' "
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=80 then "
                    + "'A' "
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=75 then "
                    + "'A-' "
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=70 then "
                    + "'B+' "
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=65 then "
                    + "'B' "
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=60 then "
                    + "'B-' "
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=55 then "
                    + "'C+' "   
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=50 then "
                    + "'C' "
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=45 then "
                    + "'C-' "
                    +"WHEN (Quiz+Mid+Practical+Final_Theory) >=40 then "
                    + "'D+' " 
                    +"else 'E'"
                    + "end as Grade FROM tempSAD");   
        }
        
        else if (crseCode=="Internet Application"){         
            con.setSqlVW("DROP VIEW IF EXISTS `tempIA`");
            con.setSqlVW("create view tempIA as select case when Q1 > Q2 and Q1>Q3 and Q2>Q3 then (Q1+Q2)*0.05 when Q1 > Q2 and Q1>Q3 and Q2<Q3 then (Q1+Q3)*0.05 when Q2 > Q1 and Q2>Q3 and Q1>Q3 then (Q2+Q1)*0.05 when Q2 > Q1 and Q2>Q3 and Q1<Q3 then (Q2+Q3)*0.05 when Q3 > Q1 and Q3>Q2 and Q2>Q1 then (Q3+Q2)*0.05 else (Q3+Q1)*0.05 end as Quiz,case when A1>A2 and A1>A3 and A2>A3 then (A1+A2)*0.1 when A1>A2 and A1>A3 and A2<A3 then (A1+A3)*0.1 when A2>A1 and A2>A3 and A1>A3 then (A2+A1)*0.1 when A2 > A1 and A2>A3 and A1<A3 then (A2+A3)*0.1 when A3 > A1 and A3>A2 and A2>A1 then (A3+A2)*0.1 else (A3+A1)*0.1 end as Assignment, f_practicle*0.3 as Practical, f_theory*0.4 as Final_Theory FROM internet_application where s_id='"+sid+"'; ");               
            con.setSql("SELECT Quiz,Assignment,Practical,Final_Theory,(Quiz+Assignment+Practical+Final_Theory) as Final_Marks, case "
                    + "WHEN (Quiz+Assignment+Practical+Final_Theory) >=85 then "
                    + "'A+' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=80 then "
                    + "'A' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=75 then "
                    + "'A-' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=70 then "
                    + "'B+' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=65 then "
                    + "'B' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=60 then "
                    + "'B-' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=55 then "
                    + "'C+' "   
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=50 then "
                    + "'C' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=45 then "
                    + "'C-' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=40 then "
                    + "'D+' " 
                    +"else 'E'"
                    + "end as Grade FROM tempIA");   
        }
        else if (crseCode=="English"){         
            con.setSqlVW("DROP VIEW IF EXISTS `tempEng`");
            con.setSqlVW("create view tempEng as select case when Q1 > Q2 and Q1>Q3 and Q2>Q3 then (Q1+Q2)*0.05 when Q1 > Q2 and Q1>Q3 and Q2<Q3 then (Q1+Q3)*0.05 when Q2 > Q1 and Q2>Q3 and Q1>Q3 then (Q2+Q1)*0.05 when Q2 > Q1 and Q2>Q3 and Q1<Q3 then (Q2+Q3)*0.05 when Q3 > Q1 and Q3>Q2 and Q2>Q1 then (Q3+Q2)*0.05 else (Q3+Q1)*0.05 end as Quiz,case when A1>A2 and A1>A3 and A2>A3 then (A1+A2)*0.1 when A1>A2 and A1>A3 and A2<A3 then (A1+A3)*0.1 when A2>A1 and A2>A3 and A1>A3 then (A2+A1)*0.1 when A2 > A1 and A2>A3 and A1<A3 then (A2+A3)*0.1 when A3 > A1 and A3>A2 and A2>A1 then (A3+A2)*0.1 else (A3+A1)*0.1 end as Assignment, f_practicle*0.3 as Practical, f_theory*0.4 as Final_Theory FROM English where s_id='"+sid+"'; ");               
            con.setSql("SELECT Quiz,Assignment,Practical,Final_Theory,(Quiz+Assignment+Practical+Final_Theory) as Final_Marks, case "
                    + "WHEN (Quiz+Assignment+Practical+Final_Theory) >=85 then "
                    + "'A+' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=80 then "
                    + "'A' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=75 then "
                    + "'A-' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=70 then "
                    + "'B+' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=65 then "
                    + "'B' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=60 then "
                    + "'B-' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=55 then "
                    + "'C+' "   
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=50 then "
                    + "'C' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=45 then "
                    + "'C-' "
                    +"WHEN (Quiz+Assignment+Practical+Final_Theory) >=40 then "
                    + "'D+' " 
                    +"else 'E'"
                    + "end as Grade FROM tempEng");   
        }
        else{
            //task when click All
        }      
        
         ResultSet result = con.getResultSet();
         tblMarks.setModel(DbUtils.resultSetToTableModel(result));            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cCode = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMarks = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSID.setMinimumSize(new java.awt.Dimension(20, 50));
        getContentPane().add(txtSID, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 131, 175, 30));

        jLabel2.setText("Course");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        cCode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economics", "Object Oriented Analysis & Design", "English", "Internet Application", "Data Structures", "System Analysis & Design", "All", " " }));
        cCode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cCodeItemStateChanged(evt);
            }
        });
        getContentPane().add(cCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 175, 30));

        tblMarks.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblMarks);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 676, 120));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Students Results");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 11, -1, -1));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 96, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 849, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setText("Srudent ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 106, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lecturer/light-blue-abstract-wallpaper-19.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       showMarksById();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void cCodeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cCodeItemStateChanged
        showMarks();
    }//GEN-LAST:event_cCodeItemStateChanged
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMarks;
    private javax.swing.JTextField txtSID;
    // End of variables declaration//GEN-END:variables
}
