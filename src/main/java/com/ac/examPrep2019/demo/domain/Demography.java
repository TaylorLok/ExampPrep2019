package com.ac.examPrep2019.demo.domain;

public class Demography
{
    private String race, gender;

    private Demography(){}

    public Demography(Builder builder)
    {
        this.gender = builder.gender;
        this.race = builder.race;
    }

    public String getRace()
    {
        return race;
    }

    public String getGender()
    {
        return gender;
    }

    public static class Builder
    {
        private String race,gender;


        public Builder race(String race)
        {
            this.race = race;
            return this;
        }

        public Builder gender(String gender)
        {
            this.gender = gender;
            return this;
        }

        public Demography build()
        {
            return new Demography(this);
        }
    }

    @Override
    public String toString()
    {
        return "Demography{" + "race='" + race + '\'' + ", gender='" + gender + '\'' + '}';
    }
}
