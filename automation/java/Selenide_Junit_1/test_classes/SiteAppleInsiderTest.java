package test_classes;
import org.junit.Test;
import org.junit.Assert;

public class SiteAppleInsiderTest extends TestMain {
    private final static String BASE_URL = "https://appleinsider.ru";
    private final static String SEARCH_STRING = "Чем iPhone 13 отличается от iPhone 12";

    @Test
    public void checkHref() {
        MainPage mainPage = new MainPage(BASE_URL);
        mainPage.clickOnSearch(SEARCH_STRING);
        FoundPage foundPage = new FoundPage();
        String href = foundPage.getFirstArticleHref();
        Assert.assertTrue(href.contains("iphone-13"));
    }
}
