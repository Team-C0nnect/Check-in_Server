package com.project.checkin.domain.leave.domain.repository;

import com.project.checkin.domain.leave.domain.LeaveEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveRepository extends JpaRepository<LeaveEntity, Long> {

}
