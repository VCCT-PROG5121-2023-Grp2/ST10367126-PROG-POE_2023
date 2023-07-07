package com.POE.Test_1;
import org.junit.Test;
import static org.junit.Assert.*;

public class Unit9_Test {
    
    Test8 t = new Test8();
    
    @Test
    public void testUnit9() {
        System.out.println("---------------------------");
        System.out.println("Unit Test - 9\n");
        t.main(null);
        Boolean actual = t.GetValue();
  
        assertTrue(actual);
        System.out.println("True");
    }
}
//----------------------------------... END OF FILE...--------------------//