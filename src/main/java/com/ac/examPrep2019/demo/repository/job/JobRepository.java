package com.ac.examPrep2019.demo.repository.job;

import com.ac.examPrep2019.demo.domain.Job;
import com.ac.examPrep2019.demo.repository.IRepository;

import java.util.Set;

public interface JobRepository extends IRepository <Job,String>
{
    Set<Job> getAll();
}
