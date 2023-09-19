package com.project.checkIn.domain.student.service;


import com.project.checkIn.domain.student.presentation.request.StdRequest;
import com.project.checkIn.domain.student.presentation.responce.StdResponse;

public interface StudentService {

    StdResponse findStudent(StdRequest stdId);

    void saveStudent(StdRequest stdRequest);
}
