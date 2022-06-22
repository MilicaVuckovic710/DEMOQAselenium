package test;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestElements extends BasePage {

    @BeforeMethod
    public void setUpPageElements() {
        driver.manage().window().maximize();
        driver.navigate().to(url);
        driver.findElement(new By.ByTagName("body")).sendKeys(Keys.PAGE_DOWN);
        wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(homePage.svgs));
        wdwait.until(ExpectedConditions.elementToBeClickable(homePage.getElements()));
        homePage.getElements().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("left-pannel")));

    }

    //TODO create try catch for wdwait


    @Test// (enabled = false)
    public void goToTextBoxPage(){
        wdwait.until(ExpectedConditions.elementToBeClickable(elementsPage.getTextBox()));
        elementsPage.getTextBox().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("submit")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/text-box");
    }
    @Test// (enabled = false)
    public void goToCheckBoxPage(){
        wdwait.until(ExpectedConditions.elementToBeClickable(elementsPage.getCheckBox()));
        elementsPage.getCheckBox().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("rct-title")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/checkbox");
    }
    @Test// (enabled = false)
    public void goToRadioButtonPage(){
        wdwait.until(ExpectedConditions.elementToBeClickable(elementsPage.getRadioButton()));
        elementsPage.getRadioButton().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("yesRadio")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/radio-button");
    }
    @Test// (enabled = false)
    public void goToWebTablesPage(){
        wdwait.until(ExpectedConditions.elementToBeClickable(elementsPage.getWebTables()));
        elementsPage.getWebTables().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("rt-td")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/webtables");
    }
    @Test// (enabled = false)
    public void goToButtonsPage(){
        wdwait.until(ExpectedConditions.elementToBeClickable(elementsPage.getButtons()));
        elementsPage.getButtons().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("doubleClickBtn")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/buttons");
    }
    @Test// (enabled = false)
    public void goToLinksPage(){
        driver.findElement(new By.ByTagName("body")).sendKeys(Keys.PAGE_DOWN);
        wdwait.until(ExpectedConditions.elementToBeClickable(elementsPage.getLinks()));
        elementsPage.getLinks().click();
        driver.findElement(new By.ByTagName("body")).sendKeys(Keys.PAGE_DOWN);
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("no-content")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/links");
    }
    @Test// (enabled = false)
    public void goToBrokenLinksImagesPage(){
        driver.findElement(new By.ByTagName("body")).sendKeys(Keys.PAGE_DOWN);
        wdwait.until(ExpectedConditions.elementToBeClickable(elementsPage.getBrokenLinksImages()));
        elementsPage.getBrokenLinksImages().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Click Here for Broken Link")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/broken");
    }
    @Test// (enabled = false)
    public void goToUploadAndDownloadPage(){
        driver.findElement(new By.ByTagName("body")).sendKeys(Keys.PAGE_DOWN);
        wdwait.until(ExpectedConditions.elementToBeClickable(elementsPage.getUploadAndDownload()));
        elementsPage.getUploadAndDownload().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("downloadButton")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/upload-download");
    }
    @Test// (enabled = false)
    public void goToDynamicPropertiesPage(){
        driver.findElement(new By.ByTagName("body")).sendKeys(Keys.PAGE_DOWN);
        wdwait.until(ExpectedConditions.elementToBeClickable(elementsPage.getDynamicProperties()));
        elementsPage.getDynamicProperties().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("visibleAfter")));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/dynamic-properties");
    }
}
