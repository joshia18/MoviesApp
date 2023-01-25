package com.moviestore.movies.controller;

import com.moviestore.movies.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.moviestore.movies.service.MovieService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        return new ResponseEntity<>(movieService.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Movie> getSingleMovie(@PathVariable String imdbId) {
        return new ResponseEntity<>(movieService.singleMovie(imdbId), HttpStatus.OK);
    }
}
