package ee.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import ee.demo.model.Person;

public interface PersonRepository extends MongoRepository<Person, String> {

	public Person findOneById(String id);
	public Person findOneBysocialSecurityId(String socialSecurityId);
	public List<Person> findByFirstName(String firstName);
	//public Person updateUser(String firstName, String flastName) ;


}
