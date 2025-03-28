package com.effigo.shared.dto.external.v1;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@JsonNaming(value = PropertyNamingStrategies.LowerCaseStrategy.class)
@ToString
public class ExternalPoShortCloseItemDto {
    private String poItmId;
    private BigDecimal clsdqty;
}
