package daoimplementation

import dao.JobOfferDao
import model.JobOffer



import spock.lang.Specification
import spock.lang.Unroll

import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.persistence.Persistence


@Unroll
class JobOfferDAOImplSpec extends Specification {

    @Autowired
    private JobOfferDao dao

    def "should find smth"(String townName, List<String> expectedUsers) {
        given:
        // stworzenie obiektu i zapis
        JobOffer jobOffer = new JobOffer();
        dao.save()

        when:
        // szukanie w dao po tytule
        List<JobOffer> foundJobOfferList = jobOfferDao.findByTitle(title);
        
        then:
        // sprawdzenie niezbylt dobre poprzez .contains
        foundJobOfferList.contains(jobOffer)
    }
}
