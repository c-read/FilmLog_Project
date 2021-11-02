package com.tsitraining.cread.FilmLog;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="film")
public class Film
{

    @Id
    @GeneratedValue(strategy=GenerationType.TABLE)
    private int film_id;

    private String title;
    private int releaseYear;

    /*List<String> actorsInFilm = new ArrayList<String>();*/

    public Film(String title, int releaseYear)
    {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public Film(){}



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
