package com.project.checkin.global.common.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Pageable;

@Getter
@Setter
public class PageRequest {

    @Schema(description = "페이지 번호")
    private int page;

    @Schema(description = "페이지 사이즈")
    private int size;

    public PageRequest() {
        page = 1;
        size = 10;
    }

    public Pageable getPageable(){
        return org.springframework.data.domain.PageRequest.of(page-1, size);
    }


}
