package com.tsitraining.cread.FilmLog;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Film
{
    private String name;
    private LocalDate releaseDate;
    List<String> actorsIn = new ArrayList<String>();



    public Film(String name, LocalDate releaseDate)
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
    public LocalDate getReleaseDate()
    {
        return releaseDate;
    }

    public void setDob(LocalDate releaseDate)
    {
        this.releaseDate = releaseDate;
    }

    public void addActor(Actor actor)
    {
        /*some logic*/
    }
}
