package pl.sages.model;

import lombok.Data;
import pl.sages.model.helpers.AbstractEntity;

import javax.persistence.Entity;

@Data
@Entity
public class Location extends AbstractEntity {

  private String text;
  private double longitude;
  private double latitude;
}
