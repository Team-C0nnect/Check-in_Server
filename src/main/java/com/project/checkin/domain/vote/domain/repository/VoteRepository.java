package com.project.checkin.domain.vote.domain.repository;

import com.project.checkin.domain.vote.domain.VoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<VoteEntity, Long> {

}
