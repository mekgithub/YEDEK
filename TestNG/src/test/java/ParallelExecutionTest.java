import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelExecutionTest {


    @Test
    public void a(){
       long id= Thread.currentThread().getId();
        System.out.println("a:Before Method" +id);

    }
    @BeforeMethod
    @Test
    public void b(){
        long id= Thread.currentThread().getId();
        System.out.println("b Before Method "+ id);

    }

    @BeforeMethod
    @Test
    public void c(){
        long id= Thread.currentThread().getId();
        System.out.println("c Before Method"+ id);

   }
   @AfterMethod
   @Test
    public void d(){
        long id= Thread.currentThread().getId();
        System.out.println("d AfterMethod "+ id);

    }
    @AfterMethod
    @Test
    public void e(){
        long id= Thread.currentThread().getId();
        System.out.println("e AfterMethod"+ id);

    }
    @AfterMethod
    @Test
    public void f(){
        long id= Thread.currentThread().getId();
        System.out.println("f AfterMethod"+ id);

    }
}
