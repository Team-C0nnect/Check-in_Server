package com.project.checkin.domain.leave.domain.repository;

import com.project.checkin.domain.leave.domain.LeaveEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface LeaveRepository extends JpaRepository<LeaveEntity, Long> {
    Optional<LeaveEntity> findByLeaveDate(LocalDate leaveDate);
}
