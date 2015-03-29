package be.atreeslife.profile.resource;

import be.atreeslife.profile.domain.Profile;
import org.springframework.stereotype.Component;

/**
 * @author Tom Verelst
 */
@Component
public class ProfileResourceFactory {

    public ProfileResource createResource(final Profile profile){
        final ProfileResource resource =  new ProfileResource();
        resource.setId(profile.getId());
        resource.setSlug(profile.getSlug());
        resource.setFirstName(profile.getFirstName());
        resource.setSecondName(profile.getSecondName());
        resource.setLastName(profile.getLastName());
        resource.setBiography(profile.getBiography());
        resource.setDayOfBirth(profile.getDayOfBirth());
        resource.setDayOfDeceit(profile.getDayOfDeceit());
        return resource;
    }

}
