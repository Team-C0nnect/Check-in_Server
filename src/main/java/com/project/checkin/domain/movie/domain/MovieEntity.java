package com.project.checkin.domain.movie.domain;

import com.project.checkin.global.entity.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@Getter
@Table(name = "tb_movie")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MovieEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long userId;

    @Column(unique = true)
    private String title;

}
