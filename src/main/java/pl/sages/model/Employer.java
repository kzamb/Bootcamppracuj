package pl.sages.model;

import lombok.Data;
import pl.sages.model.helpers.AbstractEntity;
import pl.sages.model.helpers.Picture;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Employer extends AbstractEntity {
  private String companyName;
  private String eMail;
  private String location;
  private int numberOfDevelopers;
  private int numberOfEmploees;
  @OneToOne
  private Picture logo;
  @OneToMany
  private Set<Picture> pictures;
  @OneToMany(mappedBy = "employer")
  private Set<JobOffer> jobOffers;
}

