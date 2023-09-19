package com.project.checkin.domain.student.exception;

import com.project.checkin.domain.student.exception.error.StudentError;
import com.project.checkin.global.exception.BusinessException;

public class StudentAlreadyExistsException extends BusinessException {

    public static final StudentAlreadyExistsException EXCEPTION = new StudentAlreadyExistsException();

    private StudentAlreadyExistsException(){
        super(StudentError.STUDENT_CONFLICT);
    }
}
