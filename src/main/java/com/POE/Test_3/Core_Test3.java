/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.POE.Test_3;
import com.POE.TaskClass;
/**
 *
 * @author Alexi
 */
public class Core_Test3 {
    public TaskClass unitT3;
    
    public void createTask(){
        
        unitT3 = new TaskClass();
        
        //------------------------------Test N-1----------------------------------//
        //-----
        unitT3.increment_TNum();
        unitT3.set_TaskNam("Create Login");
        unitT3.set_TaskDescription("");
        unitT3.set_TaskDevDetails("Mike Smith");
        unitT3.set_TaskDuration(5);
        unitT3.set_TaskStatus("To Do");
        unitT3.createTaskID();
        unitT3.increment_Loop();
        
        //------------------------------Test N-2----------------------------------//
        unitT3.increment_TNum();
        unitT3.set_TaskNam("Create Add Features");
        unitT3.set_TaskDescription("");
        unitT3.set_TaskDevDetails("Edward Harrington");
        unitT3.set_TaskDuration(8);
        unitT3.set_TaskStatus("Doing");
        unitT3.createTaskID();
        unitT3.increment_Loop();
       
        //------------------------------Test N-3----------------------------------//
        unitT3.increment_TNum();
        unitT3.set_TaskNam("Create Reports");
        unitT3.set_TaskDescription("");
        unitT3.set_TaskDevDetails("Samantha Paulson");
        unitT3.set_TaskDuration(2);
        unitT3.set_TaskStatus("Done");
        unitT3.createTaskID();
        unitT3.increment_Loop();
        
        //------------------------------Test N-4----------------------------------//
        unitT3.increment_TNum();
        unitT3.set_TaskNam("Add Arrays");
        unitT3.set_TaskDescription("Create Login to authenticate users");
        unitT3.set_TaskDevDetails("Glenda Oberholzer");
        unitT3.set_TaskDuration(11);
        unitT3.set_TaskStatus("To Do");
        unitT3.createTaskID();
        unitT3.increment_Loop();
        
        
    }
    
    public static void main(String[] args){
        
        //------------------------------ ----------------------------------//
        //----
        Core_Test3 core = new Core_Test3();
        core.createTask();
        //------------------------------ ----------------------------------//
        
    }    
}
//--------------------END OF FILE-----------------------------------------------------------------------------//
