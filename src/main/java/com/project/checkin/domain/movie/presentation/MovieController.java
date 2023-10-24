package com.project.checkin.domain.movie.presentation;

import com.project.checkin.domain.movie.dto.Movie;
import com.project.checkin.domain.movie.dto.request.MovieRequest;
import com.project.checkin.domain.movie.service.MovieService;
import com.project.checkin.domain.movie.service.querydsl.MovieQueryService;
import com.project.checkin.global.common.dto.request.PageRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "영화", description = "영화")
@SecurityRequirement(name = "BearerAuthentication")
@RestController
@RequiredArgsConstructor
@RequestMapping("/movie")
public class MovieController {

    private final MovieService movieService;
    private final MovieQueryService movieQueryService;

    @Operation(summary = "영화 등록", description = "영화를 등록합니다")
    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void registerMovie(@Validated @RequestBody MovieRequest request) {
        movieService.register(request.toMovie());
    }

    @Operation(summary = "영화 조회", description = "영화를 조회합니다")
    @GetMapping("/list")
    public ResponseEntity<List<Movie>> findMovie(PageRequest pageRequest) {
        return ResponseEntity.status(HttpStatus.OK).body(movieQueryService.findMovies(pageRequest));
    }

}
