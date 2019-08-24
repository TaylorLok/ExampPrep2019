package com.ac.examPrep2019.demo.repository;

public interface IRepository <T,ID>
{
   T create(T t); // will find proper explaination but its needs one of the primary key
   T read(ID id);
   T update(T t);// you can only update something that existed therefore it has to have some parameter from the create method
   void delete(ID id); // ID in most case is a primary key which is the ID.
}
