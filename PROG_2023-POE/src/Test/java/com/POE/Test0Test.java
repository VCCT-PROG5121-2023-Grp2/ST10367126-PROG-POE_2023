package com.POE;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test0Test {
    
    Test0 t = new Test0();
    
    @Test
    public void testGetValue() {
        t.main(null);
        String actual="";
        Boolean Value = t.GetValue();
        
        if(Value){
            actual ="Username successfully  captured";
        }
        String expected = "Username successfully  captured";

       assertEquals(expected, actual);
  
    }
}