import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelexecutionTest3 {

    @Test
    public void a(){
        long id= Thread.currentThread().getId();
        System.out.println("@@a:" +id);

    }
    @Test
    public void b(){
        long id= Thread.currentThread().getId();
        System.out.println("@@b "+ id);

    }

    @Test
    public void c(){
        long id= Thread.currentThread().getId();
        System.out.println("@@c"+ id);

    }
    @Test
    public void d(){
        long id= Thread.currentThread().getId();
        System.out.println("@@d "+ id);

    }
    @Test
    public void e(){
        long id= Thread.currentThread().getId();
        System.out.println("@@e "+ id);

    }
    @Test
    public void f(){
        long id= Thread.currentThread().getId();
        System.out.println("@@f "+ id);

    }
}
