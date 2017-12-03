package model;

import lombok.Data;
import model.helpers.AbstractEntity;

import javax.persistence.Entity;

@Data
@Entity
public class Location extends AbstractEntity {

    private String text;
    private double longitude;
    private double latitude;
}
