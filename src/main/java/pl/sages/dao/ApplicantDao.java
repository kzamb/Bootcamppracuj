package pl.sages.dao;

import org.springframework.stereotype.Repository;
import pl.sages.model.Applicant;

@Repository
public interface ApplicantDao extends AbstractDao<Applicant>{
    Applicant findApplicantById(Long id);

}
