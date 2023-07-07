package com.POE.Test_1;
import org.junit.Test;
import static org.junit.Assert.*;

public class Unit10_Test {
    
    Test9 t = new Test9();
    
    @Test
    public void testUnit10() {
        System.out.println("---------------------------");
        System.out.println("Unit Test - 10");
        System.out.println("---------------------------\n");
        
        t.main(null);
        Boolean actual = t.GetValue();
  
        assertFalse(actual);
        System.out.println("False");
    }
    //----------------------------------... END OF FILE...--------------------//
}