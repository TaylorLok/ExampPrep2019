package com.ac.examPrep2019.demo.service.person;

import com.ac.examPrep2019.demo.domain.Person;
import com.ac.examPrep2019.demo.repository.person.PersonRepositoryImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PersonServiceImpl implements PersonService
{
    private static PersonServiceImpl service = null;

    private PersonRepositoryImpl repository;

    private PersonServiceImpl ()
    {
        this.repository = new PersonRepositoryImpl();
    }

    public static PersonServiceImpl getService()
    {
        if(service ==null) service = new PersonServiceImpl();
        return service;
    }

    @Override
    public Set<Person> getAll()
    {
        return repository.getAll();
    }

    @Override
    public Person create(Person person)
    {
        return repository.create(person);
    }

    @Override
    public Person read(String s)
    {
        return repository.read(s);
    }

    @Override
    public Person update(Person person)
    {
        return repository.update(person);
    }

    @Override
    public void delete(String s)
    {
       repository.delete(s);
    }
}
