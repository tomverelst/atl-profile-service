package be.atreeslife.profile.resource;

import be.atreeslife.profile.domain.Profile;
import be.atreeslife.profile.persistence.ProfilePersistenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rx.Observable;
import rx.observables.BlockingObservable;

import java.util.NoSuchElementException;

/**
 * @author Tom Verelst
 */
@Service
public class ProfileResourceService {

    @Autowired
    private ProfilePersistenceService profiles;

    @Autowired
    private ProfileResourceFactory resourceFactory;

    /**
     *
     * @param slug
     * @return
     * @throws ProfileResourceNotFoundException if no profile was found
     */
    public ProfileResource getResourceBySlug(final String slug){
        try {
            final Observable<Profile> observable = profiles.loadProfileBySlug(slug);
            // TODO load images from image service
            // final Observable<Image> images = ...

            final Profile profile = BlockingObservable.from(observable).first();

            return resourceFactory.createResource(profile);
        } catch(NoSuchElementException ex){
            throw new ProfileResourceNotFoundException();
        }
    }

}
