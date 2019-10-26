import org.testng.annotations.Test;

public class Homework6 {

    @Test (dependsOnMethods = "a5")
     void a1(){
        System.out.println("A1");
    }
    @Test (dependsOnMethods = "a4")
    void a2(){
        System.out.println("A2");
    }

    @Test (dependsOnMethods = "a5")
    void a3(){
        System.out.println("A3");
    }
    @Test
    void a4(){
        System.out.println("A4");
    }
    @Test
    void  a5(){
        System.out.println("A5");
    }
}
