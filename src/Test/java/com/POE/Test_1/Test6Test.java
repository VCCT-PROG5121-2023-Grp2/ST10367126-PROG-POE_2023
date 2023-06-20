package com.POE.Test_1;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test6Test {
    
    Test6 t = new Test6();
    
    @Test
    public void testGetValue() {
        System.out.println("---------------------------");
        System.out.println("Unit Test - 7");
        System.out.println("---------------------------\n");
        t.main(null);
        Boolean actual = t.GetValue();
  
        assertTrue("True",actual);
        System.out.println("True");
    }
}
        //----------------------------------... END OF FILE...--------------------//
