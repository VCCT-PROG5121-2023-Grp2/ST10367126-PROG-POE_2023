package com.POE.Test_3;
import com.POE.TaskClass;

/**
 * @author Jose Lubota
 */
public class Unit_3 {
    
    static  String value ;
    static String[] set;
    static String[] name;
    static String dev;
   //--------------------------SETTETS---------------------------------------------
   //-----------
    public static void setTaskName(String[] newValue) {
            set = newValue;
        }
    
     //-----------
    public static void setDevName(String[] newValue) {
            name = newValue;
        }
    //--------------------...GETTRS...------------------------------------------
    //-----------    
    public  String  calcDevName(String tname){
        for (int i=0; i< 4; i++){
            if(set[i].equals(tname)){
                value = set[i];
                dev = name[i];
            }
        }
       return value;
    }  
    //----------- 
   public String getDevName(){
       return dev;
   }
    
    //---------...-----------...Main...------------------------------------------
    //-----------     
   public static void main(String[] args){
    
        Core_Test3 core = new Core_Test3();
        core.main(null);
        
        core.createTask();
        TaskClass task = core.unitT3;
        
        
        String[] value = task.t_name;
        String[] value2 = task.dev; 
        setTaskName(value);
        setDevName(value2);

    }  
}
//-------------------------------------------------END OF FILE-------------------------------------------------//