package model;

import model.helpers.AbstractEntity;
import model.helpers.Picture;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

public class Employer extends AbstractEntity{
    private String companyName;
    private String eMail;
    private String location;
    private int numberOfDevelopers;
    private int numberOfEmploees;
    private Picture logo;
    private List<Picture> pictures;
    @OneToMany
    @JoinColumn(name="employer_id")
    private List<JobOffer> jobOffers;
}

