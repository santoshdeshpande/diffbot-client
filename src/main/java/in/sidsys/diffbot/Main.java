package in.sidsys.diffbot;

import in.sidsys.diffbot.api.DiffbotAPI;
import in.sidsys.diffbot.model.Article;

public class Main {

    public static final String API_TOKEN = "65b7bb19e04c4d3952814c49c7091fad";

    public static void main(String args[]) throws Exception {
        DiffbotAPI api = new DiffbotAPI();
        Article article = api.fetchArticle(API_TOKEN, "http://www.firstpost.com/aap-set-to-form-dei-govt-who-will-its-ministers-be-1302047.html");
        System.out.println(article);
    }
}
