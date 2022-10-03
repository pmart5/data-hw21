package com.pmart5a.springhibernate.controller;

import com.pmart5a.springhibernate.entity.Person;
import com.pmart5a.springhibernate.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/persons")
public class PersonController {

    private final PersonService personService;

    @GetMapping("/by-city")
    public List<Person> getPersons(@RequestParam("city") String city) {
        return personService.getPersonsByCity(city);
    }
}