/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.POE;

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
        
        Login Test = new Login("Jose","Lubota","kyl_1","2J@42J@42J@4");
        Test.registerUser("kyl_11111","2J@4");
        Test.loginUser("kyl_11111", "2J@4");
        setValue(Test.returnLoginStatus());
    }

    
}
