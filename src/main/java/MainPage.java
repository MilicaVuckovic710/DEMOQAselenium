import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MainPage {
    public static void main(String[] args) {
        WebDriverManager wdm = new ChromeDriverManager();
        wdm.setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");
        List<WebElement> svgs = driver.findElements(By.tagName("svg"));
        for(WebElement svg : svgs)
            System.out.println(svg);
        driver.findElement(new By.ByTagName("body")).sendKeys(Keys.PAGE_DOWN);
        svgs.get(0).click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("left-panel")));


    }
}
