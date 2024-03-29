package com.project.checkin.domain.student.domain.repository;

import com.project.checkin.domain.student.domain.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
    Optional<StudentEntity> findByStdId(String stdId);

}
