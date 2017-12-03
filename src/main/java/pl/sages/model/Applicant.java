package pl.sages.model;

import lombok.Data;
import pl.sages.model.helpers.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Data
@Entity
public class Applicant extends AbstractEntity {

  private String firstName;
  private String lastName;
  private String email;
  private String phoneNumber;
  private String highestEducationLevel;
  private String certificationsDesc;
  private String trainingsDesc;
  private int entireExperience;
  private int salaryExpectations;
  @OneToOne
  private Picture picture;
  @OneToOne
  @JoinColumn(name = "user_id")
  private User user;

}
