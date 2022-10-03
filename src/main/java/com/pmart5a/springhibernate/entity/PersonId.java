package com.pmart5a.springhibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class PersonId implements Serializable {

    @Column(length = 20, nullable = false)
    private String name;

    @Column(length = 30, nullable = false)
    private String surname;

    @Column(nullable = false, columnDefinition = "int check(age >= 0)")
    private int age;
}