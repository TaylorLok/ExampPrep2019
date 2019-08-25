package com.ac.examPrep2019.demo.service.person;

import com.ac.examPrep2019.demo.domain.Person;
import com.ac.examPrep2019.demo.service.IService;

import java.util.Set;

public interface PersonService extends IService<Person,String>
{
    Set<Person> getAll();
}
