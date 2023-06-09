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
public class Unit_2 {
    
    static  int value ;
    static  String value2 ;
    
    public static void setTaskDur( int newValue) {
            value = newValue;
        }
       
    public static void setDevName( String newValue) {
            value2 = newValue;
        }
       
    public  String  getDevName(){
       return value2;
    }
    public  int  getTaskDur(){
       return value;
    }
      
   public static void main(String[] args){
    
        Core_Test3 core = new Core_Test3();
        core.main(null);
        
        core.createTask();
        TaskClass task = core.unitT3;
        
        int highest = task.t_duration[0];
        int pos=0;
        String devName;
        int num;
        for (int i=1; i < task.loop; i++){
            num =task.t_duration[i];
            if (highest < num){
                highest = num;
                pos = i;
            }
        }
        devName = task.dev[pos];
        setTaskDur(highest);
        setDevName(devName);
        
       
        
   
    }  

}
//-------------------------------------------------END OF FILE-------------------------------------------------//