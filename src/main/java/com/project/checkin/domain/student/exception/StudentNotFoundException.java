package com.project.checkin.domain.student.exception;

import com.project.checkin.domain.student.exception.error.StudentError;
import com.project.checkin.global.exception.BusinessException;

public class StudentNotFoundException extends BusinessException {

    public static final StudentNotFoundException EXCEPTION = new StudentNotFoundException();

    private StudentNotFoundException(){
        super(StudentError.STUDENT_NOT_FOUND);
    }
}
