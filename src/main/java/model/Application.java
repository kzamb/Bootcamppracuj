package model;

import model.helpers.Status;
import model.helpers.AbstractEntity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Date;

public class Application extends AbstractEntity{

    @OneToMany
    @JoinColumn(name="jobOffer_id")
    private JobOffer jobOffer;
    @OneToMany
    @JoinColumn(name="applicant_id")
    private Applicant applicant;

    private Date date;
    private Status status;
    private Date statusDate;
}
