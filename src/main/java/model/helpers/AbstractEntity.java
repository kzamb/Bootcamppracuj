package model.helpers;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@MappedSuperclass

public class AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public AbstractEntity() {}

    public AbstractEntity(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
