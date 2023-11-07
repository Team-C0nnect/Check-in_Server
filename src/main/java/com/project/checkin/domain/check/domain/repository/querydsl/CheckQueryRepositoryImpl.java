package com.project.checkin.domain.check.domain.repository.querydsl;

import com.project.checkin.domain.check.dto.Check;
import com.project.checkin.global.common.dto.request.PageRequest;
import com.querydsl.core.types.ConstructorExpression;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.project.checkin.domain.check.domain.QCheckEntity.checkEntity;

@Repository
@RequiredArgsConstructor
public class CheckQueryRepositoryImpl implements CheckQueryRepository{

    private final JPAQueryFactory queryFactory;

    @Override
    public List<Check> findCheck(PageRequest pageRequest) {
        return queryFactory
                .select(checkProjection())
                .from(checkEntity)
                .offset((pageRequest.getPage() - 1) * pageRequest.getSize())
                .limit(pageRequest.getSize())
                .orderBy(checkEntity.id.desc())
                .fetch();
    }

    private ConstructorExpression<Check> checkProjection() {
        return Projections.constructor(
                Check.class,
                checkEntity.id,
                checkEntity.userId,
                checkEntity.checkDate
        );
    }
}