package pl.sages.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.sages.dao.UsersDao;
import pl.sages.model.User;

import java.util.List;


@RestController
public class UserController
{
    public static final String USER_BASE_URL = "/users";

    @Autowired
    private UsersDao userDao;

    @RequestMapping(value = USER_BASE_URL, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<User> getUsers() {
        return userDao.findAll();
    }
}
