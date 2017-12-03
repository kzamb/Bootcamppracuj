package pl.sages.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.sages.dao.UserDao;
import pl.sages.model.User;

import java.util.List;


@RestController
public class UserController
{
    public static final String USER_BASE_URL = "/users";

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = USER_BASE_URL, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> getUsers() {
        return userDao.findAll();
    }

}
