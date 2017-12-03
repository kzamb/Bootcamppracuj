package pl.sages.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.sages.dao.LocationDao;
import pl.sages.dao.UserDao;
import pl.sages.model.Location;
import pl.sages.model.User;

import java.util.List;

@RestController
public class LocationController {

    public static final String LOCATION_BASE_URL = "/location";

    @Autowired
    private LocationDao locationDao;

    @RequestMapping(value = LOCATION_BASE_URL, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Location> getLocation() {
        return locationDao.findAll();
    }
}
