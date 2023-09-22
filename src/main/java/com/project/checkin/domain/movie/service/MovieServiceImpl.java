package com.project.checkin.domain.movie.service;

import com.project.checkin.domain.movie.domain.MovieEntity;
import com.project.checkin.domain.movie.domain.repository.MovieRepository;
import com.project.checkin.domain.movie.dto.request.MovieRequest;
import com.project.checkin.domain.student.exception.StudentAlreadyExistsException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    public void register(MovieRequest movieRequest, MovieEntity movie){
        if (movieRepository.existsByTitle(movieRequest.getTitle())){
            throw StudentAlreadyExistsException.EXCEPTION;
        }
        movieRepository.save(movie);
    }
}
