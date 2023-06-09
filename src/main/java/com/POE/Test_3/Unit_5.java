/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.POE.Test_3;
import com.POE.TaskClass;


/**
 * @author Jose Lubota
 */
public class Unit_5 {
    
    static String value ;
    static int idx =-1;
    Core_Test3 task = new Core_Test3();
    
    //---------task variable
   
    static String[] taskN;
    static String[] t_des;
    static int[] t_duration;
    static String[] dev;
    static String[] ID;
    static String[] t_status;
    
    //---------task variable
   
    static String[] newtaskN = new String[3];
    static String[] newt_des = new String[3];
    static int[] newt_duration = new int[3];
    static String[] newdev = new String[3];
    static String[] newID = new String[3];
    static String[] newt_status = new String[3];
   //--------------------------SETTETS---------------------------------------------
   //-----------
    /*
     unitT3.increment_TNum();
        unitT3.set_TaskNam("Create Reports");
        unitT3.set_TaskDescription("");
        unitT3.set_TaskDevDetails("Samantha Paulson");
        unitT3.set_TaskDuration(2);
        unitT3.set_TaskStatus("Done");
        unitT3.createTaskID();
        unitT3.increment_Loop();
    */
    
    //-----------
    public static void setTask(String[] tn, String[] tdes, String[] dv,int[] tdur,String[] tstat, String[] id ){
        taskN = tn;
        t_des = tdes;
        t_duration= tdur;
        dev= dv;
        ID = id;
        t_status =tstat;
        setNewTask();
    }
    public static void setNewTask(){
        newtaskN = taskN;
        newt_des = t_des;
        newt_duration = t_duration;
        newdev = dev;
        newID = ID;
        newt_status = t_status;
        
    }
    
     
    //--------------------...GETTRS...------------------------------------------    
    //----------- 
    public String delTask(String tname){
        for(int i=0;i<4; i++){
            if(tname.equals(taskN[i])){
                idx = i; 
            }
        }
        del(idx); 
        return "";
    }
    
    //---------------
    public void del(int idx){ 
        
        for(int i =0; i < 5; i++){
            if(i!=idx){
            newtaskN[i] = taskN[i];
            newt_des[i] = t_des[i];
            newt_duration[i] = t_duration[i];
            newdev[i] = dev[i];
            newID[i] = ID[i];
            newt_status[i] = t_status[i];  
            }
        }
        taskN = newtaskN;
        t_des = newt_des;
        t_duration = newt_duration;
        dev = newdev;
        ID = newID;
        dev = newt_status;
        
    }
    
    public String checkDel(){
        if(taskN.length == 3);
        return "Create reports deleted";
    }
        

    //---------...-----------...Main...------------------------------------------
    //-----------     
   public static void main(String[] args){
    
        Core_Test3 core = new Core_Test3();
        core.main(null);
        
        core.createTask();
        TaskClass task = core.unitT3;
        
        //String[] tn, String[] tdes, String[] dv,int[] tdur,String[] tstat, String[] id
        
        String[] TaskName = task.t_name;
        String[] TaskDes = task.t_des ;
        String[] TaskDev = task.dev ;
        String[] TaskID = task.id ;
        String[] TaskStat = task.t_status;
        int[] TaskDur = task.t_duration ;
        
        setTask(TaskName, TaskDes,TaskDev,TaskDur,TaskStat,TaskID);
        
   
       
       
        
    }  
}
//-------------------------------------------------END OF FILE-------------------------------------------------//
