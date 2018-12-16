package ee.demo.model;
import org.springframework.data.annotation.Id;

public class Person {
	
	@Id
	private String id;
	private String socialSecurityId;
	private String firstName;
	private String lastName;	
	private int age;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSocialSecurityId() {
		return socialSecurityId;
	}
	public void setSocialSecurityId(String socialSecurityId) {
		this.socialSecurityId = socialSecurityId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	

}






	
