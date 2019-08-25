package com.ac.examPrep2019.demo.service.person;

import com.ac.examPrep2019.demo.domain.Person;
import com.ac.examPrep2019.demo.factory.PersonFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonServiceImplTest
{
    private PersonServiceImpl service;
    private Person person;

    @Before
    public void setUp() throws Exception
    {
        service = PersonServiceImpl.getService();
        person = PersonFactory.getPerson("Taylor","Lokombe","214291324");
    }

    @Test
    public void getAll()
    {
        System.out.println(person.toString());
    }

    @Test
    public void create()
    {
        PersonServiceImpl.getService().create(person);
        System.out.println(person);

    }

    @Test
    public void read()
    {
        PersonServiceImpl.getService().read(person.getName());
        PersonServiceImpl.getService().read(person.getSurName());
        PersonServiceImpl.getService().read(person.getId());
        System.out.println(person);
    }

    @Test
    public void update()
    {
        PersonServiceImpl.getService().update(person);
        System.out.print(person.getName());
        System.out.print(person.getSurName());
    }

    @Test
    public void delete()
    {
        PersonServiceImpl.getService().delete(person.getName());
        System.out.print(person);
    }
}

  /**** public class genericService{
    public Person Person(String name, String surName, String Id)
    {
        Person employee = PersonFactory.buildPerson(fname,lname);
       Gender g = GenderService.getGender(gender);
        EmployeeGender eg = EmployeeGenderFactory.buildEmployeeGender(employee.getEmployeeNumber(), g.getId());
        PersonServiceImpl.getService().create(Person("Taylor","Lokombe","222"));
        employeeGenderService.getEmployeeGenderService().create(eg);
    }
}
**//////