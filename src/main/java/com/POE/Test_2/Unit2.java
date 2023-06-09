/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.POE.Test_2;
import com.POE.TaskClass;

//import com.POE.Test_2.Core_Test2;

/**
 *
 * @author Alexi
 */
public class Unit2 {
    
    static Boolean value ;
    static String[] actual ;
    
    public static void setValue(Boolean newValue) {
            value = newValue;
        }
    public static void setActual(String[] newValue) {
            actual = newValue;
        }
       
    public Boolean GetValue(){
       return value;
    }
     public String[] GetActual(){
       return actual;
    }
      
   public static void main(String[] args){
    
        Core_Test2 core = new Core_Test2();
        core.createTask();
        core.main(null);
  
        
        TaskClass task = core.task;
        
        setActual(task.id);
                 

    }  

}
//-------------------------------------------------END OF FILE-------------------------------------------------//