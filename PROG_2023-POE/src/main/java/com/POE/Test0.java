/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.POE;

/**
 *
 * @author Alexi
 */
public class Test0 {
    public Test0(){}
      
    static Boolean value ;
    public static void setValue(Boolean newValue) {
            value = newValue;
        }
       
    public Boolean GetValue(){
       return value;
    }
        
      
        
      public static void main(String[] args){
        
        Login Test0 = new Login("Jose","Lubota","kyl_1","2J@42J@42J@4");
        Test0.registerUser("kyl_1","2J@42J@42J@4");
        Test0.loginUser("kyl_1", "2J@42J@42J@4");
        Test0.returnLoginStatus();
        setValue(Test0.c_UserName(Test0.Username));
    }

    
}
