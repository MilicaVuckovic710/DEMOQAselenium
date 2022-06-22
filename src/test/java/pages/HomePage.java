package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage {
   public WebDriver driver;
   public WebDriverWait wdwait;
   public By svgs = By.tagName("svg");



    public HomePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
    private WebElement getHeader(){
       return driver.findElement(By.tagName("header"));

    }
    public WebElement getHomeLink(){
       return getHeader().findElement(By.tagName("a"));
    }

     public WebElement getElements(){
       /* wdwait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("svg")));
        List<WebElement> h5s = driver.findElements(By.tagName("svg"));
        for(WebElement h5 : h5s)
            System.out.println(h5);
        driver.findElement(new By.ByTagName("body")).sendKeys(Keys.PAGE_DOWN);
        h5s.get(0).click();*/
        return driver.findElements(svgs).get(0);
    }

    public WebElement getForms(){
        return driver.findElements(svgs).get(1);
    }

    public WebElement getAfW(){
        return driver.findElements(svgs).get(2);
    }

    public WebElement getWidgets(){
        return driver.findElements(svgs).get(3);
    }
    public WebElement getInteractions(){
        return driver.findElements(svgs).get(4);
    }
    public WebElement getBSApp(){
        return driver.findElements(svgs).get(5);
    }


}
