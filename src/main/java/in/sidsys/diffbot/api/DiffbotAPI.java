package in.sidsys.diffbot.api;

import com.google.gson.Gson;
import in.sidsys.diffbot.model.Article;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class DiffbotAPI {

    public Article fetchArticle(String token, String sourceUrl) throws RuntimeException {
        CloseableHttpClient client = HttpClients.createDefault();
        try {
            String encodedUrl = URLEncoder.encode(sourceUrl, "UTF-8");
            String url = String.format("http://api.diffbot.com/v2/article?token=%s&url=%s", token, encodedUrl);
            HttpGet httpGet = new HttpGet(url);
            ResponseHandler<Article> responseHandler = new ResponseHandler<Article>() {
                @Override
                public Article handleResponse(HttpResponse response) throws ClientProtocolException, IOException {
                    int status = response.getStatusLine().getStatusCode();
                    if (status == 401)
                        throw new UnauthorizedException("There was an authorization error which fetching the article infomation. Please check your API key");
                    if (status >= 200 && status < 300) {
                        HttpEntity entity = response.getEntity();
                        if (entity != null)
                            return new Gson().fromJson(EntityUtils.toString(entity), Article.class);
                        else
                            throw new ClientProtocolException("No response found in the api call");
                    } else {
                        throw new ClientProtocolException("Unexpected Response " + status);
                    }
                }
            };
            return client.execute(httpGet, responseHandler);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (ClientProtocolException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
