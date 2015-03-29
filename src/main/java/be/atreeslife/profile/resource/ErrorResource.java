package be.atreeslife.profile.resource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Tom Verelst
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorResource {

    private String message;

    public ErrorResource(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
