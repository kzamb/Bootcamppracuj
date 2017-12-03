package pl.sages.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sages.dao.ApplicantDao;
import pl.sages.dao.ApplicationDao;
import pl.sages.dao.JobOfferDao;
import pl.sages.model.Applicant;
import pl.sages.model.Application;
import pl.sages.model.JobOffer;
import pl.sages.model.helpers.Status;

import javax.transaction.Transactional;
import java.util.Calendar;
import java.util.Date;

import static pl.sages.model.helpers.Status.NEW;

@Service
public class PracujPlServiceImplementation implements PracujPlService{

    @Autowired
    ApplicantDao applicantDao;

    @Autowired
    ApplicationDao applicationDao;

    @Autowired
    JobOfferDao jobOfferDao;

    @Override
    @Transactional
    public void createNewApplication(Long applicantId, Long jobOfferId) {
        Applicant applicant = applicantDao.findOne(applicantId);
        JobOffer jobOffer = jobOfferDao.findOne(jobOfferId);
        Calendar instance = Calendar.getInstance();
        Date date = instance.getTime();
        Application newApplication = new Application(jobOffer,applicant, date, NEW, date);
        applicationDao.save(newApplication);
    }
}
