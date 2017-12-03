package pl.sages.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.sages.dao.PictureDao;
import pl.sages.model.Picture;


import java.util.List;

@Controller
public class PictureController {
    public static final String PICTURE_BASE_URL = "/picture";

    @Autowired
    private PictureDao pictureDao;

    @RequestMapping(value = PICTURE_BASE_URL, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Picture> getPicture() {
        return pictureDao.findAll();
    }
}
