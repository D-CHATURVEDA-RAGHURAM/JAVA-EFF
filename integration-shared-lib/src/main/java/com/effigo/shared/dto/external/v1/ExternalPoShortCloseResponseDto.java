package com.effigo.shared.dto.external.v1;

import com.effigo.shared.dto.v1.PoShortCloseItemDto;
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
public class ExternalPoShortCloseResponseDto {
    private String poId;
    private boolean status;
    private String errMsg;
    private List<ExternalPoShortCloseItemDto> pocloseditm;

}
