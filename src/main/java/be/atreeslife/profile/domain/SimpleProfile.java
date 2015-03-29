package be.atreeslife.profile.domain;

import java.time.LocalDate;

/**
 * @author Tom Verelst
 */
class SimpleProfile implements Profile{

    private String id;
    private String slug;
    private String firstName;
    private String secondName;
    private String lastName;
    private String biography;
    private LocalDate dayOfBirth;
    private LocalDate dayOfDeceit;
    private Gender gender;

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    @Override
    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(LocalDate dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    @Override
    public LocalDate getDayOfDeceit() {
        return dayOfDeceit;
    }

    public void setDayOfDeceit(LocalDate dayOfDeceit) {
        this.dayOfDeceit = dayOfDeceit;
    }

    @Override
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
