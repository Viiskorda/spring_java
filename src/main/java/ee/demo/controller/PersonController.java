package ee.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ee.demo.model.Person;
import ee.demo.repository.PersonRepository;


@RestController
@RequestMapping("/person")


public class PersonController {


  
  @Autowired 
  PersonRepository personRepository;


	//create
	@RequestMapping(method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void create(@RequestBody Person person) {

		personRepository.save(person);
		
	}
	
	
	@RequestMapping(value="/{firstName}", method = RequestMethod.GET)
	public List<Person> read(@PathVariable String firstName) {
		System.out.printf("kas kood jouab siia "+ firstName);
		return personRepository.findByFirstName(firstName);
	}
	
	
	

	
	@RequestMapping(value = "/{socialSecurityId}", method = RequestMethod.PUT) 
	public @ResponseBody Person updateUser(@PathVariable("socialSecurityId") long isocialSecurityId, 
	                                     @RequestBody Person person) {
		personRepository.save(person);
											return person;
		
	}
	
	
	//patch pidi paremini sobima, aga kood ei tööta
	/*
	@PatchMapping("/{socialSecurityId}")
	public Person updateUser(@RequestParam("firstName") String firstName, @PathVariable("flastName") String flastName) {
	 Person newPerson = updateUser(firstName, flastName);
	return newPerson;
	
	}
	*/

	
	//delete
	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable String id) {
		System.out.printf("kas kood jouab siia "+ id);
		personRepository.deleteById(id);
	}
	
  
  

}








