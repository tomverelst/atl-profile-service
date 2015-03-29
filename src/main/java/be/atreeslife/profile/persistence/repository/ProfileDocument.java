package be.atreeslife.profile.persistence.repository;

import be.atreeslife.profile.domain.Gender;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

/**
 * @author Tom Verelst
 */
@Document(collection="profiles")
public class ProfileDocument {

    @Id
    private String id;

    @Indexed
    private String slug;

    private String firstName;

    private String secondName;

    private String lastName;

    private LocalDate dayOfBirth;

    private LocalDate dayOfDeceit;

    private Gender gender;

    private String biography;

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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
}
