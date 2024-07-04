package com.zagado.sysarch.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zagado.sysarch.api.model.Movie;
import com.zagado.sysarch.repository.MovieRepository;

@RestController
@RequestMapping("/api/movie")
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/getAllMovie")
    public List<Movie> getAllMovie(){
        return movieRepository.findAll();
    }

    @GetMapping("/getMovieByTitle")
    public List<MovieController> getMovieByTitle(@RequestParam String title){
        return movieRepository.findByTitle(title);
    }


    @GetMapping("/getMovieByUrl")
    public List<Movie> getMovieByUrl(@RequestParam String url){
        return movieRepository.findByUrl(url);
    }

    @PostMapping("/addMovie")
    public String addMovie(@RequestBody Movie movie){
        movieRepository.save(movie);
        return "Movie Successfully added.";
    }
}
