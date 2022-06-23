package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage {
    public WebDriver driver;
    public WebDriverWait wdwait;

    public LogInPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getUserNameInput(){

        return driver.findElement(By.id("userName"));
    }
    public WebElement getPasswordInput(){
        return driver.findElement(By.id("password"));
    }
    public WebElement getLoginButton(){
        return driver.findElement(By.id("login"));
    }
    public WebElement getRedNotification(){
        return driver.findElement(By.cssSelector("#name")); //probano i sa id i classname, treba mu vremena
                                                            //da se ucita i da se skroluje
    }
    public WebElement getName(){

        return driver.findElement(By.id("userName-value"));
    }

    public WebElement getNewUserButton(){

        return driver.findElement(By.id("newUser"));
    }



}
