package pl.sages.dao;

import org.springframework.stereotype.Repository;
import pl.sages.model.User;

@Repository
public interface UsersDao extends AbstractDao<User> {

  User findUserByEmail(String email);

}
