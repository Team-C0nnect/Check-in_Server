package com.project.checkIn.domain.student.presentation;

import com.project.checkIn.domain.student.presentation.request.StdRequest;
import com.project.checkIn.domain.student.presentation.responce.StdResponse;
import com.project.checkIn.domain.student.service.StudentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentServiceImpl studentService;

    @GetMapping("/info")
    public StdResponse findStdInfo(
            @RequestBody StdRequest stdRequest
    ){
        return studentService.findStudent(stdRequest);
    }
}
