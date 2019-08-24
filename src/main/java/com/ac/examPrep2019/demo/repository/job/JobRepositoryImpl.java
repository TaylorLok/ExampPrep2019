package com.ac.examPrep2019.demo.repository.job;

import com.ac.examPrep2019.demo.domain.Job;

import java.util.*;

public class JobRepositoryImpl implements JobRepository
{
    private static JobRepositoryImpl repository = null;

    private Map<String,Job> jobMap;

    private JobRepositoryImpl()
    {
        this.jobMap = new HashMap<>();
    }

    public static JobRepositoryImpl getRepository()
    {
        if(repository==null) repository = new JobRepositoryImpl();
        return repository;
    }


    @Override
    public Set<Job> getAll()
    {
        Collection Job = this.jobMap.values();
        Set<Job> set = new HashSet<>();
        set.addAll(Job);
        return set;
    }

    @Override
    public Job create(Job job)
    {
        this.jobMap.put(job.getTitle(),job);
        return job;
    }

    @Override
    public Job read(String s)
    {
        return this.jobMap.get(s);
    }

    @Override
    public Job update(Job job)
    {
        this.jobMap.replace(job.getTitle(),job);
        return job;
    }

    @Override
    public void delete(String s)
    {
      this.jobMap.remove(s);
    }
}
