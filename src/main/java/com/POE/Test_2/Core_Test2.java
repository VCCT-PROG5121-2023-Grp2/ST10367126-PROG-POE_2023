/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.POE.Test_2;
import com.POE.TaskClass;


/**
 *
 * @author Alexi
 */
public class Core_Test2 {
    
    TaskClass task;
    
    public void createTask(){
        //-------------------------------------Test 1--------------------------------------------------------//
        task = new TaskClass();
        task.increment_TNum();
        task.set_TaskNam("Login Feature");
        task.set_TaskDescription("Create Login to authenticate users");
        task.set_TaskDevDetails("Robyn Harrison ");
        task.set_TaskDuration(8);
        task.set_TaskStatus("To Do");
        task.createTaskID();
        task.increment_Loop(); 
        //---------------------------------------------------------------------------------------------//
        
        //-------------------------------------Test 1--------------------------------------------------------//
        task.increment_TNum();
        task.set_TaskNam("Add Task Feature");
        task.set_TaskDescription("Create Add Task feature to add task users");
        task.set_TaskDevDetails("Mike Smith");
        task.set_TaskDuration(10);
        task.set_TaskStatus("Doing");
        task.createTaskID();       
        
    }
      
   public static void main(String[] args){
       Core_Test2 core = new Core_Test2();
       core.createTask();
         
                   
        }
}
//---------------------------------------------------END OF FILE--------------------------------------------------------//
