import org.testng.annotations.Test;

public class TestRunParallely {
    @Test (threadPoolSize = 3, invocationCount=6, timeOut = 1000)
    public void test(){
        long id=Thread.currentThread().getId();
        System.out.println("thread id=" + id);

    }
}
