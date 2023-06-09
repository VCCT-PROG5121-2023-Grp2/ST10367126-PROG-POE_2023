package com.POE;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test4Test {
    
    Test4 t4 = new Test4();
    
    @Test
    public void testGetValue() {
        t4.main(null);
        Boolean v= false;
        String actual = t4.GetValue();
        String expected = "A successful login";
        if (expected == actual){
            v = true;
        }
       // assertEquals(expected, actual);
        assertTrue("True",v);
    }
}