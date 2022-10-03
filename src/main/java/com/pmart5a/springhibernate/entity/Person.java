package com.pmart5a.springhibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "persons", schema = "hibernate")
public class Person {

    @EmbeddedId
    private PersonId personId;

    @Column(length = 15)
    private String phoneNumber;

    @Column(length = 50)
    private String cityOfLiving;
}