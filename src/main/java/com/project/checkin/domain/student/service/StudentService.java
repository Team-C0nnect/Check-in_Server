package com.project.checkin.domain.student.service;

import com.project.checkin.domain.student.dto.Student;
import com.project.checkin.domain.student.dto.request.StudentRequest;

public interface StudentService {
    Student find();
    void register(StudentRequest studentRequest);
}
