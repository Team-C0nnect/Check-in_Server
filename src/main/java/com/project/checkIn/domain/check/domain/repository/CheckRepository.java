package com.project.checkIn.domain.check.domain.repository;

import com.project.checkIn.domain.check.domain.Check;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CheckRepository extends JpaRepository<Check,Long> {
    Optional<Check> findByName(String name);
}
