package in.sidsys.diffbot.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Arrays;

public class Article {
    private String url;
    private String resolvedUrl;
    private String icon;
    private String[] links;
    private String type;
    private String title;
    private String text;
    private String html;
    private String date;
    private String author;
    private String[] tags;
    private String humanLanguage;
    private Media[] media;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getResolvedUrl() {
        return resolvedUrl;
    }

    public void setResolvedUrl(String resolvedUrl) {
        this.resolvedUrl = resolvedUrl;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String[] getLinks() {
        return links;
    }

    public void setLinks(String[] links) {
        this.links = links;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public String getHumanLanguage() {
        return humanLanguage;
    }

    public void setHumanLanguage(String humanLanguage) {
        this.humanLanguage = humanLanguage;
    }

    public Media[] getMedia() {
        return media;
    }

    public void setMedia(Media[] media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Article{" +
                "url='" + url + '\'' +
                ", resolvedUrl='" + resolvedUrl + '\'' +
                ", icon='" + icon + '\'' +
                ", links=" + Arrays.toString(links) +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", html='" + html + '\'' +
                ", date='" + date + '\'' +
                ", author='" + author + '\'' +
                ", tags=" + Arrays.toString(tags) +
                ", humanLanguage='" + humanLanguage + '\'' +
                ", media=" + Arrays.toString(media) +
                '}';
    }
}
