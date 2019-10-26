import org.testng.annotations.Factory;

public class TestFactoryClass
{
    @Factory
    public Object[] factory()
    {
        return new Object[] {
                new ClassTest("google","shoes"),
                new ClassTest("google","shoes"),
                new ClassTest("google","shoes")};

    }
}
