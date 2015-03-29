package be.atreeslife.profile.resource;

import be.atreeslife.profile.domain.Image;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Resource that represents a full profile.
 *
 * @author Tom Verelst
 */
public class ProfileResource {

    private String id;

    private String firstName;

    private String secondName;

    private String lastName;

    private String biography;

    private LocalDate dateOfBirth;

    private LocalDate dateOfDeceit;

    private List<Image> images = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfDeceit() {
        return dateOfDeceit;
    }

    public void setDateOfDeceit(LocalDate dateOfDeceit) {
        this.dateOfDeceit = dateOfDeceit;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }
}
