package pl.sages.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.sages.dao.EmployerDao;
import pl.sages.model.Employer;

import java.util.List;

@RestController
public class EmployerController {
    public static final String EMPLOYER_BASE_URL = "/employer";

    @Autowired
    private EmployerDao employerDao;

    @RequestMapping(value = EMPLOYER_BASE_URL, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<Employer> getEmployer() {
        return employerDao.findAll();
    }
}
