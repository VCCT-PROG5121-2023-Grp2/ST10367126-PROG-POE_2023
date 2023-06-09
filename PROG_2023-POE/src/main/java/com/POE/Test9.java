/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.POE;

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
        
        Login Test = new Login("Jose","Lubota","kyl_1","2J4");
        setValue(Test.checkPasswordComplexity());
    }

    
}
