package com.ac.examPrep2019.demo.factory;

import com.ac.examPrep2019.demo.domain.Salary;

public class SalaryFactory
{
    public static Salary getSalary(String wages, String tax)
    {
        return new Salary.Builder()
                         .tax(tax)
                         .wages(wages)
                         .build();
    }
}

