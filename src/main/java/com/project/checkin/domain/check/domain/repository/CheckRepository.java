package com.project.checkin.domain.check.domain.repository;

import com.project.checkin.domain.check.domain.CheckEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckRepository extends JpaRepository<CheckEntity, Long> {

}
