package daoimplementation

import dao.JobOfferDao
import model.JobOffer
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Unroll

import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.persistence.Persistence

@Unroll
class JobOfferDAOImplSpec extends Specification {


    @Autowired
    private JobOfferDao dao



    def "should get users from town"(String townName, List<String> expectedUsers) {
        given:
        // stworzenie obiektu i zapis
        dao.save()

        when:
        // szukanie w dao po tytule
        List<JobOffer> foundJobOfferList = jobOfferDao.findByTitle(title);
        
        then:
        // sprawdzenie

    }
}
