package be.atreeslife.profile.resource;

import be.atreeslife.profile.domain.Profile;

/**
 * @author Tom Verelst
 */
public class ProfileResourceFactory {

    public ProfileResource createResource(Profile profile){
        return new ProfileResource();
    }

}
