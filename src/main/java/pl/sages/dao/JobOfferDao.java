package pl.sages.dao;

import org.springframework.stereotype.Repository;
import pl.sages.model.Employer;
import pl.sages.model.JobOffer;
import pl.sages.model.Location;
import pl.sages.model.PayRange;

import java.util.List;

@Repository
public interface JobOfferDao extends AbstractDao<JobOffer> {
  List<JobOffer> findByTitle(String title);

  List<JobOffer> findByEmployer(Employer employer);

  List<JobOffer> findByPayRange(PayRange payRange);

  List<JobOffer> findByLocalization(Location localization);
}