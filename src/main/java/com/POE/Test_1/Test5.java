package com.POE.Test_1;
import com.POE.MyLoginClass;

/**
 *
 * @author Alexi
 */
public class Test5 {
    public Test5(){}
      
    static String value ;
    public static void setValue(String newValue) {
            value = newValue;
        }
       
    public String GetValue(){
       return value;
    }
        
      
        
      public static void main(String[] args){
        
        MyLoginClass Test = new MyLoginClass("Jose","Lubota","kyl_1","2J@42");

        Test.registerStatus("kyl_11111","2J@4");
        Test.loginUser("kyl_11111", "2J@4");
        setValue(Test.LoginStatus());
    }

    
}
