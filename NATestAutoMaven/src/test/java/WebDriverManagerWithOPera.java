import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class WebDriverManagerWithOPera
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.opera.driver","C:\\Users\\18327\\Downloads\\operadriver_win64\\operadriver.exe");
        OperaOptions opt=new OperaOptions();
        opt.setBinary("C:\\Users\\18327\\AppData\\Local\\Programs\\Opera\\63.0.3368.94_0\\opera.exe");
        WebDriver driver=new OperaDriver(opt);
        Thread.sleep(1000);
        driver.get("http://www.seleniumhq.org");

    }
}
