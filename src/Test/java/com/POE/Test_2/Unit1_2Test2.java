package com.POE.Test_2;
import static org.junit.Assert.*;
import org.junit.Test;

public class Unit1_2Test2 {
    
    Unit1_2 test1 = new Unit1_2();
    
    @Test
    public void testMain() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("------ Unit Test 2 - Test 1.2");
        test1.main(null);
        
        Boolean value = true ;
        String actual = "Please enter a task description less than 50 characters";
        
       value = test1.GetValue();
       System.out.println(value);
       if (value){
           actual = test1.GetActual();
           System.out.println("\nTask successfully captured");
       }else{
           System.out.println("\nPlease enter a task description less than 50 characters");
       }
       
      assertEquals("Please enter a task description less than 50 characters",actual);
    } 
    
}

//--------------------END OF FILE-----------------------------------------------------------------------------//