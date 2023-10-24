package com.project.checkin.domain.sleepover.domain.repository;

import com.project.checkin.domain.sleepover.domain.SleepoverEntity;
import com.project.checkin.domain.sleepover.dto.Sleepover;
import com.project.checkin.domain.sleepover.dto.response.SleepoverResponse;
import com.project.checkin.domain.user.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SleepoverRepository extends JpaRepository<SleepoverEntity,Long> {
    Optional<SleepoverEntity> findByUserId(UserEntity userId);
    boolean existsByUserId(String userId);
}
