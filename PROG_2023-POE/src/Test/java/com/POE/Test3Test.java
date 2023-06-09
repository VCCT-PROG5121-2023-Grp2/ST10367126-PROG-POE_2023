package com.POE;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test3Test {
    
    Test3 t = new Test3();
    
    @Test
    public void testGetValue() {
        t.main(null);
        String actual="";
        Boolean Value = t.GetValue();
        
        if(Value == false){
            actual ="Password is not correctly formatted, please ensure that the password  contains at least 8 characters, a capital letter, a number and a special character";
        }
        String expected = "Password is not correctly formatted, please ensure that the password  contains at least 8 characters, a capital letter, a number and a special character";

       assertEquals(expected, actual);
  
    }
}