package daoImplementation;

import dao.JobOfferDao;
import model.JobOffer;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class JobOfferDaoImplTest
{
    void shouldFindJobOfferByTitle()
    {
        JobOffer jobOffer = new JobOffer();
        String title = "title";
        JobOfferDaoImpl jobOfferDao = new JobOfferDaoImpl();
        List<JobOffer> foundJobOfferList = jobOfferDao.findByTitle(title);
        assertThat(foundJobOfferList).contains(jobOffer);
    }
}

