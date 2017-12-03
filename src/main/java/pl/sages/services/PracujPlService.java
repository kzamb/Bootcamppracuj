package pl.sages.services;

import pl.sages.model.Applicant;
import pl.sages.model.Application;

public interface PracujPlService {
    public void asignApplicantToApplication(Applicant applicant, Application application);
}
