import test_classes.*;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;

abstract public class TestMain {
    public void setup() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1366x768";
        Configuration.headless = false;
    }

    @Before
    public void init() {
        setup();
    }

    @After
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}

