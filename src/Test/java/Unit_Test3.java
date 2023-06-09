import com.POE.Test_3.* ;
import org.junit.Test;


public class Unit_Test3 {
    
    UnitTest ut = new UnitTest();
    Unit_2Test ut2 = new Unit_2Test();
    Unit_3Test ut3 = new Unit_3Test();
    Unit_4Test ut4 = new Unit_4Test();
    Unit_5Test ut5 = new Unit_5Test();
    Unit_6Test ut6 = new Unit_6Test();
    
    @Test
    public void Unit_Test(){
        ut.testMain();
    }
    
    @Test
    public void Unit_Test2(){
        ut2.testMain();
    }
    
    @Test
    public void Unit_Test3(){
        ut3.testMain();
    }
    
    @Test
    public void Unit_Test4(){
        ut4.testMain();
    }
    
    @Test
    public void Unit_Test5(){
        ut5.testMain();
    }
    
    @Test
    public void Unit_Test6(){
        ut6.testMain();
    }
    
}
