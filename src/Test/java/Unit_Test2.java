import com.POE.Test_2.* ;
import org.junit.Test;


public class Unit_Test2 {
    
    Unit1_1Test2 ut = new Unit1_1Test2();
    Unit1_2Test2 ut2 = new Unit1_2Test2();
    Unit2Test ut3 = new Unit2Test();
    Unit2_2Test ut4 = new Unit2_2Test();
    Unit3Test ut5 = new Unit3Test();
    
    @Test
    public void Unit_Test2(){
        ut.testMain();
        ut2.testMain();
        ut3.testMain();
        ut4.testMain();
        ut5.testMain();
    }  
}
