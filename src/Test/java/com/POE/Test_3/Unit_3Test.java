package com.POE.Test_3;
import static org.junit.Assert.*;
import org.junit.Test;

public class Unit_3Test {
    
    Unit_3 test3 = new Unit_3();
    
    @Test
    public void testMain() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("------ Unit Test 3- Test 3");
        test3.main(null); 
        String tname = test3.calcDevName("Create Login");
        String devname = test3.getDevName();
        
        
        assertEquals("Mike Smith",devname);
        assertEquals("Create Login",tname);
        System.out.println("\n" +devname +", "+ tname);

    }
}

//--------------------END OF FILE-----------------------------------------------------------------------------//