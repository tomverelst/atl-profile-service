package be.atreeslife.profile.domain;

import java.time.LocalDate;

/**
 * @author Tom Verelst
 */
public interface Profile extends Identifiable {

    String getId();

    String getSlug();

    String getFirstName();

    String getSecondName();

    String getLastName();

    LocalDate getDayOfBirth();

    LocalDate getDayOfDeceit();

    Gender getGender();

    /**
     * The Markdown biography of the deceased.
     */
    String getBiography();

    /**
     *
     * @param dayOfBirth
     * @param dayOfDeceit
     */
    void setLifeTime(LocalDate dayOfBirth, LocalDate dayOfDeceit);

}
