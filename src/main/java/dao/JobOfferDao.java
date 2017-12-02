package dao;

import model.Employer;
import model.JobOffer;
import model.Location;
import model.PayRange;

import java.util.List;

public interface JobOfferDao
{
    List<JobOffer> findByTitle(String title);
    List<JobOffer> findByEmployer(Employer employer);
    List<JobOffer> findByPayRange(PayRange payRange);
    List<JobOffer> findByLocalization(Location localization);
}