package model.helpers;

import lombok.Data;
import javax.persistence.Entity;

@Data
@Entity
public class Picture extends AbstractEntity{
    private String name;

}
