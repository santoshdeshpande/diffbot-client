package in.sidsys.diffbot.api;

import in.sidsys.diffbot.model.Article;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DiffbotAPITest {
    private String url = "http://www.firstpost.com/politics/why-we-need-to-follow-the-aam-aadmi-partys-lead-in-2014-1315473.html";
    private String token = "65b7bb19e04c4d3952814c49c7091fad";
    @Test(expected = RuntimeException.class)
    public void invalidTokenThrowsException() {
        DiffbotAPI api = new DiffbotAPI();
        api.fetchArticle("dummy-token", url);
    }

    @Test(expected = RuntimeException.class)
    public void invalidUrlThrowsException() {
        DiffbotAPI api = new DiffbotAPI();
        api.fetchArticle(token, "http://www.firstpost.com/why-we-need-to-follow-the-aam-aadmi-partys-lead-in-2014-1315473.html");
    }

    @Test
    public void fetchValidArticle() {
        DiffbotAPI api = new DiffbotAPI();
        Article article = api.fetchArticle(token, url);
        assertThat(url, is(article.getUrl()));
    }

}
