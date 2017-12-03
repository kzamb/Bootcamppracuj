package pl.sages.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.sages.dao.ApplicantDao;
import pl.sages.model.Applicant;
import pl.sages.services.PracujPlService;


import java.util.List;

@RestController
public class ApplicantController {

    public static final String APPLICANT_BASE_URL = "/Applicants";

    @Autowired
    private ApplicantDao applicantDao;

    @Autowired
    private PracujPlService pracujPlService;

    @RequestMapping(value = APPLICANT_BASE_URL, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Applicant> getApplicant() {
        return applicantDao.findAll();
    }

    @RequestMapping(value = "/jobOffer/{jobOfferId}/applicant/{applicantId}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String createNewApplication (Model model,
                                        @PathVariable ("jobOfferId") Long jobOfferId,
                                        @PathVariable ("applicantId") Long applicantId)
    {
        pracujPlService.createNewApplication(applicantId,jobOfferId);
        return "udalo sie";
    }
}
