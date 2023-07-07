import com.POE.Test_1.* ;
import org.junit.Test;


public class Unit_Test1 {
    
    Unit1_Test ut = new Unit1_Test();
    Unit2_Test ut2 = new Unit2_Test();
    Unit3_Test ut3= new Unit3_Test();
    Unit4_Test ut4 = new Unit4_Test();  
    Unit5_Test ut5 = new Unit5_Test();
    Unit6_Test ut6 = new Unit6_Test();
    Unit7_Test ut7 = new Unit7_Test();
    Unit8_Test ut8 = new Unit8_Test();
    Unit9_Test ut9 = new Unit9_Test();
    Unit10_Test ut10 = new Unit10_Test(); 
    
    @Test
    public void Unit_Test2(){
        ut.testUnit1();
        ut2.testGetValue();
        ut2.testGetValue();
        ut3.testGetValue();
        ut4.testGetValue();
        ut5.testGetValue();
        ut6.testGetValue();
        ut7.testGetValue();
        ut8.testUnit8();
        ut9.testUnit9();
        ut10.testUnit10();
    }
        
}
