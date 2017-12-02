package dao;

import model.Users;

import java.util.List;

public interface UsersDao {

    Users findUser (String email);
    List<Users> findAll ();

}
