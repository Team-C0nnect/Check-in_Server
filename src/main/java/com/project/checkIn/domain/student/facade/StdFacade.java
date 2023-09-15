package com.project.checkIn.domain.student.facade;

import com.project.checkIn.domain.student.domain.repository.StudentRepository;
import com.project.checkIn.domain.student.exception.StdNotFoundException;
import com.project.checkIn.domain.student.presentation.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class StdFacade {
    @Transactional(readOnly = true)
    public Student findStdId(String stdId) {
        return StudentRepository.findByStdId(stdId)
                .orElseThrow(() -> StdNotFoundException.EXCEPTION);
    }
}
