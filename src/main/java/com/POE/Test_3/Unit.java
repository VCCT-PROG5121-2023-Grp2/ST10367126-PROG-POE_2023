/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.POE.Test_3;
import com.POE.TaskClass;

//import com.POE.Test_2.Core_Test2;

/**
 *
 * @author Alexi
 */
public class Unit {
    
    static  String[] value ;
    
    public static void setDevsName( String[] newValue) {
            value = newValue;
        }
       
    public  String [] getDevsName(){
       return value;
    }
      
   public static void main(String[] args){
    
        Core_Test3 core = new Core_Test3();
        core.main(null);
        
        core.createTask();
        TaskClass task = core.unitT3;
        
        setDevsName(task.dev);
  
       
        
   
    }  

}
//-------------------------------------------------END OF FILE-------------------------------------------------//