package be.atreeslife.profile.resource;

import be.atreeslife.profile.domain.Image;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.hateoas.ResourceSupport;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Resource that represents a full profile.
 *
 * @author Tom Verelst
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProfileResource extends ResourceSupport {

    private String slug;

    private String firstName;

    private String secondName;

    private String lastName;

    private String biography;

    private LocalDate dayOfBirth;

    private LocalDate dayOfDeceit;

    private List<Image> images = new ArrayList<>();

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(LocalDate dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public LocalDate getDayOfDeceit() {
        return dayOfDeceit;
    }

    public void setDayOfDeceit(LocalDate dayOfDeceit) {
        this.dayOfDeceit = dayOfDeceit;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }
}
