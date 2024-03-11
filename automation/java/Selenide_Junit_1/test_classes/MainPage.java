package test_classes;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    private final static SelenideElement textInputBox = $x("//input[@type=\"text\"]");

    public MainPage(String url) {
        Selenide.open(url);
    }

    /**
     * Searching for needed information (input text, then press ENTER)
     * @param searchInfo is the information needed to search
     */
    public void clickOnSearch(String searchInfo) {
        textInputBox.setValue(searchInfo);
        textInputBox.sendKeys(Keys.ENTER);
    }
}
