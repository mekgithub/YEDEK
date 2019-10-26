import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Hmw7C3 {

    @Test (groups = "SmokeTest")
    public void method5(){
        System.out.println("METHOD 5");
    }
    @AfterClass
    @Test
    public void method6(){
        System.out.println("METHOD 6");
    }
}
