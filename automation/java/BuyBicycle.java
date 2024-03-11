import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import java.util.concurrent.TimeUnit;
import java.time.Duration;

public class BuyBicycle {
    public static void main( String[] args ) {
        System.setProperty("webdriver.firefox.driver", "C:\\geckodriver.exe");
        WebDriver browser = new FirefoxDriver();

        //browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // old method
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        browser.get("https://www.google.com");

        //WebElement input = browser.findElement(By.xpath("//*[@id=\"APjFqb\"]"));    // find by 'id' is not a good idea
        WebElement input = browser.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));
        input.sendKeys("Buy a bicycle");
        input.sendKeys(Keys.ENTER);

        WebElement site = (new WebDriverWait(browser, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated
                        (By.xpath("/html/body/div[7]/div/div[11]/div/div[2]/div[2]/div/div/div[7]/div/div/div[1]/div/a/h3"))));
        site.click();
    }
}
