package com.POE.Test_1;
import com.POE.MyLoginClass;

/**
 *
 * @author Alexi
 */
public class Test1 {
    public Test1(){}
      
    static Boolean value ;
    public static void setValue(Boolean newValue) {
            value = newValue;
        }
       
    public Boolean GetValue(){
       return value;
    }
        
      
        
      public static void main(String[] args){
        
        MyLoginClass Test0 = new MyLoginClass("Jose","Lubota","kyle!!!!!!!","2J@42J@42J@4");
 
        setValue(Test0.c_UserName(Test0.Username));
    }

    
}
