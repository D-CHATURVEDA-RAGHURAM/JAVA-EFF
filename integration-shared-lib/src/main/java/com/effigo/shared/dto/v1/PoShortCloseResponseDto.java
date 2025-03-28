package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonNaming(value = PropertyNamingStrategies.LowerCaseStrategy.class)
public class PoShortCloseResponseDto {
    private String poId;
    private boolean status;
    private String errMsg;
    private List<PoShortCloseItemDto> poItems;

}
