package com.ac.examPrep2019.demo.factory;

import com.ac.examPrep2019.demo.domain.Job;

public class JobFactory
{
    public static Job getTitle(String title)
    {
        return new Job.Builder()
                .title(title)
                .build();

    }

}
