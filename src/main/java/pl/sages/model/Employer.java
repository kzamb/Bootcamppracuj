package model;

import lombok.Data;
import model.helpers.AbstractEntity;
import model.helpers.Picture;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Employer extends AbstractEntity{
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

