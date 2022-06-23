package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookStoreAppPage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public By item = By.id("item-0");  //nije jedinstven id, nadjemo sve elemente pa uzmemo index
    public By item2 = By.id("item-2");  //treba pokupiti u listu
    public By item3 = By.id("item-3");
    public By item4 = By.id("item-4");

    //List<WebElement> items = driver.findElements(By.id("item-x"))
           // return driver.findElements(items).get(x);


    public BookStoreAppPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
    public WebElement getLogIn() {

        return driver.findElements(item).get(5);
    }
    public WebElement getBookStore() {

        return driver.findElements(item2).get(4);
    }

    public WebElement getProfile() {

        return driver.findElements(item3).get(4);
    }

    public WebElement getBookStoreAPI() {

        return driver.findElements(item4).get(4);
    }

}
