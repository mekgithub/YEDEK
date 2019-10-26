import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hmw7C4 {
    @Test (groups = "RegressionTest")
    public void method7(){
        System.out.println("METHOD 7");
    }
    @BeforeTest
    @Test
    public void method8(){
        System.out.println("METHOD 8");
    }
}
