package com.effigo.shared.dto.v2;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(value = PropertyNamingStrategies.LowerCaseStrategy.class)
public class PriceDetailsDtoV2 {
	@JsonProperty("poitmid")
	private String poItemId;
	private String taxCode;
	private BigDecimal price;
	private Double percorval;
	private Byte priceType;
}
