package pl.sages.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.sages.dao.ApplicantDao;
import pl.sages.model.Applicant;


import java.util.List;

@RestController
public class ApplicantController {

    public static final String APPLICANT_BASE_URL = "/Applicants";

    @Autowired
    private ApplicantDao applicantDao;

    @RequestMapping(value = APPLICANT_BASE_URL, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<Applicant> getApplicant() {
        return applicantDao.findAll();
    }
}
