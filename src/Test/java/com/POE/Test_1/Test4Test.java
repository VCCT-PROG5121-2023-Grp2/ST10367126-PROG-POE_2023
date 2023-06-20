package com.POE.Test_1;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test4Test {
    
    Test4 t4 = new Test4();
    
    @Test
    public void testGetValue() {
        System.out.println("---------------------------");
        System.out.println("Unit Test - 5");
        System.out.println("---------------------------\n");
        
        t4.main(null);
        Boolean v= false;
        String actual = t4.GetValue();
        String expected = "A successful login";
        if (expected.equals(actual)){
            v = true;
        }
       // assertEquals(expected, actual);
        assertTrue(v);
        System.out.println("True");
    }
}
//----------------------------------... END OF FILE...--------------------//