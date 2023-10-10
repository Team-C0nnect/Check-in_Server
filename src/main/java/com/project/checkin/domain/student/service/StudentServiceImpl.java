package com.project.checkin.domain.student.service;

import com.project.checkin.domain.student.domain.repository.StudentRepository;
import com.project.checkin.domain.student.dto.Student;
import com.project.checkin.domain.student.dto.request.StudentRequest;
import com.project.checkin.domain.student.exception.StudentAlreadyExistsException;
import com.project.checkin.domain.student.exception.StudentNotFoundException;
import com.project.checkin.domain.student.mapper.StudentMapper;
import com.project.checkin.global.common.repository.UserSecurity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final UserSecurity userSecurity;
    private final StudentMapper studentMapper;
    @Override
    public Student findStudent(){
        return studentRepository
                .findById(userSecurity.getUser().getId())
                .map(studentMapper::toStudent)
                .orElseThrow(() -> StudentNotFoundException.EXCEPTION);
    }

    @Override
    public void register(StudentRequest studentRequest){
        if(studentRepository.findById(userSecurity.getUser().getId()).isPresent()){
            throw StudentAlreadyExistsException.EXCEPTION;
        }
        studentRepository.save(studentMapper.toCreate(userSecurity.getUser().getId(), studentRequest.getStdId()));
    }
}
