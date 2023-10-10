package com.project.checkin.domain.movie.service;

import com.project.checkin.domain.movie.domain.MovieEntity;
import com.project.checkin.domain.movie.domain.repository.MovieRepository;
import com.project.checkin.domain.movie.dto.request.MovieRequest;
import com.project.checkin.domain.movie.dto.response.MovieResponse;
import com.project.checkin.domain.movie.exception.MovieAlreadyExistsException;
import com.project.checkin.domain.movie.exception.MovieNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    @Override
    public void registerMovie(MovieRequest movieRequest, MovieEntity movie){
        if (movieRepository.existsByTitle(movieRequest.getTitle())){
            throw MovieAlreadyExistsException.EXCEPTION;
        }
        movieRepository.save(movie);
    }

    @Override
    public MovieResponse findMovie(MovieRequest movieRequest, MovieEntity movie){
        if (movieRepository.existsByTitle(movieRequest.getTitle())){
            throw MovieNotFoundException.EXCEPTION;
        }
        return MovieResponse.of(movie);
    }
}
