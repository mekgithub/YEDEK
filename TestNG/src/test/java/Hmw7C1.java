import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Hmw7C1 {
    @AfterSuite
    @Test
    public void method1(){
        System.out.println("METHOD 1");

    }
    @BeforeClass
    @Test (groups = "RegressionTest")
    public void method2(){
        System.out.println("METHOD 2");
    }
}
