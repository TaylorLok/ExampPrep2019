package com.ac.examPrep2019.demo.repository.person;

import com.ac.examPrep2019.demo.domain.Person;
import com.ac.examPrep2019.demo.factory.PersonFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonRepositoryImplTest
{
    PersonRepositoryImpl repository;
    Person person;

    @Before
    public void setUp() throws Exception
    {
        repository = PersonRepositoryImpl.getRepository();
        person = PersonFactory.getPerson("Taylor","Lokombe","214291324");

    }

    @Test
    public void getAll() {
    }

    @Test
    public void create()
    {
       assertEquals(person.getName(),"Taylor");
       assertEquals(person.getSurName(),"Lokombe");
       assertEquals(person.getId(),"214291324");
    }

    @Test
    public void read()
    {

    }

    @Test
    public void update()
    {
      assertNotSame(person.getName(),person);
    }

    @Test
    public void delete() {
    }
}