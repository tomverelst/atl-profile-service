package be.atreeslife.profile.controller;

import be.atreeslife.profile.resource.ErrorResource;
import be.atreeslife.profile.resource.ProfileResourceNotFoundException;
import be.atreeslife.profile.resource.ResourceException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author Tom Verelst
 */
@ControllerAdvice
public class ResourceExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ResourceException.class)
    protected ResponseEntity<Object> handleInvalidResourceRequest(RuntimeException e, WebRequest request) {
        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);



        if(e instanceof ProfileResourceNotFoundException){
            return handleExceptionInternal(e,
                    new ErrorResource("Resource not found"),
                    headers,
                    HttpStatus.NOT_FOUND,
                    request);
        }

        return handleExceptionInternal(e,
                new ErrorResource("Unknown exception"),
                headers,
                HttpStatus.INTERNAL_SERVER_ERROR,
                request);
    }

}
