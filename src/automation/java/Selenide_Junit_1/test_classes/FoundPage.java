package test_classes;

import com.codeborne.selenide.ElementsCollection;
import static com.codeborne.selenide.Selenide.$$x;

public class FoundPage {
    private final ElementsCollection articles = $$x("//h2//a");

    /**
     * Returns "href" attribute of the first found article
     * @return
     */
    public String getFirstArticleHref () {
        return articles.first().getAttribute("href");
    }
}
