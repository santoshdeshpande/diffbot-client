package in.sidsys.diffbot.model;


public class Media {

    private MediaType type;
    private String link;
    private Boolean primary;
    private String caption;

    public MediaType getType() {
        return type;
    }

    public void setType(MediaType type) {
        this.type = type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Boolean getPrimary() {
        return primary;
    }

    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    @Override
    public String toString() {
        return "Media{" +
                "type='" + type + '\'' +
                ", link='" + link + '\'' +
                ", primary=" + primary +
                ", caption='" + caption + '\'' +
                '}';
    }
}
