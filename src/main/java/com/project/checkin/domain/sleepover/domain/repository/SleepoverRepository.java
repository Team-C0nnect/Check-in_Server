package com.project.checkin.domain.sleepover.domain.repository;

import com.project.checkin.domain.sleepover.domain.SleepoverEntity;
import com.project.checkin.domain.user.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SleepoverRepository extends JpaRepository<SleepoverEntity,Long> {
  
    Optional<SleepoverEntity> findById(Long userId);

    boolean existsByUserId(Long userId);
}
