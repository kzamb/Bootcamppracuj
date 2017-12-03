package model;

import lombok.Data;
import model.helpers.AbstractEntity;

import javax.persistence.Entity;

@Entity
@Data
public class PayRange extends AbstractEntity {
    int lowValue;
    int highValue;
}
