package be.atreeslife.profile.resource;

import be.atreeslife.profile.domain.Profile;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

/**
 * @author Tom Verelst
 */
@Component
public class ProfileResourceFactory {

    @Value("${atl.service.profile.baseUrl:http://localhost:8080}")
    private String baseUrl;

    public ProfileResource createResource(final Profile profile){
        final ProfileResource resource =  new ProfileResource();
        resource.setSlug(profile.getSlug());
        resource.setFirstName(profile.getFirstName());
        resource.setSecondName(profile.getSecondName());
        resource.setLastName(profile.getLastName());
        resource.setBiography(profile.getBiography());
        resource.setDayOfBirth(profile.getDayOfBirth());
        resource.setDayOfDeceit(profile.getDayOfDeceit());

        resource.add(linkTo(methodOn(ProfileController.class).get(profile.getSlug())).withSelfRel());
        return resource;
    }

}
