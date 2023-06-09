package com.POE;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test8Test {
    
    Test8 t = new Test8();
    
    @Test
    public void testGetValue() {
        t.main(null);
        Boolean actual = t.GetValue();
  
        assertTrue("Password meets complexity requirements",actual);
    }
}