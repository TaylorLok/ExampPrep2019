package com.ac.examPrep2019.demo.repository.demography;

import com.ac.examPrep2019.demo.domain.Demography;

import java.util.*;

public class DemographyRepositoryImpl implements DemographyRepository
{
    private static DemographyRepositoryImpl repository = null;

    private Map<String,Demography> demo;

    private DemographyRepositoryImpl()
    {
        this.demo = new HashMap<>();
    }

    public static DemographyRepositoryImpl getRepository()
    {
        if(repository==null) repository = new DemographyRepositoryImpl();
        return repository;
    }


    @Override
    public Set<Demography> getAll()
    {
        Collection Demo = this.demo.values();
        Set<Demography> set = new HashSet<>();
        set.addAll(Demo);
        return set;
    }

    @Override
    public Demography create(Demography demography)
    {
        this.demo.put(demography.getGender(),demography);
        this.demo.put(demography.getRace(),demography);
        return demography;
    }

    @Override
    public Demography read(String s)
    {
        return this.demo.get(s);
    }

    @Override
    public Demography update(Demography demography)
    {
        this.demo.replace(demography.getGender(),demography);
        this.demo.replace(demography.getRace(),demography);
        return demography;
    }

    @Override
    public void delete(String s)
    {
      this.demo.remove(s);
    }
}
