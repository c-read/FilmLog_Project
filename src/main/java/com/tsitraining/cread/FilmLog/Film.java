package com.tsitraining.cread.FilmLog;

import javax.persistence.*;

@Entity
@Table(name="film")
public class Film
{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int film_id;
    private String title;
    private String description;
    private int release_year;
    private int language_id;
    private int rental_duration;
    private double rental_rate;
    private int length;
    private double replacement_cost;
    private String rating;
    private String special_features;


    public Film(String title, int language_id, int length)
    {
        this.title = title;
        this.language_id = language_id;
        this.length = length;
    }

    public Film(int film_id, String title, String description, int releaseYear, int language_id, int rental_duration,
                double rental_rate, int length, double replacement_cost, String rating, String special_features)
    {
        this.film_id = film_id;
        this.title = title;
        this.description = description;
        this.release_year = releaseYear;
        this.language_id = language_id;
        this.rental_duration = rental_duration;
        this.rental_rate = rental_rate;
        this.length = length;
        this.replacement_cost = replacement_cost;
        this.rating = rating;
        this.special_features = special_features;
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
    public void setLength(int length) {this.length = length; }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReleaseYear() {
        return release_year;
    }

    public void setReleaseYear(int release_year) {
        this.release_year = release_year;
    }

    public int getRental_duration() {
        return rental_duration;
    }

    public void setRental_duration(int rental_duration) {
        this.rental_duration = rental_duration;
    }

    public double getRental_rate() {
        return rental_rate;
    }

    public void setRental_rate(double rental_rate) {
        this.rental_rate = rental_rate;
    }

    public double getReplacement_cost() {
        return replacement_cost;
    }

    public void setReplacement_cost(double replacement_cost) {
        this.replacement_cost = replacement_cost;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSpecial_features() {
        return special_features;
    }

    public void setSpecial_features(String special_features) {
        this.special_features = special_features;
    }
}
