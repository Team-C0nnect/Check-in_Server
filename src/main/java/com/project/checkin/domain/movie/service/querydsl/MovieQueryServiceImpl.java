package com.project.checkin.domain.movie.service.querydsl;

import com.project.checkin.domain.movie.domain.repository.querydsl.MovieQueryRepository;
import com.project.checkin.domain.movie.dto.Movie;
import com.project.checkin.global.common.dto.request.PageRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@Service
@RequiredArgsConstructor
public class MovieQueryServiceImpl implements MovieQueryService {

    private final MovieQueryRepository movieQueryRepository;
    @Override
    public List<Movie> findMovies(PageRequest pageRequest) {
        return movieQueryRepository.findMovies(pageRequest);
    }
}
