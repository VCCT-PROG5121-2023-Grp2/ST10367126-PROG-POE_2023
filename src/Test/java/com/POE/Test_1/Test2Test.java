package com.POE.Test_1;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test2Test {
    
    Test2 t = new Test2();
    
    @Test
    public void testGetValue() {
         System.out.println("---------------------------");
        System.out.println("Unit Test - 3");
        System.out.println("---------------------------\n");
        t.main(null);
        String actual="";
        Boolean Value = t.GetValue();
        
        if(Value){
            actual ="Password successfully captured";
        }
        String expected = "Password successfully captured";

       assertEquals(expected, actual);
       System.out.println("Password successfully captured");
  
    }
}
//----------------------------------... END OF FILE...--------------------//