package com.POE;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test1Test {
    
    Test1 t = new Test1();
    
    @Test
    public void testGetValue() {
        t.main(null);
        String actual="";
        Boolean Value = t.GetValue();
        
        if(Value == false){
            actual ="Username is not correctly formatted,  please ensure that  your username  contains an  underscore and is no  more than 5 characters in length";
        }
        String expected = "Username is not correctly formatted,  please ensure that  your username  contains an  underscore and is no  more than 5 characters in length";

       assertEquals(expected, actual);
  
    }
}