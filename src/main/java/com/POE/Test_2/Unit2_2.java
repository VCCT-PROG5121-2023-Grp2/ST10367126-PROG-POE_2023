/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.POE.Test_2;
import com.POE.Test_3.Core_Test3;
import com.POE.TaskClass;

/**
 *
 * @author Alexi
 */
public class Unit2_2 {    
    static  String[] value ;
    
    public static void setIDs( String[] newValue) {
            value = newValue;
        }
       
    public  String [] getIDs(){
       return value;
    }
      
   public static void main(String[] args){
    
        Core_Test3 core = new Core_Test3();
        core.main(null);
        
        core.createTask();
        TaskClass task = core.unitT3;
        
        task.t_name[3] ="cr";
        task.dev[3]  ="nd_ x";
        task.UpdateTaskID(3);
        
        setIDs(task.id);

  
       
        
   
    }  

}
//-------------------------------------------------END OF FILE-------------------------------------------------//
    
