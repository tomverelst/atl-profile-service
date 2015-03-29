package be.atreeslife.profile.controller;

import be.atreeslife.profile.resource.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @ExceptionHandler(ResourceException.class)
    public ResponseEntity<ErrorResource> handleException(ResourceException ex){
        if(ex instanceof ProfileResourceNotFoundException){
            return new ResponseEntity<>(new ErrorResource("Resource not found"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(new ErrorResource("Unknown exception"), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
