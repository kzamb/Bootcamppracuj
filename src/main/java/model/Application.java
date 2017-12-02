package model;

import model.helpers.Status;

import java.util.Date;

public class Application {

    private Users user;
    private JobOffer jobOffer;
    private Date date;
    private Status status;
    private Date statusDate;

    public Application(Users user, JobOffer jobOffer, Date date, Status status, Date statusDate) {
        this.user = user;
        this.jobOffer = jobOffer;
        this.date = date;
        this.status = status;
        this.statusDate = statusDate;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public void setJobOffer(JobOffer jobOffer) {
        this.jobOffer = jobOffer;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }


    @Override
    public String toString() {
        return "Application{" +
                "user=" + user +
                ", jobOffer=" + jobOffer +
                ", date=" + date +
                ", status=" + status +
                ", statusDate=" + statusDate +
                '}';
    }
}
