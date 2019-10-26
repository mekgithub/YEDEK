import org.testng.annotations.Test;

public class GroupingTest {
    @Test (groups = {"SmokeTest"})
    public void Test1(){
        System.out.println("Smoke Test 1 executed");
    }
    @Test
    public void Test2(){
        System.out.println("Smoke Test 2 executed");
    }
    @Test
    public void Test3(){
        System.out.println("Smoke Test 3 executed");
    }
    @Test (groups = {"SmokeTest"})
    public void Test4(){
        System.out.println("Smoke Test 4 executed");
    }

}
