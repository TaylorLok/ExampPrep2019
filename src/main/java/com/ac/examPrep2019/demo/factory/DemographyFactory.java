package com.ac.examPrep2019.demo.factory;

import com.ac.examPrep2019.demo.domain.Demography;

public class DemographyFactory
{
    public static Demography getDemo(String race, String gender)
    {
        return new Demography.Builder()
                             .race(race)
                             .gender(gender)
                             .build();
    }
}
