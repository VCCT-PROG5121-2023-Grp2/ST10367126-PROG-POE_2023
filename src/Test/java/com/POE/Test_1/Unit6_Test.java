package com.POE.Test_1;
import org.junit.Test;
import static org.junit.Assert.*;

public class Unit6_Test {
    
    Test5 t = new Test5();
    
    @Test
    public void testGetValue() {
        System.out.println("---------------------------");
        System.out.println("Unit Test - 6\n");     
        t.main(null);
        Boolean v= true;
        String actual = t.GetValue();
        String expected = "A failed login";
        if (expected == actual){
            v = false;
        }
        
        assertFalse("False",v);
        System.out.println("False");
    }
}
        //----------------------------------... END OF FILE...--------------------//
