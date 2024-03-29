package com.project.checkin.domain.sleepover.domain;

import com.project.checkin.domain.sleepover.domain.enums.SleepoverStatus;
import com.project.checkin.global.entity.BaseTimeEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_sleepover")
@Getter
//@Setter
//@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@SuperBuilder
public class SleepoverEntity extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long userId;

    @Column(nullable=false)
    private LocalDateTime startDateTime;

    @Column(nullable=false)
    private LocalDateTime endDateTime;

    @Column(nullable = false)
    private String reason;

    @Column
    private SleepoverStatus approval;
}
