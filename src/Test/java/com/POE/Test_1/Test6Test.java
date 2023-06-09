package com.POE.Test_1;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test6Test {
    
    Test6 t = new Test6();
    
    @Test
    public void testGetValue() {
        t.main(null);
        Boolean actual = t.GetValue();
  
        assertTrue("True",actual);
    }
}