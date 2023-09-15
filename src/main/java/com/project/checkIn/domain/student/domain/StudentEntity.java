package com.project.checkIn.domain.student.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_student")
public class StudentEntity {
    @Id
    private Long id;

    @Column(unique = true, nullable = false)
    private String stdId;

}
