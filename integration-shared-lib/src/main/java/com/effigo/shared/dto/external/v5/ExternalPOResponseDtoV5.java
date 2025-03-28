package com.effigo.shared.dto.external.v5;

import java.util.List;

import com.effigo.shared.dto.v1.GrnErrorItemOutboundResponseDto;
import com.effigo.shared.dto.v1.GrnOutboundItemRespnseDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPOResponseDtoV5 {
	
	@JsonProperty("GUIID")
	String transactionId;
	
	@JsonProperty("XBELNR")
	String module;


	@JsonProperty("EBELN")
	private String poId;

	@JsonProperty("PO_DETAILS")
	private List<POOutboundResponseDto> poItems;
	
	@JsonProperty("MAT_DOC")
	private String erpRefNo;

	@JsonProperty("DOC_YEAR")
	private String year;
	
	@JsonProperty("ERROR_LOG")
	private List<POErrorItemOutboundResponseDto> poErrors ;

}
