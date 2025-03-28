package com.effigo.shared.dto.external.v1;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@JsonNaming(value = PropertyNamingStrategies.LowerCaseStrategy.class)
@ToString
public class ExternalPoShortCloseRequestDto {
    private String poid;
    private String erpid;
    private String createdby;
    private String createddate;
    private String status;
    private String comments;

}
