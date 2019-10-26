package my;

import apachepoi.InvokeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SwitchWindows {
    public static void main(String[] args) {
        InvokeBrowser myBrowser=new InvokeBrowser();
        WebDriver driver=myBrowser.invokeBrowser();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignU");
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='Terms']")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


       Iterator<String> myWin=driver.getWindowHandles().iterator();

        /*Set<String> id=driver.getWindowHandles();
        Iterator<String> myWin=id.iterator();*/
        String parent=myWin.next();
        String child=myWin.next();


        driver.switchTo().window(parent);
        System.out.println("parent:"+driver.getTitle());
        driver.switchTo().window(child);
        System.out.println("child:"+driver.getTitle());


    }
}
