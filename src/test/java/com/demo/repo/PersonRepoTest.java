package com.demo.repo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.entites.Person;


@SpringBootTest
public class PersonRepoTest {
	
	@Autowired
	private PersonRepo personRepo;
	
	@Test
	void isPersonExistsById() {
		Person person = new Person(5,"Peter","Delhi");
		personRepo.save(person);
		
	Boolean actualResult = personRepo.isPersonExitsById(5);
	
	assertThat(actualResult).isTrue();
		
		
	}

}
