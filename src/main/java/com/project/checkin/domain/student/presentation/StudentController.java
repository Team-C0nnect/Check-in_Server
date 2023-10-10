package com.project.checkin.domain.student.presentation;

import com.project.checkin.domain.student.dto.Student;
import com.project.checkin.domain.student.dto.request.StudentRequest;
import com.project.checkin.domain.student.service.StudentService;
import com.project.checkin.domain.student.service.StudentServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Tag(name = "학생", description = "학생")
@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    @Operation(summary = "학생 조회", description = "")
    @GetMapping("")
    public ResponseEntity<Student> find() {
        return ResponseEntity.ok(studentService.findStudent());
    }

    @Operation(summary = "학생 등록", description = "")
    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void register(
            @Validated @RequestBody StudentRequest studentRequest
    ) {
        studentService.register(studentRequest);
    }
}
