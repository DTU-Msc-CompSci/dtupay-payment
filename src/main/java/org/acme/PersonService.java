package org.acme;

public class PersonService {
	
	private Person person = new Person("Hopper","Garden City");
	
	public PersonService() {
		System.out.println("HelloService Created");
	}
	
	public String getGreetings() {
		return "Hello RESTEasy";
	}
	
	public Person getPerson() {
		return person;
	}
	
	public void setPerson(Person p) {
		person = p;
	}

}
