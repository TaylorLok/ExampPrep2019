package com.ac.examPrep2019.demo.repository.person;

import com.ac.examPrep2019.demo.domain.Person;

import java.util.*;

public class PersonRepositoryImpl implements PersonRepository
{
    private static PersonRepositoryImpl repository = null;

    private Map<String,Person> personMap; //creating your collection

    private PersonRepositoryImpl()
    {
        this.personMap = new HashMap<>();
    }//passing your collection

    public static PersonRepositoryImpl getRepository()
    {
        if(repository==null) repository = new PersonRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Person> getAll()
    {
        Collection Person = this.personMap.values();
        Set<Person> set = new HashSet<>();
        set.addAll(Person);
        return set;
    }

    @Override
    public Person create(Person person)
    {
        this.personMap.put(person.getName(),person);
        this.personMap.put(person.getSurName(),person);
        this.personMap.put(person.getId(),person);
        return person;
    }

    @Override
    public Person read(String s)
    {
        return this.personMap.get(s);
    }

    @Override
    public Person update(Person person)
    {
        this.personMap.replace(person.getName(), person);
        this.personMap.replace(person.getSurName(),person);
        this.personMap.replace(person.getId(),person);
        return person;
    }

    @Override
    public void delete(String s)
    {
        this.personMap.remove(s);
    }
}
