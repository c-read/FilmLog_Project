package com.tsitraining.cread.FilmLog;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Actor
{

    @Id
    @GeneratedValue(strategy=GenerationType.TABLE)
    private int actor_id;

    private String name;
    private LocalDate dob;
    List<String> filmsIn = new ArrayList<String>();

    public Actor(){}

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
    public void setDob(LocalDate dob)
    {
        this.dob = dob;
    }


    public int getActor_id()
    {
        return actor_id;
    }
    public void setActor_id(int actor_id)
    {
        this.actor_id = actor_id;
    }


    public void addFilm(Film film)
    {
        /*some logic*/
    }
}
