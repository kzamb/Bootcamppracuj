package model;

import lombok.Value;
import model.helpers.AbstractEntity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Date;
import java.util.List;

@Value
public class JobOffer extends AbstractEntity
{

    private String title;
    private String description;
    @OneToMany
    @JoinColumn(name="employer_id")

    private Employer employer;
    private String candidateRequirements;
    private PayRange payRange;
    private List<String> benefitList;
    private Date offerDueDate;
    private Date jobStartDate;
    @OneToOne
    private Location localization;
    private List<String> jobConditions;
}
