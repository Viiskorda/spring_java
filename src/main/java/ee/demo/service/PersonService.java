package ee.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ee.demo.model.Person;
import ee.demo.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired 
	private PersonRepository personRepository;
	
	public Person create(String id, String socialSecurityId, String firstName, String lastName, int age) {
		return personRepository.save(new Person());
		
	}
	
	
	//read
	public List<Person> getAll(){
	return personRepository.findAll();
	}
	
	
	public List<Person> findByFirstName(String firstName) {
		return personRepository.findByFirstName(firstName);
		
		
	}
	
	public Person update( String socialSecurityId, String firstName, String lastName) {
		Person p=personRepository.findOneBysocialSecurityId(socialSecurityId);
		p.setLastName(firstName);
		p.setLastName(lastName);
		return personRepository.save(p);
				
	}


		public void delete(String socialSecurityId) {
			Person p=personRepository.findOneBysocialSecurityId(socialSecurityId);
			personRepository.delete(p);
			
		}
	
	
	
}
