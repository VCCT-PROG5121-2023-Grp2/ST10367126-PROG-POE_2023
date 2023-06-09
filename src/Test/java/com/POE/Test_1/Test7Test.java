package com.POE.Test_1;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test7Test {
    
    Test7 t = new Test7();
    
    @Test
    public void testGetValue() {
        t.main(null);
        Boolean actual = t.GetValue();
  
        assertFalse("False",actual);
    }
}