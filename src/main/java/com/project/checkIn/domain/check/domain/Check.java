package com.project.checkIn.domain.check.domain;

import com.project.checkIn.global.entity.BaseTime;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_check")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Check extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CheckId;

    @Column(unique = true)
    private String id;

    @Column(unique = true)
    private String date;

    @Builder
    public Check(String id, String date){
        this.id = id;
        this.date = date;
    }

}
