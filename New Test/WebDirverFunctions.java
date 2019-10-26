import org.openqa.selenium.WebDriver;

public class WebDirverFunctions {
    public static void main(String[] args) {
        AllBrowsers allBrowsers=new AllBrowsers();
        WebDriver driver=allBrowsers.chrome();
        driver.get("http://www.amazon.com");
        driver.get("http://facebook.com");

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().back();
        driver.navigate().forward();

        System.out.println("current url:"+driver.getCurrentUrl());

    }
}
