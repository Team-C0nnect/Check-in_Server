package com.project.checkin.domain.condition.domain.repository;

import com.project.checkin.domain.condition.domain.ConditionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.Optional;

public interface ConditionRepository extends JpaRepository<ConditionEntity,Long> {
    Optional<ConditionEntity> findById(Long id);
    Optional<ConditionEntity> findByUserIdAndEndDateTime(Long userId, LocalDateTime endDateTime);
}
