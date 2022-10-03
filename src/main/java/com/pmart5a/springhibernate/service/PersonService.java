package com.pmart5a.springhibernate.service;

import com.pmart5a.springhibernate.entity.Person;
import com.pmart5a.springhibernate.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PersonService {

    private final PersonRepository personRepository;

    public List<Person> getPersonsByCity(String city) {
        return personRepository.getPersonByCity(city);
    }
}