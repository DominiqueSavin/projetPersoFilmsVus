package org.example.dbmovies.service;

import org.example.dbmovies.entity.Movie;
import org.example.dbmovies.repository.GoLiveRepository;
import org.example.dbmovies.repository.MovieRepository;

public class MovieService {


    private GoLiveRepository movieRepository=new GoLiveRepository();


    public void registerMovie(Movie movie){
        movieRepository.add(movie);
        movieRepository.addMP4File(movie);
    }



}
