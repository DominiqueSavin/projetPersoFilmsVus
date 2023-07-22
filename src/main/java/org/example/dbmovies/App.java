package org.example.dbmovies;

import org.example.dbmovies.controller.MovieController;
import org.example.dbmovies.entity.Movie;
import org.example.dbmovies.service.MovieService;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ){

        MovieController movieController = new MovieController();
        movieController.addUsingConsole();



    }
}
