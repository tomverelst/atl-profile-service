package be.atreeslife.profile.persistence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Tom Verelst
 */
public interface ProfileRepository extends MongoRepository<ProfileDocument,String>{

    ProfileDocument findBySlug(String slug);

}
