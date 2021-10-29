package com.tsitraining.cread.FilmLog;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Actor
{
    private String name;
    private LocalDate dob;
    List<String> filmsIn = new ArrayList<String>();



    public Actor(String name, LocalDate dob)
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
    public LocalDate getDob()
    {
        return dob;
    }
    public void setDob(Date dob)
    {
        this.dob = dob;
    }


    public void addFilm(Film film)
    {
        /*some logic*/
    }
}
