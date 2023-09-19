package com.project.checkIn.domain.student.facade;

import com.project.checkIn.domain.student.domain.StudentEntity;
import com.project.checkIn.domain.student.domain.repository.StudentRepository;
import com.project.checkIn.domain.student.exception.StdNotFoundException;
import com.project.checkIn.domain.student.presentation.Student;
import com.project.checkIn.domain.user.exception.UserAlreadyExistsException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class StdFacade {

    private final StudentRepository studentRepository;

    @Transactional(readOnly = true)
    public Student findStdId(String stdId) {
        return studentRepository.findByStdId(stdId)
                .orElseThrow(() -> StdNotFoundException.EXCEPTION);
    }

    @Transactional(readOnly = true)
    public void existsStdById(String stdId) {
        if(studentRepository.existsByStdId(stdId))
            throw UserAlreadyExistsException.EXCEPTION;
    }

    @Transactional
    public void save(StudentEntity studentEntity){
        studentRepository.save(studentEntity);
    }
}
