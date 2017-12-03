package pl.sages.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.web.client.RestTemplate
import pl.sages.dao.ApplicantDao
import pl.sages.dao.ApplicationDao
import pl.sages.dao.JobOfferDao
import pl.sages.model.Applicant
import pl.sages.model.JobOffer
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

import static org.assertj.core.api.Assertions.assertThat
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT

@Unroll
@SpringBootTest(webEnvironment = RANDOM_PORT)
class ApplicantControllerSpec extends Specification {

    @Autowired
    ApplicantController applicantController

    @Autowired
    ApplicationDao applicationDao
    @Autowired
    ApplicantDao applicantDao
    @Autowired
    JobOfferDao jobOfferDao

    @Autowired
    TestRestTemplate restTemplate

    def applicantId
    def jobOfferId

    def setup() {
        def offer = new JobOffer()
        jobOfferDao.save(offer)
        jobOfferId = offer.id
        def applicant = new Applicant()
        applicantDao.save(applicant)
        applicantId = applicant.getId()
    }

    def "should find list of users"() {
        given:
        when:
        String result = restTemplate.getForObject(
                "/jobOffer/${jobOfferId}/applicant/${applicantId}", String.class)
        then:
        assertThat(applicationDao.findAll().size() == 1)
        assertThat(result == "udalo sie")
    }

}
