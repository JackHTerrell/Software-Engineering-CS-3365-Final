package com.jack.mbs.moviebookingsystem.api.datatypes;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    public static ArrayList<Movie> allMovies; // A list of all movies
    private String title; // What the movie is called
    private final ArrayList<String> genres; // What the genres the movie consists of. I.e. Action, Adventure
    private String thumbnailLocation; // Image used to depict movie.


    public Movie(String title, ArrayList<String> genres, String thumbnailLocation){
        this.title = title;
        this.genres = genres;
        this.thumbnailLocation=thumbnailLocation;
        allMovies.add(this);
    }

    public Movie(String title, ArrayList<String> genres){
        this.title = title;
        this.genres = genres;
        this.thumbnailLocation="no_thumbnail.png";
        allMovies.add(this);
    }

    public Movie(String title){
        this.title = title;
        this.genres = null;
        this.thumbnailLocation="no_thumbnail.png";
        allMovies.add(this);
    }

    public Movie(){
        this.title = null;
        this.genres = null;
        this.thumbnailLocation="no_thumbnail.png";
        allMovies.add(this);
    }

    /*
        Get title of movie
     */
    public String getTitle(){
        return this.title;
    }

    /*
        Set title to movie
     */
    public void setTitle(String title){
        this.title = title;
    }

    /*
        Add as many genres as necessary.
     */
    public void addGenres(String... genres){
        this.genres.addAll(Arrays.stream(genres).toList());
    }

    /*
        Remove as many genres as necessary.
    */
    public void removeGenres(String... genres){
        this.genres.removeAll(Arrays.stream(genres).toList());
    }

    /*
        Returns ArrayList of genres
     */
    public ArrayList<String> getGenres(){
        return this.genres;
    }

    /*
        Returns the image directory location of the thumbnail for the movie.
     */
    public String getThumbnailLocation(){
        return this.thumbnailLocation;
    }

    /*
        Sets the image directory of the thumbnail for the movie.
     */
    public void setThumbnailLocation(String thumbnailLocation){
        this.thumbnailLocation = thumbnailLocation;
    }
}
