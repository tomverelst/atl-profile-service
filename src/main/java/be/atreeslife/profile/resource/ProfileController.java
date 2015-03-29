package be.atreeslife.profile.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
* @author Tom Verelst
*/
@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    private ProfileResourceService resourceService;

    @RequestMapping( value = "/{slug}", method = RequestMethod.GET)
    public ResponseEntity<ProfileResource> get(@PathVariable final String slug){
        return ResponseEntity.ok(resourceService.getResourceBySlug(slug));
    }



}
