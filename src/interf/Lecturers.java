/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecmiss;

/**
 *
 * @author Dell
 */
public class Lecturers {
    
    private char lec_id;
    private char d_id;
    private String lec_name;
    private String lec_email;
    private String lec_contact;
        

public void setLec_id(char lec_id){
        this.lec_id=lec_id;
}
public char getLec_id(){
    return lec_id;
}

public void setd_id(char d_id){
    this.d_id=d_id;
}
public char getd_id(){
    return d_id;
}
public void setLec_name(String lec_name){
    this.lec_name=lec_name;
}
public String lec_name(){
    return lec_name;
}
public void setLec_email(String lec_email){
    this.lec_email=lec_email;
}
public String getLec_email(){
    return lec_email;
}
public void setLec_contact(String lec_contact){
    this.lec_contact=lec_contact;
}
public String getLec_contact(){
    return lec_contact;
}

}