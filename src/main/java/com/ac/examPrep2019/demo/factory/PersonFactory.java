package com.ac.examPrep2019.demo.factory;

import com.ac.examPrep2019.demo.domain.Person;

public class PersonFactory
{
    public static Person getPerson(String name, String surName, String Id)
    {
        return new Person.Builder()
                .Name(name)
                .surName(surName)
                .ID(Id)
                .build();
    }
}
