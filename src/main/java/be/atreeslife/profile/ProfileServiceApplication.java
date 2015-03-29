package be.atreeslife.profile;

import be.atreeslife.profile.config.ProfileServiceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Tom Verelst
 */

@SpringBootApplication
public class ProfileServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProfileServiceConfig.class);
    }

}
