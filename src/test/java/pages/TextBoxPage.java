package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage {
    public WebDriver driver;
    public WebDriverWait wdwait;

    public TextBoxPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getFullNameInput() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getEmailInput() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getCurrentAddressInput() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getName(){
        return driver.findElement(By.id("name"));
    }

    public WebElement getPermanentAddressInput() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }


}
