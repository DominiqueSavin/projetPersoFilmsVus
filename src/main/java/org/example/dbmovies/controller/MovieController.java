package org.example.dbmovies.controller;

import org.example.dbmovies.entity.Movie;
import org.example.dbmovies.service.MovieService;

import java.util.Scanner;

public class MovieController {

    private MovieService movieService = new MovieService();


    public void addUsingConsole(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Titre du film à ajouter ? ");
        String newTitle = sc.nextLine();

        Movie newMovie = new Movie(newTitle);

        MovieService movieService = new MovieService();

        movieService.registerMovie(newMovie);

    }



}
