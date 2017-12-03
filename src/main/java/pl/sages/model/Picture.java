package pl.sages.model;

import lombok.Data;
import pl.sages.model.helpers.AbstractEntity;

import javax.persistence.Entity;

@Data
@Entity
public class Picture extends AbstractEntity {
  private String name;

}
