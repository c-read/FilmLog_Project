package com.tsitraining.cread.FilmLog;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Actor
{
    private String name;
    private Date dob;


    public Actor(String name, Date dob)
    {
        this.name = name;
        this.dob = dob;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public Date getDob()
    {
        return dob;
    }
    public void setDob(Date dob)
    {
        this.dob = dob;
    }

    List<String> filmsIn = new ArrayList<String>();

    public void addFilm(Actor actor)
    {
        /*some logic*/
    }
}
