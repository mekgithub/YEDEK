import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Loan {
    @AfterSuite
    @Test(groups = {"SmokeTest"})
    void loanTC1(){
        System.out.println("Loan TC1 Run");
    }
}
