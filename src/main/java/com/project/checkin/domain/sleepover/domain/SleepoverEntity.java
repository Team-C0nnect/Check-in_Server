package com.project.checkin.domain.sleepover.domain;

import com.project.checkin.domain.sleepover.domain.enums.SleepoverStatus;
import com.project.checkin.global.entity.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.http.HttpStatus;

import java.time.LocalDate;

@Entity
@Table(name = "tb_sleepover")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@SuperBuilder
public class SleepoverEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String userId;

    @Column
    private LocalDate startDate;

    @Column
    private LocalDate endDate;

    @Column
    private String reason;

    @Column
    private SleepoverStatus approval;
}
