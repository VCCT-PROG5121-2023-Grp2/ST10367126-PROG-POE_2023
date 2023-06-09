package com.POE.Test_1;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test5Test {
    
    Test5 t = new Test5();
    
    @Test
    public void testGetValue() {
        t.main(null);
        Boolean v= true;
        String actual = t.GetValue();
        String expected = "A failed login";
        if (expected == actual){
            v = false;
        }
        
        assertFalse("False",v);
    }
}