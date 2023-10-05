package com.project.checkin.domain.movie.presentation;

import com.project.checkin.domain.movie.domain.MovieEntity;
import com.project.checkin.domain.movie.dto.request.MovieRequest;
import com.project.checkin.domain.movie.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/movie")
public class MovieController {

    private final MovieService movieService;

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void registerMovie(MovieRequest request, MovieEntity movie){
        movieService.register(request, movie);
    }

    @GetMapping("")
    public void findMovie(){

    }

}
