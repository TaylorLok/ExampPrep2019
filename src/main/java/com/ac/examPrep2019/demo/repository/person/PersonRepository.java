package com.ac.examPrep2019.demo.repository.person;

import com.ac.examPrep2019.demo.domain.Person;
import com.ac.examPrep2019.demo.repository.IRepository;

import java.util.Set;

public interface PersonRepository extends IRepository <Person,String>
{
    Set<Person> getAll();
}
