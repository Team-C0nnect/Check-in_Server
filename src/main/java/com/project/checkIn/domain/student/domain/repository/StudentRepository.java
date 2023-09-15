package com.project.checkIn.domain.student.domain.repository;

import com.project.checkIn.domain.student.domain.StudentEntity;
import com.project.checkIn.domain.student.presentation.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByStdId(String stdId);
}
