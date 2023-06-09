package com.POE.Test_2;
import com.POE.TaskClass;


/**
 *
 * @author Jose Lubota
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