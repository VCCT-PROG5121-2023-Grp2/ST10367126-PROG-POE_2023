package com.POE.Test_1;
import org.junit.Test;
import static org.junit.Assert.*;

public class Unit2_Test {
    
    Test1 t = new Test1();
    
    @Test
    public void testGetValue() {
        System.out.println("---------------------------");
        System.out.println("Unit Test - 2\n");
        t.main(null);
        String actual="";
        Boolean Value = t.GetValue();
        
        if(Value == false){
            actual ="Username is not correctly formatted,  please ensure that  your username  contains an  underscore and is no  more than 5 characters in length";
        }
        String expected = "Username is not correctly formatted,  please ensure that  your username  contains an  underscore and is no  more than 5 characters in length";

       assertEquals(expected, actual);
       System.out.println(expected);
  
    }
}
//----------------------------------... END OF FILE...--------------------//