package seleniummrulusoy;

import apachepoi.InvokeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class CapitalLetterActions {
    public static void main(String[] args) {

       /* InvokeBrowser myBrowser = new InvokeBrowser();
        WebDriver driver = myBrowser.invokeBrowser();
        driver.get("http://www.facebook.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions myActions=new Actions(driver);
        WebElement myWebelement=driver.findElement(By.cssSelector("input#email"));
        myActions.moveToElement(myWebelement).build().perform();
        myActions.click().build().perform();
        myActions.keyDown(myWebelement, Keys.SHIFT).build().perform();
        myActions.sendKeys("MEHMET").build().perform();*/
        InvokeBrowser myBrowser=new InvokeBrowser();
        WebDriver driver=myBrowser.invokeBrowser();
        driver.get("http://facebook.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions myActions=new Actions(driver);
        WebElement myWebElement=driver.findElement(By.cssSelector("input#email"));
       /* myActions.moveToElement(myWebElement).build().perform();
        myActions.click().build().perform();
        myActions.keyDown(myWebElement, Keys.SHIFT).build().perform();
        myActions.sendKeys("ibrahim").build().perform();
        myActions.keyUp(myWebElement,Keys.SHIFT).build().perform();*/
       Action action=myActions.moveToElement(myWebElement)
                .click()
                .keyDown(myWebElement, Keys.SHIFT)
                .sendKeys("Mehmet")
                .keyUp(myWebElement,Keys.SHIFT)
                .build();
        action.perform();



    }

}
