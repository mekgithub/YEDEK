import org.testng.annotations.Test;

public class ClassTest
{
    String url;
    String item;
    public  ClassTest(String url, String item) {
        this.url=url;
        this.item=item;
        System.out.println(url);
        System.out.println(item);
    }

    @Test
    public void test2() {
        System.out.println("test2"+url+"and username" + item);
    }

    @Test
    public void test3() {
        System.out.println("test3"+url+"and username" + item);
    }
}
