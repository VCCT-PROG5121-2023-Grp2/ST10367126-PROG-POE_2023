package com.POE.Test_1;
import com.POE.MyLoginClass;

/**
 *
 * @author Alexi
 */
public class Test9 {
  
      
    static Boolean value ;
    public static void setValue(Boolean newValue) {
            value = newValue;
        }
       
    public Boolean GetValue(){
       return value;
    }
        
      public static void main(String[] args){
        
        MyLoginClass Test = new MyLoginClass("Jose","Lubota","kyl_1","2J4");
        setValue(Test.password_matcher(Test.Password) );
    }

    
}
