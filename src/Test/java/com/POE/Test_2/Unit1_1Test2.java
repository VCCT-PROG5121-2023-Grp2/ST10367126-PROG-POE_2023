package com.POE.Test_2;
import static org.junit.Assert.*;
import org.junit.Test;

public class Unit1_1Test2 {
    
    Unit1 test1 = new Unit1();
    
    @Test
    public void testMain() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("------ Unit Test 2 - Test 1.1");
        test1.main(null);
        
        Boolean value = true ;
        String expected = test1.GetActual();
        String actual = "";
        
       value = test1.GetValue();
       if (value){
           actual = test1.GetActual();
           System.out.println("\nTask successfully captured");
       }else{
           System.out.println("\nPlease enter a task description less than 50 characters");
       }
       
       assertEquals(expected,actual);
    } 
    
}

//--------------------END OF FILE-----------------------------------------------------------------------------//