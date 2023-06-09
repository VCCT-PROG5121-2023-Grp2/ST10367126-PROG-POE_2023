package com.POE.Test_1;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test2Test {
    
    Test2 t = new Test2();
    
    @Test
    public void testGetValue() {
        t.main(null);
        String actual="";
        Boolean Value = t.GetValue();
        
        if(Value){
            actual ="Password successfully captured";
        }
        String expected = "Password successfully captured";

       assertEquals(expected, actual);
  
    }
}