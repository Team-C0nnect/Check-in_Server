package com.project.checkin.domain.movie.presentation;

import com.project.checkin.domain.movie.domain.MovieEntity;
import com.project.checkin.domain.movie.dto.request.MovieRequest;
import com.project.checkin.domain.movie.dto.response.MovieResponse;
import com.project.checkin.domain.movie.service.MovieService;
import io.swagger.v3.oas.annotations.Operation;
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

    @Operation(summary = "영화 등록", description = "등록")
    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void registerMovie(MovieRequest request, MovieEntity movie){
        movieService.registerMovie(request, movie);
    }

    @Operation(summary = "영화 조회", description = "조회")
    @GetMapping("")
    public MovieResponse findMovie(MovieRequest request, MovieEntity movie){
        return movieService.findMovie(request,movie);
    }

}
