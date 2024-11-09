package com.jack.mbs.moviebookingsystem.api;

import com.jack.mbs.moviebookingsystem.api.datatypes.Movie;

public class AdminControls {
    /*
        For use with admin controls, remove a movie with a certain title.

        To add a movie, simply create a Movie object, and it will automatically be added.
     */
    public static void removeMovieWithTitle(String title){
        Movie.allMovies.removeIf(movie -> movie.getTitle().equals(title));
    }
}
