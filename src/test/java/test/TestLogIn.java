package test;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogIn extends BasePage {
    @BeforeMethod
    public void setUpLogIn() {
        driver.manage().window().maximize();
        driver.navigate().to(url);
        driver.findElement(new By.ByTagName("body")).sendKeys(Keys.PAGE_DOWN);
        wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(homePage.svgs));
        wdwait.until(ExpectedConditions.elementToBeClickable(homePage.getBSApp()));
        homePage.getBSApp().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("left-pannel")));
        driver.findElement(new By.ByTagName("body")).sendKeys(Keys.PAGE_DOWN);
        wdwait.until(ExpectedConditions.elementToBeClickable(bookStoreAppPage.getLogIn()));
        bookStoreAppPage.getLogIn().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("login")));
    }

    @Test
    public void logInInvalid(){
        logInPage.getUserNameInput().sendKeys("lale1");
        logInPage.getPasswordInput().sendKeys("laki1");
        logInPage.getLoginButton().click();
        driver.findElement(new By.ByTagName("body")).sendKeys(Keys.PAGE_DOWN);
        wdwait.until(ExpectedConditions.visibilityOf(logInPage.getRedNotification()));
        Assert.assertEquals(logInPage.getRedNotification().getText(), "Invalid username or password!");

    }
    @Test
    public void logInValid(){
        logInPage.getUserNameInput().sendKeys("lale");
        logInPage.getPasswordInput().sendKeys("LAKIca123&");
        logInPage.getLoginButton().click();
        driver.findElement(new By.ByTagName("body")).sendKeys(Keys.PAGE_DOWN);
        wdwait.until(ExpectedConditions.visibilityOf(logInPage.getName()));
        Assert.assertEquals(logInPage.getName().getText(), "lale");

    }
    @Test
    public void goToRegisterPage(){
        logInPage.getNewUserButton().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/register");


    }
}
