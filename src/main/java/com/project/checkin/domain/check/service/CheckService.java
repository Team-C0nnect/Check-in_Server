package com.project.checkin.domain.check.service;

import com.project.checkin.domain.check.dto.request.CodeRequest;
import org.springframework.http.ResponseEntity;

public interface CheckService {
    void attendance(CodeRequest codeRequest);

    ResponseEntity<Void> attendanceCheck();
}
