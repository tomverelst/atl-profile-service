package be.atreeslife.profile.domain;

import be.atreeslife.profile.persistence.repository.ProfileDocument;

/**
 * @author Tom Verelst
 */
public class ProfileFactory {

    public Profile fromDocument(ProfileDocument document){
        return new ProfileBuilder()
                .id(document.getId())
                .firstName(document.getFirstName())
                .secondName(document.getSecondName())
                .lastName(document.getLastName())
                .biography(document.getBiography())
                .slug(document.getSlug())
                .lifeTime(document.getDayOfBirth(), document.getDayOfDeceit())
                .get();
    }

}
