package dao;

import model.JobOffer;
import model.Location;
import model.PayRange;

import java.util.List;

public interface JobOfferDao
{
    List<JobOffer> findByTitle(String title);
    List<JobOffer> findByEmployer(String employer); //TODO
    List<JobOffer> findByPayRange(PayRange payRange);
    List<JobOffer> findByLocalization(Location localization);
}