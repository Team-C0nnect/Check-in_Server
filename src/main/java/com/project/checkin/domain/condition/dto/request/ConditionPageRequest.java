package com.project.checkin.domain.condition.dto.request;

import com.fasterxml.jackson.annotation.JsonValue;
import com.project.checkin.domain.condition.domain.enums.Feels;
import com.project.checkin.global.common.dto.request.PageRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ConditionPageRequest extends PageRequest {

    @JsonValue
    List<Feels> feels;
    public ConditionPageRequest(){
        feels = new ArrayList<>();
    }
}
