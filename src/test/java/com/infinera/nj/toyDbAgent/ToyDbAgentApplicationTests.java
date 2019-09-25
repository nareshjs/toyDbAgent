package com.infinera.nj.toyDbAgent;

import com.infinera.nj.toyDbAgent.model.Person;
import com.infinera.nj.toyDbAgent.repository.PersonRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ToyDbAgentApplicationTests {
	@Autowired
	private PersonRepository personRepository;
	
	@Before
	public void setUp() throws Exception {
		Person person1= new Person("Alice", 23);
		Person person2= new Person("Bob", 38);
		//save person, verify has ID value after save
		assertNull(person1.getId());
		assertNull(person2.getId());//null before save
		this.personRepository.save(person1);
		this.personRepository.save(person2);
		assertNotNull(person1.getId());
		assertNotNull(person2.getId());
	}

	@Test
	public void testFetchData(){
		/*Test data retrieval*/
		Person personA = personRepository.findByFirstName("Bob");
		assertNotNull(personA);
		assertEquals(38, personA.getAge());
		/*Get all products, list should only have two*/
		Iterable<Person> persons = personRepository.findAll();
		int count = 0;
		for(Person p : persons){
			count++;
		}
		assertEquals(count, 2);
	}
	/*@Test
	public void contextLoads() {
	}
*/
}
