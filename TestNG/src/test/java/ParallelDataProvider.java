import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class ParallelDataProvider {
    public void setTHREAD(ITestContext con){
        con.getCurrentXmlTest().getSuite().setDataProviderThreadCount(3);
    }

    @Test(dataProvider = "DataSource")
    public void test(int i, String y) {
        long id = Thread.currentThread().getId();
        System.out.println(i + "-" + y + " Has been executed in thread number :" + id);
    }

    @DataProvider(name = "DataSource", parallel = true)
    public Object[][] getData() {
        return new Object[][]{
                {1, "a"},
                {2, "b"},
                {3, "c"},
                {4, "d"},
                {5, "e"},
                {6, "f"},
                {7, "g"},
                {8, "h"},
                {9, "i"},
                {10, "j"},
        };
    }
}