package com.ocemtechzone.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private  MovieRepository movieRepository;


    @GetMapping
    public List<Movie> home() {
        return  movieRepository.findAll();
    }
}
