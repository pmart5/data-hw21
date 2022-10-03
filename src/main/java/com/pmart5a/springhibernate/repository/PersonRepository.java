package com.pmart5a.springhibernate.repository;

import com.pmart5a.springhibernate.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PersonRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonByCity(String city) {
        return entityManager.createQuery("select p from Person p where p.cityOfLiving = :city", Person.class)
                .setParameter("city", city)
                .getResultList();
    }
}