package pl.sages.dao;

import org.springframework.stereotype.Repository;
import pl.sages.model.Application;
import pl.sages.model.JobOffer;
import pl.sages.model.User;

import java.util.List;

@Repository
public interface ApplicationDao extends AbstractDao<Application> {

  List<Application> findByApplicant(User user);

  List<Application> findByJobOffer(JobOffer jobOffer);

}
