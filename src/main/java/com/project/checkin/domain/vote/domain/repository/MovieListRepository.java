package com.project.checkin.domain.vote.domain.repository;

import com.project.checkin.domain.vote.domain.MovieListEntity;
import com.project.checkin.domain.vote.domain.MovieListId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieListRepository extends JpaRepository<MovieListEntity, MovieListId> {
}
