package com.ac.examPrep2019.demo.repository.demography;

import com.ac.examPrep2019.demo.domain.Demography;
import com.ac.examPrep2019.demo.repository.IRepository;

import java.util.Set;

public interface DemographyRepository extends IRepository<Demography,String>
{
    Set<Demography> getAll();
}
