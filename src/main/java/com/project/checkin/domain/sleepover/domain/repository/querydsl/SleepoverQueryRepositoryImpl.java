package com.project.checkin.domain.sleepover.domain.repository.querydsl;

import com.project.checkin.domain.sleepover.domain.SleepoverEntity;
import com.project.checkin.domain.sleepover.domain.enums.SleepoverStatus;
import com.project.checkin.domain.sleepover.dto.Sleepover;
import com.querydsl.core.QueryResults;
import com.querydsl.core.types.ConstructorExpression;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.project.checkin.domain.sleepover.domain.QSleepoverEntity.sleepoverEntity;

@Repository
@RequiredArgsConstructor
public class SleepoverQueryRepositoryImpl implements SleepoverQueryRepository{

    private final JPAQueryFactory queryFactory;

    @Override
    public Page<SleepoverEntity> findAcceptedStudents(Pageable pageable, SleepoverStatus sleepoverStatus){
        QueryResults<SleepoverEntity> results = queryFactory
                .select(sleepoverEntity)
                .from(sleepoverEntity)
                .where(
                        eqApproval(sleepoverStatus)
                )
                .orderBy()
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetchResults();

        List<SleepoverEntity> content = results.getResults();
        long total = results.getTotal();
        return new PageImpl<>(content,pageable,total);
    }


//    private ConstructorExpression<Sleepover> sleepoverProjection() {
//        return Projections.constructor(
//                Sleepover.class,
//                sleepoverEntity.id,
//                sleepoverEntity.userId,
//                sleepoverEntity.startDate,
//                sleepoverEntity.endDate,
//                sleepoverEntity.createdDateTime,
//                sleepoverEntity.modifiedDateTime,
//                sleepoverEntity.approval
//        );
//    }

    private BooleanExpression eqApproval(SleepoverStatus sleepoverStatus) {
        return sleepoverEntity.approval.eq(sleepoverStatus);
    }
}
