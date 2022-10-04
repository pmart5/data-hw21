package com.pmart5a.springhibernate.service;

import com.pmart5a.springhibernate.entity.Person;
import com.pmart5a.springhibernate.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PersonService {

    private final PersonRepository personRepository;

    public List<Person> getPersonsByCity(String city) {
        return personRepository.findByCityOfLiving(city);
    }

    public List<Person> getPersonsByAgeLessThanOrderByAge(int age) {
        return personRepository.findByPersonIdAgeLessThanOrderByPersonIdAge(age);
    }

    public List<Optional<Person>> getPersonsByNameAndSurname(String name, String surname) {
        return personRepository.findByPersonIdNameAndPersonIdSurname(name, surname);
    }
}