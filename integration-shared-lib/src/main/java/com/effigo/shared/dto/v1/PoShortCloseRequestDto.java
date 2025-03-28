package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonNaming(value = PropertyNamingStrategies.LowerCaseStrategy.class)
public class PoShortCloseRequestDto {
    private String poid;
    private String erpid;
    private String createdby;
    private String createddate;
    private String status;
    private String comments;

}
