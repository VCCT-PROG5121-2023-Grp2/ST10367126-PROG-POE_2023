/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.POE;

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
        
        Login Test0 = new Login("Jose","Lubota","kyle!!!!!!!","2J@42J@42J@4");
 
        setValue(Test0.checkUserName());
    }

    
}
