import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class OperaDriverInvoke {
    public static void main(String[] args)throws Exception {
        OperaOptions option =new OperaOptions();
        option.setBinary("C:\\Users\\18327\\AppData\\Local\\Programs\\Opera\\63.0.3368.94\\opera.exe");
        System.setProperty("webdriver.opera.driver","C:\\Users\\18327\\Downloads\\operadriver_win64\\operadriver.exe");
        WebDriver myOperadriver=new OperaDriver(option);
        myOperadriver.get("http://www.amazon.com");
    }


}


/*public class FirefoxInvocation {
    public static void main(String[] args) {
        System.setProperty("webdriver.opera.driver","C:\\Users\\18327\\Downloads\\operadriver_win64\\operadriver.exe");
        WebDriver myMozilladriver=new FirefoxDriver();
        myMozilladriver.get("http://www.amazon.com");
    }
}*/
