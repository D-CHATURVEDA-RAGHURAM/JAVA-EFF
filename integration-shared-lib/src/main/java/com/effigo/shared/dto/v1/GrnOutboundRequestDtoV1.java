package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(value = PropertyNamingStrategies.LowerCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GrnOutboundRequestDtoV1 {

	@JsonProperty("GOODSMVT_CODE")
	private GrnOutboundCodeDto grnOutboundCodeDto;


	@JsonProperty("GOODSMVT_HEADER")
	private GrnOutboundHeaderDto grnOutboundHeaderDto;

	@JsonProperty("INV_VALUE")
	public String supplierInvoiceValue;

	@JsonProperty("MAT_YEAR")
	public String matYear;


	@JsonProperty("GOODSMVT_ITEM")
	List<GrnOutboundItemsDto> items;

	@JsonProperty("LINE_DETAILS")
	List<GrnOutboundLineDetailDto> grnOutboundLineDetailDtos;
}
