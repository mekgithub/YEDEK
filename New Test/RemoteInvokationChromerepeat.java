import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteInvokationChromerepeat {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities dc=new DesiredCapabilities();
        dc.setBrowserName("chrome");
        dc.setPlatform(Platform.WINDOWS);
        URL url=new URL(" http://192.168.0.20:3000/wd/hub");
        WebDriver driver=new RemoteWebDriver(url,dc);
        driver.get("http://www.expedia.com");
    }
}
