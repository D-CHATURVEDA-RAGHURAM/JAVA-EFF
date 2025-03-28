package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@JsonNaming(value = PropertyNamingStrategies.LowerCaseStrategy.class)
public class PoShortCloseItemDto {
    private String poItmId;
    private BigDecimal clsdqty;
}
