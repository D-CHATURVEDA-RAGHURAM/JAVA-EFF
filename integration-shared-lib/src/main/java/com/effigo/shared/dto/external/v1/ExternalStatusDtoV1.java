package com.effigo.shared.dto.external.v1;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@JsonNaming(value = PropertyNamingStrategies.LowerCaseStrategy.class)
@ToString
public class ExternalStatusDtoV1 {
    private String transactionId;
    private String module;
    private String effigoRefNo;
    private String erpRefno;
    private String responseCode;
    private String message;
    private List<ExternalItemStatusDto> data;
}
