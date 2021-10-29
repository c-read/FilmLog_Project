package com.tsitraining.cread.FilmLog;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Film
{
    private String name;
    private Date releaseDate;


    public Film(String name, Date releaseDate)
    {
        this.name = name;
        this.releaseDate = releaseDate;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public Date getReleaseDate()
    {
        return releaseDate;
    }
    public void setDob(Date releaseDate)
    {
        this.releaseDate = releaseDate;
    }

    List<String> actorsIn = new ArrayList<String>();

    public void addActor(Film film)
    {
        /*some logic*/
    }
}
