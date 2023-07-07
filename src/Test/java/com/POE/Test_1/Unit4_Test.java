package com.POE.Test_1;
import org.junit.Test;
import static org.junit.Assert.*;

public class Unit4_Test {
    
    Test3 t = new Test3();
    
    @Test
    public void testGetValue() {
        System.out.println("---------------------------");
        System.out.println("Unit Test - 4");
        System.out.println("---------------------------\n");
        t.main(null);
        String actual="";
        Boolean Value = t.GetValue();
        
        if(Value == false){
            actual ="Password is not correctly formatted, please ensure that the password  contains at least 8 characters, a capital letter, a number and a special character";
        }
        String expected = "Password is not correctly formatted, please ensure that the password  contains at least 8 characters, a capital letter, a number and a special character";

       assertEquals(expected, actual);
       System.out.println(expected);
  
    }
}
//----------------------------------... END OF FILE...--------------------//