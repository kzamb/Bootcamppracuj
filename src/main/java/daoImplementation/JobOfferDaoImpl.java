package daoImplementation;

import dao.JobOfferDao;
import model.Employer;
import model.JobOffer;
import model.Location;
import model.PayRange;

import java.util.List;

public class JobOfferDaoImpl implements JobOfferDao
{

    @Override
    public List<JobOffer> findByTitle(String title) {
        return null;
    }

    @Override
    public List<JobOffer> findByEmployer(Employer employer) {
        return null;
    }

    @Override
    public List<JobOffer> findByPayRange(PayRange payRange) {
        return null;
    }

    @Override
    public List<JobOffer> findByLocalization(Location localization) {
        return null;
    }
}
