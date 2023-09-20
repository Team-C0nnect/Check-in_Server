package com.project.checkin.domain.movie.domain.repository;

import com.project.checkin.domain.movie.domain.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieEntity, Long> {
}
