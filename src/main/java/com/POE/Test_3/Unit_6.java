package com.POE.Test_3 ;
import com.POE.TaskClass;
import com.POE.core;

/**
 * @author Jose Lubota
 */
public class Unit_6 {
    
    
    //---------...-----------...Main...------------------------------------------
    //-----------     
   public static void main(String[] args){
    
        Core_Test3 core = new Core_Test3();
        core.main(null);
        
        core.createTask();
        TaskClass task = core.unitT3;
        
        task.returnDetails();
    }  
}
//-------------------------------------------------END OF FILE-------------------------------------------------//