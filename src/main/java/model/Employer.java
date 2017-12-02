package model;

import model.helpers.AbstractEntity;
import model.helpers.Picture;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
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

    public Employer(String companyName, String eMail, String location, int numberOfDevelopers, int numberOfEmploees, Picture logo, List<Picture> pictures) {
        this.companyName = companyName;
        this.eMail = eMail;
        this.location = location;
        this.numberOfDevelopers = numberOfDevelopers;
        this.numberOfEmploees = numberOfEmploees;
    }


    public Employer() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}

