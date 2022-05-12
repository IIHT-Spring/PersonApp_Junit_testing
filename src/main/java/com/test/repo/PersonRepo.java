package com.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.test.entites.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {
	@Query("SELECT CASE WHEN COUNT(s) > 0 "
			+ "THEN TRUE ELSE DALSE END FROM "
			+ "Person s WHERE s.personId = ?1")
	Boolean isPersonExitsById(Integer id);

}
