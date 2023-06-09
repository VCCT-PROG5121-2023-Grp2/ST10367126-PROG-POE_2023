package com.POE.Test_2;
import static org.junit.Assert.*;
import org.junit.Test;

public class Unit3Test {
    
    Unit3 test3 = new Unit3();
    
    @Test
    public void testMain() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("------ Unit Test 3- Test 3");
        test3.main(null);
        
        int pastValue = test3.GetValue();
        int currentV = test3.GetValue2();
        
        assertEquals(18,pastValue);
        assertEquals(89,currentV);
        
        System.out.println("\n" +pastValue +" on the last itertion of the loop");
        System.out.println("\n"+currentV + " for the additional data" );
                
    }  
}

//--------------------END OF FILE-----------------------------------------------------------------------------//