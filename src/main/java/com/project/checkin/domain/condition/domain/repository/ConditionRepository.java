package com.project.checkin.domain.condition.domain.repository;

import com.project.checkin.domain.condition.domain.ConditionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ConditionRepository extends JpaRepository<ConditionEntity,Long> {
    Optional<ConditionEntity> findById(Long id);
    boolean existsByUserId(String userId);
}
