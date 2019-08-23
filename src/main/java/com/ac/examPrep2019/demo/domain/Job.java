package com.ac.examPrep2019.demo.domain;

public class Job
{
    private String title;

    private Job(){}

    public Job (Builder builder)
    {
        this.title = builder.title;
    }

    public String getTitle()
    {
        return title;
    }

    public static class Builder
    {
        private String title;


        public Builder title (String title)
        {
            this.title = title;
            return this;
        }

        public Job build()
        {
            return new Job(this);
        }
    }

    @Override
    public String toString()
    {
        return "Job{" + "title='" + title + '\'' + '}';
    }
}
