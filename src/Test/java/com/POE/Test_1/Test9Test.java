package com.POE.Test_1;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test9Test {
    
    Test9 t = new Test9();
    
    @Test
    public void testGetValue() {
        t.main(null);
        Boolean actual = t.GetValue();
  
        assertFalse("Password does not meets complexity requirements",actual);
    }
}