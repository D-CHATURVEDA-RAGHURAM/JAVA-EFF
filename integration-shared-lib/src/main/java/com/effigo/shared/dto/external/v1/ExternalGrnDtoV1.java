package com.effigo.shared.dto.external.v1;

import com.effigo.shared.dto.v1.AsnErrorOutboundResponseDto;
import com.effigo.shared.dto.v1.AsnItemOutboundResponseDto;
import com.effigo.shared.dto.v1.GrnErrorItemOutboundResponseDto;
import com.effigo.shared.dto.v1.GrnOutboundItemRespnseDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@JsonNaming(value = PropertyNamingStrategies.LowerCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalGrnDtoV1 {
	
	@JsonProperty("GUIID")
	String transactionId;
	
	@JsonProperty("XBELNR")
	String module;

	@JsonProperty("EBELN")
	private String poId;

	@JsonProperty("PO_DETAILS")
	private List<GrnOutboundItemRespnseDto> grnItems;

	@JsonProperty("MAT_DOC")
	private String erpRefNo;

	@JsonProperty("DOC_YEAR")
	private String year;

	@JsonProperty("ERROR_LOG")
	private List<GrnErrorItemOutboundResponseDto> grnErrors ;
}
