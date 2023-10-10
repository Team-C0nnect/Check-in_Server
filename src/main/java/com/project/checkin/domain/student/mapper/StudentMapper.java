package com.project.checkin.domain.student.mapper;

import com.project.checkin.domain.student.domain.StudentEntity;
import com.project.checkin.domain.student.dto.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    public Student toStudent(StudentEntity entity){
        return Student.builder()
                .id(entity.getId())
                .stdId(entity.getStdId())
                .build();
    }

    public StudentEntity toCreate(Long id, String stdId){
        return StudentEntity.builder()
                .id(id)
                .stdId(stdId)
                .build();
    }
}
