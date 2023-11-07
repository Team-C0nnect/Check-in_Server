package com.project.checkin.domain.movie.domain.repository.querydsl;

import com.project.checkin.domain.movie.dto.Movie;
import com.project.checkin.global.common.dto.request.PageRequest;
import com.querydsl.core.types.ConstructorExpression;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.project.checkin.domain.movie.domain.QMovieEntity.movieEntity;

@Repository
@RequiredArgsConstructor
public class MovieQueryRepositoryImpl implements MovieQueryRepository {

    private final JPAQueryFactory queryFactory;

    @Override
    public List<Movie> findMovies(PageRequest pageRequest) {

        return queryFactory
                .select(movieProjection())
                .from(movieEntity)
                .offset((pageRequest.getPage() - 1) * pageRequest.getSize())
                .limit(pageRequest.getSize())
                .orderBy(movieEntity.id.desc())
                .fetch();
    }

    private ConstructorExpression<Movie> movieProjection() {
        return Projections.constructor(
                Movie.class,
                movieEntity.id,
                movieEntity.userId,
                movieEntity.title,
                movieEntity.createdDateTime
        );
    }

}
