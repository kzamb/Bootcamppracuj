package pl.sages.dao;

import org.springframework.stereotype.Repository;
import pl.sages.model.Employer;
import pl.sages.model.JobOffer;


import java.util.List;

@Repository
public interface EmployerDao extends AbstractDao<Employer> {

    List<Employer> findByCompanyName(String companyName);
}
