package pl.sages.model;

import lombok.Data;
import pl.sages.model.helpers.AbstractEntity;

import javax.persistence.Entity;

@Entity
@Data
public class PayRange extends AbstractEntity {
  int lowValue;
  int highValue;
}
