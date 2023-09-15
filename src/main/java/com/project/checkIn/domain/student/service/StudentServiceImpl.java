package com.project.checkIn.domain.student.service;

import com.project.checkIn.domain.student.facade.StdFacade;
import com.project.checkIn.domain.student.presentation.Student;
import com.project.checkIn.domain.student.presentation.responce.StdResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StdFacade stdFacade;

    @Override
    public void findStudent(String stdId) {
        Student student = stdFacade.findStdId(stdId);
    }
}
