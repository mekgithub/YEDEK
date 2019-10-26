import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Payment {
    @BeforeSuite
    @Test(groups = {"SmokeTest"})
    void paymnetTC1(){
        System.out.println("PaymentTC1 Run");
    }
}
