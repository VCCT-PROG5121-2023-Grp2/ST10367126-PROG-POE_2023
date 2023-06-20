package com.POE.Test_1;
import com.POE.MyLoginClass;

/**
 *
 * @author Alexi
 */
public class Test0 {
    public Test0(){}
    
    //----------------------------------------------
    //------------------
    static Boolean value ;
    static String username;
    static String password;
    
    //----------------------------------------------
    //-------------------
    public static void setValue(Boolean newValue) {
            value = newValue;
        }
    public static void setFN(String un) {
            username = un;
        }
    public static void setSN(String pw) {
             password = pw;
        }
    //----------------------------------------------
    //-------------------  
    public Boolean GetValue(){
       return value;
    }
    public String GetFN(){
       return username;
    } 
    public String GetSN(){
       return password;
    } 
   
    public static void main(String[] args){
        
        MyLoginClass Test0 = new MyLoginClass("Jose","Lubota","kyl_1","2J@42J@42J@4");
       
        setValue(Test0.c_UserName(Test0.Username));
        setFN(Test0.FirstName);
        setSN(Test0.Surname);
        
    }
   
}
  