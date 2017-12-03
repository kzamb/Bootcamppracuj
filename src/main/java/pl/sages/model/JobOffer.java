package pl.sages.model;

import lombok.*;
import pl.sages.model.helpers.AbstractEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Entity
@Data
public class JobOffer extends AbstractEntity {
  private String title;
  private String description;
  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  @JoinColumn
  private Employer employer;
  private String candidateRequirements;
  @OneToOne
  private PayRange payRange;
  @ElementCollection
  private List<String> benefitList;
  private Date offerDueDate;
  private Date jobStartDate;
  @OneToOne
  private Location localization;
  @ElementCollection
  private List<String> jobConditions;
}
