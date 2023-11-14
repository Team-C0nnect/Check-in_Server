package com.project.checkin.domain.leave.domain.repository.querydsl;

import com.project.checkin.domain.leave.dto.response.LeaveResponse;
import com.project.checkin.global.common.dto.request.PageRequest;
import com.querydsl.core.types.ConstructorExpression;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.support.PageableExecutionUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.project.checkin.domain.leave.domain.QLeaveEntity.leaveEntity;

@Repository
@RequiredArgsConstructor
public class LeaveQueryRepositoryImpl implements LeaveQueryRepository{

    private final JPAQueryFactory queryFactory;

    @Override
    public List<LeaveResponse> findLeaves(PageRequest request) {
        return queryFactory
                .select(leaveProjection())
                .from(leaveEntity)
                .orderBy(leaveEntity.userId.desc())
                .offset(request.getPage()-1 * request.getSize())
                .limit(request.getSize())
                .fetch();
    }

    private ConstructorExpression<LeaveResponse> leaveProjection() {
        return Projections.constructor(LeaveResponse.class, leaveEntity.userId, leaveEntity.leaveDate);
    }
}
