package com.project.checkin.domain.vote.service;

import com.project.checkin.domain.vote.domain.repository.MovieListRepository;
import com.project.checkin.domain.vote.dto.MovieList;
import com.project.checkin.domain.vote.exception.MovieListAddedException;
import com.project.checkin.domain.vote.exception.MovieListNotFoundException;
import com.project.checkin.domain.vote.mapper.MovieListMapper;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Getter
@RequiredArgsConstructor
@Service
public class MovieListServiceImpl implements MovieListService{

    private final MovieListRepository repository;
    private final MovieListMapper movieListMapper;

    @Override
    public void register(MovieList movieList) {

        if(repository.findById(movieList.getMovieListId()).isPresent()){
            throw MovieListAddedException.EXCEPTION;
        }
        repository.save(movieListMapper.toCreate(movieList));

    }

    @Override
    public void refuse(MovieList movieList) {

        if(repository.findById(movieList.getMovieListId()).isPresent()){
            repository.deleteById(movieList.getMovieListId());
        }
        throw MovieListNotFoundException.EXCEPTION;
    }

}
