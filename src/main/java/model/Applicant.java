package model;


import model.helpers.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Applicant extends AbstractEntity {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String highestEducationLevel;
    private String certificationsDesc;
    private String trainingsDesc;
    private int entireExperience;
    private int salaryExpectations;

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    @OneToOne

    private Users user;

    public Applicant() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHighestEducationLevel() {
        return highestEducationLevel;
    }

    public void setHighestEducationLevel(String highestEducationLevel) {
        this.highestEducationLevel = highestEducationLevel;
    }

    public String getCertificationsDesc() {
        return certificationsDesc;
    }

    public void setCertificationsDesc(String certificationsDesc) {
        this.certificationsDesc = certificationsDesc;
    }

    public String getTrainingsDesc() {
        return trainingsDesc;
    }

    public void setTrainingsDesc(String trainingsDesc) {
        this.trainingsDesc = trainingsDesc;
    }

    public int getEntireExperience() {
        return entireExperience;
    }

    public void setEntireExperience(int entireExperience) {
        this.entireExperience = entireExperience;
    }

    public int getSalaryExpectations() {
        return salaryExpectations;
    }

    public void setSalaryExpectations(int salaryExpectations) {
        this.salaryExpectations = salaryExpectations;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", highestEducationLevel='" + highestEducationLevel + '\'' +
                ", certificationsDesc='" + certificationsDesc + '\'' +
                ", trainingsDesc='" + trainingsDesc + '\'' +
                ", entireExperience=" + entireExperience +
                ", salaryExpectations=" + salaryExpectations +
                '}';
    }
}
