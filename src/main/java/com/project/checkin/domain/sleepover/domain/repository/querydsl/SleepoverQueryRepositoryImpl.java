package com.project.checkin.domain.sleepover.domain.repository.querydsl;

import com.project.checkin.domain.sleepover.domain.enums.SleepoverStatus;
import com.project.checkin.domain.sleepover.dto.response.SleepoverResponse;
import com.project.checkin.global.common.dto.request.PageRequest;
import com.querydsl.core.types.ConstructorExpression;
import com.querydsl.core.types.Projections;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.support.PageableExecutionUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.project.checkin.domain.sleepover.domain.QSleepoverEntity.sleepoverEntity;

@Repository
@RequiredArgsConstructor
public class SleepoverQueryRepositoryImpl implements SleepoverQueryRepository{

    private final JPAQueryFactory queryFactory;

    @Override
    public List<SleepoverResponse> findAcceptedStudents(PageRequest request, SleepoverStatus sleepoverStatus){
        return queryFactory
                .select(sleepoverProjection())
                .from(sleepoverEntity)
                .where(
                        eqApproval(sleepoverStatus)
                )
                .orderBy(sleepoverEntity.id.desc())
                .offset((request.getPage() - 1) * request.getSize())
                .limit(request.getSize())
                .fetch();
    }


    private ConstructorExpression<SleepoverResponse> sleepoverProjection() {
        return Projections.constructor(SleepoverResponse.class, sleepoverEntity.id, sleepoverEntity.approval);
    }

    private BooleanExpression eqApproval(SleepoverStatus sleepoverStatus) {
        return sleepoverEntity.approval.eq(sleepoverStatus);
    }
}
