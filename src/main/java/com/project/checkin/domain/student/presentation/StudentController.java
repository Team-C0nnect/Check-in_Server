package com.project.checkin.domain.student.presentation;

import com.project.checkin.domain.student.dto.Student;
import com.project.checkin.domain.student.dto.request.StudentEditRequest;
import com.project.checkin.domain.student.dto.request.StudentRequest;
import com.project.checkin.domain.student.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "학생", description = "학생")
@SecurityRequirement(name = "BearerAuthentication")
@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    @Operation(summary = "학생 조회", description = "학번을 조회합니다")
    @GetMapping("")
    public ResponseEntity<Student> find() {
        return ResponseEntity.ok(studentService.findStudent());
    }

    @Operation(summary = "학생 등록", description = "학번을 등록합니다")
    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void register(
            @Validated @RequestBody StudentRequest studentRequest
    ) {
        studentService.register(studentRequest);
    }

    @Operation(summary = "학번 수정", description = "학번을 수정합니다")
    @PutMapping("")
    @ResponseStatus(HttpStatus.OK)
    public void studentEdit(@Validated @RequestBody StudentEditRequest studentEditRequest){
        studentService.studentEdit(studentEditRequest);
    }

    @DeleteMapping("")
    public void studentDelete(){
        studentService.studentDelete();
    }

}
