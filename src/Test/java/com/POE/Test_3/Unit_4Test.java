package com.POE.Test_3 ;
import static org.junit.Assert.*;
import org.junit.Test;

public class Unit_4Test {
    
    Unit_4 test4 = new Unit_4();
    
    @Test
    public void testMain() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("------ Unit Test 3- Test 4");
         
        test4.setDevName("Samantha Paulson");
        test4.main(null);
        String tname = test4.getTaskName();
        
        assertEquals("Create Reports",tname);
       
        System.out.println("\n"+tname);

    }
}

//--------------------END OF FILE-----------------------------------------------------------------------------//