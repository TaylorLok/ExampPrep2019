package com.ac.examPrep2019.demo.factory;

import com.ac.examPrep2019.demo.domain.Demography;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DemographyFactoryTest
{
    Demography demography;

    @Before
    public void setUp() throws Exception
    {
        demography = DemographyFactory.getDemo("Black","Masculin");
    }

    @Test
    public void getDemo()
    {
        assertEquals(demography.toString(),"Black","Black");
        assertEquals(demography.toString(),"Masculin","Masculin");
    }
}