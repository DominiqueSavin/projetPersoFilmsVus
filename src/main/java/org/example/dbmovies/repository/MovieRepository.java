package org.example.dbmovies.repository;

import org.example.dbmovies.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {


    private static List<Movie> movies = new ArrayList<Movie>();


    public void add(Movie movie) {
        movies.add(movie);
        System.out.println("The movie "+movie.getTitle()+" has been added.");
    }



}
