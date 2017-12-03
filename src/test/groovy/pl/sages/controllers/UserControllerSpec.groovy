package pl.sages.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.web.client.RestTemplate
import pl.sages.dao.UserDao
import pl.sages.model.User
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

import static org.assertj.core.api.Assertions.assertThat

@Unroll
@SpringBootTest
class UserControllerSpec extends Specification {

    @Autowired
    UserController userController

    @Autowired
    UserDao userDao

    @Shared
    RestTemplate restTemplate
    final static int MULTIPLY_FACTOR = 10

    def setup() {
        MULTIPLY_FACTOR.times{userDao.save(new User())}
        restTemplate = new RestTemplate()
    }

    def "should find list of users"() {
        given:
        when:
        List<User> users = (List<User>) restTemplate.getForObject(
                "http://localhost:8080/users", List.class)
        then:
        assertThat(users.size()==MULTIPLY_FACTOR)
    }

}
