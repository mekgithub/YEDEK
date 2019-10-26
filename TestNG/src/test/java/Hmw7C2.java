import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Hmw7C2 {
    @AfterTest
    @Test
    public void method3(){
        System.out.println("METHOD 3");
    }
    @BeforeSuite
    @Test
    public void method4(){
        System.out.println("METHOD 4");
    }
}
