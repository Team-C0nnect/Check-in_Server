package com.project.checkin.domain.check.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CheckCode {
    private Long id;
    private String code;
    private boolean valid;
}
