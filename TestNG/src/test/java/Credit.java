import org.testng.annotations.*;

public class Credit {
    @AfterClass
    @Test
    public void creditTC1() {
        System.out.println("creditTC1 run");
    }
    @AfterSuite
    @Test
    public void creditTC2() {
        System.out.println("creditTC2 run");
    }
    @BeforeClass
    @Test
    public void creditTC3() {
        System.out.println("creditTC3 run");
    }
}
