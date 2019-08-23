package com.ac.examPrep2019.demo.domain;

import java.util.Objects;

public class Person
{
    private String name,surName,Id;  //instantiate normal class

    private Person(){} // default constructor

    public Person (Builder builder)
    {
        this.name = builder.name;
        this.surName = builder.surName;
        this.Id = builder.Id;
    }// instantiating builder class

    public String getName()
    {
        return name;
    }

    public String getSurName()
    {
        return surName;
    }

    public String getId()
    {
        return Id;
    }

    public static class Builder //starting of the builder class. builder is like another class inside another class
    {
        private String name,surName,Id;

      public Builder Name(String name)
      {
          this.name = name;
          return this;
      }

      public Builder surName(String surName)
      {
          this.surName = surName;
          return this;
      }

      public Builder ID (String Id)
      {
          this.Id = Id;
          return this;
      }

      public Person build()
      {
          return new Person(this);
      }

    }// end of Builder class

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Id.equals(person.Id);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(Id);
    }

    @Override
    public String toString()
    {
        return "Person{" + "name='" + name + '\'' + ", surName='" + surName + '\'' + ", Id='" + Id + '\'' + '}';
    }
}// end of the entire class
