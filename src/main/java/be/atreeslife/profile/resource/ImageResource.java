package be.atreeslife.profile.resource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Tom Verelst
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ImageResource {

    private String url;

    private Integer width;

    private Integer height;

    private String description;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
