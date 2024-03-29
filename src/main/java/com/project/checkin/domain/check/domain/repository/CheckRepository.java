package com.project.checkin.domain.check.domain.repository;

import com.project.checkin.domain.check.domain.CheckEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface CheckRepository extends JpaRepository<CheckEntity, Long> {
    Optional<CheckEntity> findByUserIdAndCheckDate(Long userId, LocalDate date);
// where user_id = "Y" AND date =
    boolean existsById(Long id);

}
