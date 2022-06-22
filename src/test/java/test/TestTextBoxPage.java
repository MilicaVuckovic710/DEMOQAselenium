package test;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTextBoxPage extends BasePage {

    @BeforeMethod
    public void setUpPageTextBox() {
        driver.manage().window().maximize();
        driver.navigate().to(url);
        driver.findElement(new By.ByTagName("body")).sendKeys(Keys.PAGE_DOWN);
        wdwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(homePage.svgs));
        wdwait.until(ExpectedConditions.elementToBeClickable(homePage.getElements()));
        homePage.getElements().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("left-pannel")));
        wdwait.until(ExpectedConditions.elementToBeClickable(elementsPage.getTextBox()));
        elementsPage.getTextBox().click();

    }

    @Test
    public void submitPersonalInformation(){
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("submit")));
        textBoxPage.getFullNameInput().sendKeys("Lale Lalic");
        textBoxPage.getEmailInput().sendKeys("ljiki57@yopmail.com");
        textBoxPage.getCurrentAddressInput().sendKeys("Zvezdara");
        textBoxPage.getPermanentAddressInput().sendKeys("Beograd");
        driver.findElement(new By.ByTagName("body")).sendKeys(Keys.PAGE_DOWN);
        wdwait.until(ExpectedConditions.elementToBeClickable(textBoxPage.getSubmitButton()));
        textBoxPage.getSubmitButton().click();
        Assert.assertEquals(textBoxPage.getName().getText(), "Name:Lale Lalic");

    }

}
