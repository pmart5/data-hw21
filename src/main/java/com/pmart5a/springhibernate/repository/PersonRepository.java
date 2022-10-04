package com.pmart5a.springhibernate.repository;

import com.pmart5a.springhibernate.entity.Person;
import com.pmart5a.springhibernate.entity.PersonId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface PersonRepository extends JpaRepository<Person, PersonId> {

    List<Person> findByCityOfLiving(String city);

    List<Person> findByPersonIdAgeLessThanOrderByPersonIdAge(int age);

    List<Optional<Person>> findByPersonIdNameAndPersonIdSurname(String name, String surname);
}