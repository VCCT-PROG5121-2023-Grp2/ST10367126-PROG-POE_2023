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
public class Unit3 {
    
    static  int value ;
    static  int value2 ;
    
    public static void setValue( int newValue) {
            value = newValue;
        }
    public static void setValue2( int newValue) {
            value2 = newValue;
        }
       
    public  int GetValue(){
       return value;
    }
     public  int GetValue2(){
       return value2;
    }
      
   public static void main(String[] args){
    
        Core_Test2 core = new Core_Test2();
        core.createTask();
        core.main(null);
        int value;
        int value2;
  
        
        TaskClass task = core.task;
     
        value = task.returnTotalHours();
        setValue(value);
        
        task.increment_Loop();
        task.increment_TNum();
        task.set_TaskDuration(10);
        
        task.increment_Loop();
        task.increment_TNum();
        task.set_TaskDuration(12);
        
        task.increment_Loop();
        task.increment_TNum();
        task.set_TaskDuration(55);
        
        task.increment_Loop();
        task.increment_TNum();
        task.set_TaskDuration(11);
        
        task.increment_Loop();
        task.increment_TNum();
        task.set_TaskDuration(1);
        
        value2 = task.returnTotalHours();
        value2 = value2 - value;
        
        setValue2(value2);
        
        
    }  

}
//-------------------------------------------------END OF FILE-------------------------------------------------//