package com.tsitraining.cread.FilmLog;

import javax.persistence.*;

@Entity
@Table(name="film")
public class Film
{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
/*    @Column(name = "film_id", unique = true, nullable = false)*/
    private int film_id;

    private String title;
    private int language_id;
    private int length;


    /*List<String> actorsInFilm = new ArrayList<String>();*/

    public Film(String title,
                int language_id, int length)
    {
        this.title = title;
        this.language_id = language_id;
        this.length = length;
    }

    public Film(){}



    public int getFilm_id()
    {
        return film_id;
    }
    public void setFilm_id(int film_id)
    {
        this.film_id = film_id;
    }

    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }

    public int getLanguage_id() { return language_id; }
    public void setLanguage_id(int language_id) {this.language_id = language_id; }

    public int getLength() {return length; }
    public void setLength() {this.length = length; }

/*    public void addActor(Actor actor)
    {
        some logic
    }*/
}
