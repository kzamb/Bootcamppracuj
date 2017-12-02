package model;

import lombok.Value;
import model.helpers.AbstractEntity;

import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.util.Date;
import java.util.List;

@Value
public class JobOffer extends AbstractEntity
{

    private String title;
    private String description;
    private String jobType;
    private String candidateRequirements;
    private List<String> benefitList;
    private Date offerDueDate;
    private Date jobStartDate;
    @OneToOne
    private Location localization;
    private List<String> jobConditions;
}
