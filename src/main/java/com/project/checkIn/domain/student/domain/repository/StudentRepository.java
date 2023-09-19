package com.project.checkIn.domain.student.domain.repository;

import com.project.checkIn.domain.student.presentation.Student;
import com.project.checkIn.domain.student.presentation.request.StdRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByStdId(String stdId);
    boolean existsByStdId(String stdId);
}
