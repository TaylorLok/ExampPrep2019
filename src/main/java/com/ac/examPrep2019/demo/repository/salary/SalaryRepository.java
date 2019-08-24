package com.ac.examPrep2019.demo.repository.salary;

import com.ac.examPrep2019.demo.domain.Salary;
import com.ac.examPrep2019.demo.repository.IRepository;

import java.util.Set;

public interface SalaryRepository extends IRepository<Salary, String>
{
   Set<Salary> getAll();

}
