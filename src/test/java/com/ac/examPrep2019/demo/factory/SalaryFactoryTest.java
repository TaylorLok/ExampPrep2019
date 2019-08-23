package com.ac.examPrep2019.demo.factory;

import com.ac.examPrep2019.demo.domain.Salary;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SalaryFactoryTest
{
    Salary salary;

    @Before
    public void setUp() throws Exception
    {
        salary = SalaryFactory.getSalary("200","10%");
    }

    @Test
    public void getSalary()
    {
        assertEquals(salary.getWages(),"200","200");
        assertEquals(salary.getTax(),"10%","10%");
    }
}