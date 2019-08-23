package com.ac.examPrep2019.demo.factory;

import com.ac.examPrep2019.demo.domain.Person;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonFactoryTest
{
    Person person; //calling the class here and its get imported

    @Before
    public void setUp() throws Exception
    {
        person = PersonFactory.getPerson("Taylor","Lokombe","214291324"); // you pass your variable and you are calling your factory. And customize it with real data to be tested.
    }

   // @After
   // public void tearDown() throws Exception
   // {
   // }

    @Test
    public void getPerson()
    {
        assertEquals(person.getName(),"Taylor","Taylor");
        assertEquals(person.getSurName(),"lokombe","Taylor");// this one will fail because check the @ before its been already customized anf i put "taylor" instead of "lokombe"
        assertEquals(person.getId(),"214291324","214291324");// please run the entire of this class from "public class PersonFactoryTest" it will tell you what fails

    }
}