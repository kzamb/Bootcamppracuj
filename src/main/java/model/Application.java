package model;

import lombok.Value;
import model.helpers.Status;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Date;

@Value
public class Application {

    @OneToMany
    @JoinColumn(name="jobOffer_id")
    private JobOffer jobOffer;
    @OneToMany
    @JoinColumn(name="applicant_id")
    private Applicant applicant;

    private Date date;
    private Status status;
    private Date statusDate;

    public Application(JobOffer jobOffer, Applicant applicant, Date date, Status status, Date statusDate) {
        this.jobOffer = jobOffer;
        this.applicant = applicant;
        this.date = date;
        this.status = status;
        this.statusDate = statusDate;
    }

}
