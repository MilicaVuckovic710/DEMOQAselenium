package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.*;

import java.time.Duration;

public class BasePage {

    public String url = "https://demoqa.com/";
    public WebDriverManager wdm;
    public WebDriver driver;
    public WebDriverWait wdwait;
    public HomePage homePage;
    public ElementsPage elementsPage;
    public TextBoxPage textBoxPage;
    public BookStoreAppPage bookStoreAppPage;
    public LogInPage logInPage;

    @BeforeClass
    public void setup(){
        wdm = new ChromeDriverManager();
        wdm.setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(25));
        homePage = new HomePage(driver, wdwait);
        elementsPage = new ElementsPage(driver, wdwait);
        textBoxPage = new TextBoxPage(driver, wdwait);
        bookStoreAppPage = new BookStoreAppPage(driver, wdwait);
        logInPage = new LogInPage(driver, wdwait);


    }

    @AfterClass
    public void close() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
