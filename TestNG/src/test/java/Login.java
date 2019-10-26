import org.testng.annotations.*;

public class Login {
    @BeforeTest
    @Test
    public void loginTC1() { System.out.println("logged in"); }

    @AfterTest
    @Test
    public void loginTC2() { System.out.println("System is ready to test"); }
   // @AfterSuite
   //@Test
   // public void cleanSystem() { System.out.println("Cleaner executed!"); }
}
