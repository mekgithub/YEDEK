package my;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassnameLocator {
    public static  WebDriver driver;
    public static void main(String [] args){
        invokechrome();
        driver.get("http://www.skyscanner.com");
        driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).click();

    }
    public static void invokechrome(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Desktop\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();


    }
}
