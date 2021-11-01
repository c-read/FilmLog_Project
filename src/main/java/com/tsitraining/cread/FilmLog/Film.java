package com.tsitraining.cread.FilmLog;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="film")
public class Film
{

    @Id
 /*   @GeneratedValue(strategy=GenerationType.TABLE)*/
    @Column(name="film_id")
    private int film_id;

    @Column(name="title")
    private String title;

    @Column(name="release_year")
    private int releaseYear;
    List<String> actorsInFilm = new ArrayList<String>();

    public Film(){}

    public Film(String title, int releaseYear)
    {
        this.title = title;
        this.releaseYear = releaseYear;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }

    public int getReleaseYear()
    {
        return releaseYear;
    }
    public void setReleaseYear(int releaseYear)
    {
        this.releaseYear = releaseYear;
    }


    public int getFilm_id()
    {
        return film_id;
    }
    public void setFilm_id(int film_id)
    {
        this.film_id = film_id;
    }

/*    public void addActor(Actor actor)
    {
        some logic
    }*/
}
