package com.project.checkin.domain.sleepover.domain;

import com.project.checkin.domain.sleepover.domain.enums.SleepoverStatus;
import com.project.checkin.global.entity.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.http.HttpStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;

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
    private Long userId;

    @Column
    private LocalDateTime startDateTime;

    @Column
    private LocalDateTime endDateTime;

    @Column
    private String reason;

    @Column
    private SleepoverStatus approval;
}
