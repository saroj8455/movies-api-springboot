package com.ocemtechzone.movies;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    private  MovieRepository movieRepository;

    public List<Movie> getMovies() {
        LOG.info("Return all movies");
        return  movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
