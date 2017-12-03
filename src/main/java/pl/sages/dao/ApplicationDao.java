package dao;

import model.Application;
import model.JobOffer;
import model.Users;

import java.util.List;

public interface ApplicationDao {

    List<Application> findByUser (Users users);
    List <Application> findByJobOffer (JobOffer jobOffer);

}
