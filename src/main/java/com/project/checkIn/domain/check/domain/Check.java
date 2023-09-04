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
    private Long id;

    @Column(unique = true)
    private String user_id;

    @Column(unique = true)
    private String date;

    @Builder
    public Check(String user_id, String date){
        this.user_id = user_id;
        this.date = date;
    }

}
