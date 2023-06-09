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
public class Unit_4 {
    
    static String value ;
    static String[] taskN;
    static String devname;
    static String[] devN;
   //--------------------------SETTETS---------------------------------------------
   //-----------
    public static void setTaskName(String[] newValue) {
            taskN = newValue;
        }
    
     //-----------
    public void setDevName(String newValue) {
            devname = newValue;
        }
    public static void setDN(String[] dv){
        devN = dv;
    }
    //--------------------...GETTRS...------------------------------------------
    //-----------    
    public  String  getTaskName(){
        for (int i=0; i< 4; i++){
            if(devN[i].equals(devname)){
                value = taskN [i];
            }
        }
       return value;
    }
    //----------- 

    //---------...-----------...Main...------------------------------------------
    //-----------     
   public static void main(String[] args){
    
        Core_Test3 core = new Core_Test3();
        core.main(null);
        
        core.createTask();
        TaskClass task = core.unitT3;
        
   
        setTaskName(task.t_name);
        setDN(task.dev);

    }  
    
}
