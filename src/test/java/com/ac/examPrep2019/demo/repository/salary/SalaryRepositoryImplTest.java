package com.ac.examPrep2019.demo.repository.salary;

import com.ac.examPrep2019.demo.domain.Salary;
import com.ac.examPrep2019.demo.factory.SalaryFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SalaryRepositoryImplTest
{
    SalaryRepositoryImpl repository;
    Salary salary;

    @Before
    public void setUp() throws Exception
    {
        repository = SalaryRepositoryImpl.getRepository();
        salary = SalaryFactory.getSalary("R200","R20");
    }

    @Test
    public void create()
    {
        assertEquals(salary.getWages(),"R200");
        assertEquals(salary.getTax(),"R20");
    }

    @Test
    public void read()
    {
       assertEquals(salary.getWages(),"R200");
        assertEquals(salary.getTax(),"R20");
    }

    @Test
    public void update()
    {
        assertNotSame(salary.getWages(),"R220");
    }

    @Test
    public void delete()
    {
        repository.delete(salary.getWages());
        repository.delete(salary.getTax());
    }
}