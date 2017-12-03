package model;

import model.helpers.AbstractEntity;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

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
