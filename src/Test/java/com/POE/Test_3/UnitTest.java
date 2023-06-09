package com.POE.Test_3;
import static org.junit.Assert.*;
import org.junit.Test;

public class UnitTest {
    
    Unit test1 = new Unit();
    
    @Test
    public void testMain() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("------ Unit Test 3- Test 1");
        test1.main(null);
        String[] dev = test1.getDevsName();
        String[] expected = {"Mike Smith", "Edward Harrington", "Samantha Paulson", "Glenda Oberholzer"};
       
        for(int i=0; i < 4; i++){
            assertEquals(expected[i], dev[i]);
            System.out.println("\n" + dev[i]);
        }
        
      
       
        
        
    } 
    
}

//--------------------END OF FILE-----------------------------------------------------------------------------//