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
class Student {
        private String s_id,d_id,s_name,s_dob,gender;
        
        public Student(String s_id, String d_id, String s_name, String s_dob, String gender){
            this.s_id=s_id;
            this.d_id=d_id;
            this.s_name=s_name;
            this.s_dob=s_dob;
            this.gender=gender;
            
        }

    Student(String string, String string0, String string1, String string2, String string3, String string4,String string5) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
        public String getSid(){
            return s_id;
        }
        public String getDid(){
            return d_id;
        }
        public String getName(){
            return s_name;
        }
        public String getDOB(){
            return s_dob;
        }
       
        public String getGender(){
            return gender;
        }
}
