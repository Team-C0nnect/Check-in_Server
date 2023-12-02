package com.project.checkin.domain.vote.domain.repository;

import com.project.checkin.domain.vote.domain.MovieListId;
import com.project.checkin.domain.vote.domain.VoteStudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteStudentRepository extends JpaRepository<VoteStudentEntity, MovieListId> {

}
