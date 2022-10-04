package com.pmart5a.springhibernate.controller;

import com.pmart5a.springhibernate.entity.Person;
import com.pmart5a.springhibernate.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/persons")
public class PersonController {

    private final PersonService personService;

    @GetMapping("/by-city")
    public List<Person> getPersons(@RequestParam String city) {
        return personService.getPersonsByCity(city);
    }

    @GetMapping("/by-age")
    public List<Person> getAge(@RequestParam int age) {
        return personService.getPersonsByAgeLessThanOrderByAge(age);
    }

    @GetMapping("/by-name-surname")
    public List<Optional<Person>> getNameSurname(@RequestParam String name, @RequestParam String surname) {
        return personService.getPersonsByNameAndSurname(name, surname);
    }
}