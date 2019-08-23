package com.ac.examPrep2019.demo.factory;

import com.ac.examPrep2019.demo.domain.Job;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JobFactoryTest
{
    Job job;

    @Before
    public void setUp() throws Exception
    {
        job = JobFactory.getTitle("Manager");
    }

    @Test
    public void getTitle()
    {
        assertEquals(job.getTitle(),"Manager","Manager");
    }
}