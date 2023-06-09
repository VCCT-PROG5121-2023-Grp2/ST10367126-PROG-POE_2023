package com.POE.Test_2;
import static org.junit.Assert.*;
import org.junit.Test;

public class Unit2_2Test {
    
    Unit2_2 test1 = new Unit2_2();
    
    @Test
    public void testMain() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("------ Unit Test 2- Test 2.2");
        test1.main(null);
        String[] id = test1.getIDs();
        String[] expected = {"CR:0:IKE", "CR:1:ARD", "CR:2:THA", "CR:3:ND_"};
       
        for(int i=0; i < 4; i++){
            assertEquals(expected[i], id[i]);
            System.out.println("\n" + id[i]);
        }
        
      
       
        
        
    } 
    
}

//--------------------END OF FILE-----------------------------------------------------------------------------//