package com.moviestore.movies.service;

import com.moviestore.movies.entity.Movie;
import com.moviestore.movies.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    public Movie singleMovie(String id) {
        return movieRepository.findByImdbId(id).get();
    }
}
