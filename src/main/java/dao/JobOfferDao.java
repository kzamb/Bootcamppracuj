package dao;

import model.JobOffer;

public interface JobOfferDao
{
    JobOffer findByTitle(String title);
    JobOffer findByDescription(String description);
    JobOffer findByCandidateRequirements(String CandidateRequirements);
}