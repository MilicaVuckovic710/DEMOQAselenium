package test;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends BasePage {

    @BeforeMethod
    public void setUpPage() {
        driver.manage().window().maximize();
        driver.navigate().to(url);
        //wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(homePage.svgs));
        driver.findElement(new By.ByTagName("body")).sendKeys(Keys.PAGE_DOWN);
        wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(homePage.svgs));

    }

    @Test
    public void clickOnHomeLink(){
        homePage.getHomeLink().click();
        wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(homePage.svgs));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/");

    }
    @Test// (enabled = false)
    public void goToElements(){
        homePage.getElements().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("left-pannel")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/elements");

    }

    @Test //(enabled = false)
    public void goToForms(){
        homePage.getForms().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("left-pannel")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/forms");

    }

    @Test //(enabled = false)
    public void goToAfW(){
        homePage.getAfW().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("left-pannel")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/alertsWindows");

    }
    @Test //(enabled = false)
    public void goToWidgets(){
        homePage.getWidgets().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("left-pannel")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/widgets");

    }
    @Test //(enabled = false)
    public void goToInteractions(){
        homePage.getInteractions().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("left-pannel")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/interaction");

    }
    @Test //(enabled = false)
    public void goToBSApp(){
        homePage.getBSApp().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("left-pannel")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/books");

    }

}
