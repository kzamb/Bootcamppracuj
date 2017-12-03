package pl.sages.dao

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import pl.sages.model.JobOffer
import spock.lang.Specification
import spock.lang.Unroll

//import javax.persistence.EntityManager
//import javax.persistence.EntityManagerFactory
//import javax.persistence.Persistence

@Unroll
@SpringBootTest
class JobOfferDAOImplSpec extends Specification {

  @Autowired
  private JobOfferDao dao

  def "should find smth"() {

//        String townName, List<String> expectedUsers

    given:
    // stworzenie obiektu i zapis
    JobOffer jobOffer = new JobOffer();
    jobOffer.setTitle("abc")
    println(jobOffer)
    dao.save(jobOffer)

    when:
    // szukanie w pl.sages.dao po tytule
    List<JobOffer> foundJobOfferList = dao.findByTitle("abc");

    then:
    // sprawdzenie niezbylt dobre poprzez .contains
    foundJobOfferList.size() == 1
    foundJobOfferList.every({ it.title == "abc" })
  }
}
