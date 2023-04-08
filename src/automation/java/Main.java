import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main( String[] args ) {
        System.setProperty("webdriver.firefox.driver", "C:\\geckodriver.exe");

        WebDriver browser = new FirefoxDriver();
        browser.get("https://www.google.com");

        WebElement input = browser.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        input.sendKeys("Buy a bicycle");
        input.sendKeys(Keys.ENTER);
    }
}
