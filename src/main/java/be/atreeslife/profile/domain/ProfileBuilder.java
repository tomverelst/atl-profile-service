package be.atreeslife.profile.domain;

import java.time.LocalDate;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * @author Tom Verelst
 */
public class ProfileBuilder  {

    private final SimpleProfile profile = new SimpleProfile();

    public Profile get(){
        return profile;
    }

    public ProfileBuilder id(String id){
        return apply(profile -> profile.setId(id));
    }

    public ProfileBuilder slug(String slug){
        return apply(profile -> profile.setSlug(slug));
    }

    public ProfileBuilder firstName(String firstName){
        return apply(profile -> profile.setFirstName(firstName));
    }

    public ProfileBuilder secondName(String secondName){
        return apply(profile -> profile.setSecondName(secondName));
    }

    public ProfileBuilder lastName(String lastName){
        return apply(profile -> profile.setLastName(lastName));
    }

    public ProfileBuilder biography(String biography){
        return apply(profile -> profile.setBiography(biography));
    }

    public ProfileBuilder lifeTime(LocalDate dayOfBirth, LocalDate dayOfDeceit){
        Objects.requireNonNull(dayOfBirth);
        Objects.requireNonNull(dayOfDeceit);
        return apply(profile -> profile.setLifeTime(dayOfBirth, dayOfDeceit));
    }

    public ProfileBuilder gender(Gender gender){
        return apply(profile -> profile.setGender(gender));
    }

    private ProfileBuilder apply(Consumer<SimpleProfile> consumer){
        consumer.accept(this.profile);
        return this;
    }


}
