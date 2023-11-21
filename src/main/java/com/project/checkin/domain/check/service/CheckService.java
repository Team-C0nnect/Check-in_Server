package com.project.checkin.domain.check.service;

import com.project.checkin.domain.check.dto.request.CodeRequest;

public interface CheckService {
    void attendance(CodeRequest codeRequest);
}
