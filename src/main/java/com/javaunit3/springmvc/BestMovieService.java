package com.javaunit3.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BestMovieService {
    private Movie movie;
    @Autowired
    public BestMovieService(Movie movie){
        this.movie = movie;
    }

    public Movie getBestMovie(){
        return movie;
    }

}
