package be.atreeslife.profile.persistence.support;

import be.atreeslife.profile.domain.Profile;
import be.atreeslife.profile.domain.ProfileFactory;
import be.atreeslife.profile.persistence.ProfilePersistenceService;
import be.atreeslife.profile.persistence.repository.ProfileDocument;
import be.atreeslife.profile.persistence.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Service;
import rx.Observable;

/**
 * @author Tom Verelst
 */
@Service
public class SimpleProfilePersistenceService implements ProfilePersistenceService {

    @Autowired
    private ProfileRepository profiles;

    @Autowired
    private ProfileFactory profileFactory;

    private TaskExecutor executor = new SimpleAsyncTaskExecutor("Profiles");

    @Override
    public Observable<Profile> loadProfileBySlug(final String slug){
          return Observable.create(observable -> {
                executor.execute(() -> {
                    try {
                        final ProfileDocument document = profiles.loadProfileBySlug(slug);
                        if(document != null) {
                            final Profile profile = profileFactory.fromDocument(document);
                            observable.onNext(profile);
                        }
                        observable.onCompleted();
                    } catch (Exception ex){
                        observable.onError(ex);
                    }
                });
          });
    }
}

