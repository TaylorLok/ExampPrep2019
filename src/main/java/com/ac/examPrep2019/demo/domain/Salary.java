package com.ac.examPrep2019.demo.domain;

import java.util.Objects;

public class Salary
{
    private String wages, tax;

    private Salary(){}

    public Salary(Builder builder)
    {
        this.wages = builder.wages;
        this.tax = builder.tax;
    }

    public String getWages()
    {
        return wages;
    }

    public String getTax()
    {
        return tax;
    }

    public static class Builder
    {
        private String wages, tax;


        public Builder wages(String wages)
        {
            this.wages = wages;
            return this;
        }

        public Builder tax(String tax)
        {
            this.tax = tax;
            return this;
        }

        public Salary build()
        {
            return new Salary(this);
        }
    }


    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Salary)) return false;
        Salary salary = (Salary) o;
        return wages.equals(salary.wages) && tax.equals(salary.tax);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(wages, tax);
    }

    @Override
    public String toString()
    {
        return "Salary{" + "wages='" + wages + '\'' + ", tax='" + tax + '\'' + '}';
    }
}
