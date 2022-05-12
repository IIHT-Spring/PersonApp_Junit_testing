package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.test.services.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	public ResponseEntity<?> getAllPersons() {
		return ResponseEntity.ok(this.personService.getAllPerson());
		
	}

}
