package be.atreeslife.profile.persistence;

import be.atreeslife.profile.domain.Profile;

/**
 * @author Tom Verelst
 */
public interface ProfilePersistenceService {

    rx.Observable<Profile> loadProfileBySlug(String slug);

}
