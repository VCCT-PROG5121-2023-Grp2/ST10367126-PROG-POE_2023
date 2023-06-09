package com.POE.Test_3 ;
import static org.junit.Assert.*;
import org.junit.Test;

public class Unit_5Test {
    
    Unit_5 test5 = new Unit_5();
    
    @Test
    public void testMain() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("------ Unit Test 3- Test 5---------------");
        
        test5.main(null);
        test5.delTask("Create Reports");
        
        String msg= test5.checkDel();
        assertEquals("Create reports deleted",msg);
        System.out.println("\nEntry 'Create Reports' successfully deleted");

    }
}

//--------------------END OF FILE-----------------------------------------------------------------------------//