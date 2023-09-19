package com.project.checkIn.domain.student.service;

import com.project.checkIn.domain.student.facade.StdFacade;
import com.project.checkIn.domain.student.presentation.Student;
import com.project.checkIn.domain.student.presentation.request.StdRequest;
import com.project.checkIn.domain.student.presentation.responce.StdResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StdFacade stdFacade;

    @Override
    public StdResponse findStudent(StdRequest stdRequest) {
        Student student = stdFacade.findStdId(stdRequest.getStdId());

        return StdResponse.of(student);
    }

    @Override
    public void saveStudent(StdRequest stdRequest){
        stdFacade.existsStdById(stdRequest.getStdId());
        stdFacade.save(stdRequest.toEntity());
    }
}
