package com.project.checkin.domain.movie.service;

import com.project.checkin.domain.movie.domain.repository.MovieRepository;
import com.project.checkin.domain.movie.dto.Movie;
import com.project.checkin.domain.movie.exception.MovieAlreadyExistsException;
import com.project.checkin.domain.movie.mapper.MovieMapper;
import com.project.checkin.global.common.repository.UserSecurity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = Exception.class)
@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;
    private final MovieMapper movieMapper;
    private final UserSecurity userSecurity;

    @Override
    public void register(Movie movie) {
        if (movieRepository.findByTitle(movie.getTitle()).isPresent()) {
            throw MovieAlreadyExistsException.EXCEPTION;
        }
        movieRepository.save(movieMapper.createMovieEntity(userSecurity.getUser().getId(), movie));
    }

}
