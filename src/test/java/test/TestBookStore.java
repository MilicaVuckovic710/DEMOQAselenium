package test;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBookStore extends BasePage {
    @BeforeMethod
    public void setUpPageBookStore() {
        driver.manage().window().maximize();
        driver.navigate().to(url);
        driver.findElement(new By.ByTagName("body")).sendKeys(Keys.PAGE_DOWN);
        wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(homePage.svgs));
        wdwait.until(ExpectedConditions.elementToBeClickable(homePage.getBSApp()));
        homePage.getBSApp().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("left-pannel")));

    }
    @Test
    public void goToLogIn(){
        driver.findElement(new By.ByTagName("body")).sendKeys(Keys.PAGE_DOWN);
        wdwait.until(ExpectedConditions.elementToBeClickable(bookStoreAppPage.getLogIn()));
        bookStoreAppPage.getLogIn().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("login")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/login");

    }
    @Test
    public void goBookStore(){
        driver.findElement(new By.ByTagName("body")).sendKeys(Keys.PAGE_DOWN);
        wdwait.until(ExpectedConditions.elementToBeClickable(bookStoreAppPage.getBookStore()));
        bookStoreAppPage.getBookStore().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("searchBox")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/books");


    }

    @Test
    public void goToProfile(){
        driver.findElement(new By.ByTagName("body")).sendKeys(Keys.PAGE_DOWN);
        wdwait.until(ExpectedConditions.elementToBeClickable(bookStoreAppPage.getProfile()));
        bookStoreAppPage.getProfile().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("notLoggin-label")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/profile");

    }

    @Test
    public void goToBookStoreAPI(){
        driver.findElement(new By.ByTagName("body")).sendKeys(Keys.PAGE_DOWN);
        wdwait.until(ExpectedConditions.elementToBeClickable(bookStoreAppPage.getBookStoreAPI()));
        bookStoreAppPage.getBookStoreAPI().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("nostyle")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/swagger/");
    }

}
