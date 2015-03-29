package be.atreeslife.profile.domain;

import java.time.LocalDate;
import java.util.Objects;

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

    @Override
    public LocalDate getDayOfDeceit() {
        return dayOfDeceit;
    }

    @Override
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public void setLifeTime(LocalDate dayOfBirth, LocalDate dayOfDeceit) {
        Objects.requireNonNull(dayOfBirth);
        Objects.requireNonNull(dayOfDeceit);

        if(dayOfDeceit.isBefore(dayOfBirth)){
            throw new IllegalArgumentException("Day of birth cannot be before the day of deceit");
        }

        this.dayOfBirth = dayOfBirth;
        this.dayOfDeceit = dayOfDeceit;
    }
}
