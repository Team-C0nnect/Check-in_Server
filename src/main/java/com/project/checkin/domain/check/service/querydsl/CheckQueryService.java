package com.project.checkin.domain.check.service.querydsl;

import com.project.checkin.domain.check.dto.Check;
import com.project.checkin.global.common.dto.request.PageRequest;

import java.util.List;

public interface CheckQueryService {

    List<Check> findCheck(PageRequest pageRequest);

}
