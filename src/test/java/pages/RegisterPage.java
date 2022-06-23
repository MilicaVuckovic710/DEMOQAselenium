package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
    public WebDriver driver;
    public WebDriverWait wdwait;

    public RegisterPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
    public WebElement getFirstNameInput(){

        return driver.findElement(By.id("firstname"));
    }
    public WebElement getLastNameInput(){

        return driver.findElement(By.id("lastname"));
    }
    public WebElement getUserNameInput(){

        return driver.findElement(By.id("userName"));
    }
    public WebElement getPasswordInput(){

        return driver.findElement(By.id("password"));
    }




}
