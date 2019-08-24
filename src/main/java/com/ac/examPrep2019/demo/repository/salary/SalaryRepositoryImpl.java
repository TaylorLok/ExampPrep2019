package com.ac.examPrep2019.demo.repository.salary;

import com.ac.examPrep2019.demo.domain.Salary;

import java.util.*;

public class SalaryRepositoryImpl implements SalaryRepository
{
    private static SalaryRepositoryImpl repository = null;

    private Map<String,Salary> salaryMap;

    private SalaryRepositoryImpl()
    {
        this.salaryMap = new HashMap<>();
    }

    public static SalaryRepositoryImpl getRepository()
    {
        if(repository==null) repository = new SalaryRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Salary> getAll()
    {
        Collection Salary = this.salaryMap.values();
        Set<Salary> set = new HashSet<>();
        set.addAll(Salary);
        return set;
    }

    @Override
    public Salary create(Salary salary)
    {
        this.salaryMap.put(salary.getWages(),salary);
        this.salaryMap.put(salary.getTax(),salary);
        return salary;
    }

    @Override
    public Salary read(String s)
    {
        return this.salaryMap.get(s);
    }

    @Override
    public Salary update(Salary salary)
    {
        this.salaryMap.replace(salary.getWages(),salary);
        this.salaryMap.replace(salary.getTax(),salary);
        return salary;
    }

    @Override
    public void delete(String s)
    {
       this.salaryMap.remove(s);
    }
}
