package com.project.checkin.domain.condition.domain.repository.querydsl;

import com.project.checkin.domain.condition.domain.enums.Feels;
import com.project.checkin.domain.condition.dto.Condition;
import com.project.checkin.domain.condition.dto.request.ConditionPageRequest;
import com.querydsl.core.types.ConstructorExpression;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.project.checkin.domain.condition.domain.QConditionEntity.conditionEntity;

@Repository
@RequiredArgsConstructor
public class ConditionQueryRepositoryImpl implements ConditionQueryRepository {
    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<Condition> findByFeels(ConditionPageRequest request) {
        return jpaQueryFactory
                .select(conditionProjection())
                .from(conditionEntity)
                .where(
                        inFeels(request.getFeels())
                )
                .offset((request.getPage() - 1) * request.getSize())
                .limit(request.getSize())
                .orderBy(conditionEntity.userId.desc())
                .fetch();
    }

    private BooleanExpression inFeels(List<Feels> feels){
        if(feels.isEmpty()){
            return null;
        }
        return conditionEntity.todayFeels.in(feels);
    }

    private ConstructorExpression<Condition> conditionProjection() {
        return Projections.constructor(Condition.class,
                conditionEntity.userId,
                conditionEntity.userId,
                conditionEntity.todayFeels,
                conditionEntity.endDateTime
        );
    }

}
