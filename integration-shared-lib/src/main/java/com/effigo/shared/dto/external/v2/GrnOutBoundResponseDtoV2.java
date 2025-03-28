package com.effigo.shared.dto.external.v2;

import java.util.List;

import com.effigo.shared.dto.v1.GrnErrorItemOutboundResponseDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class GrnOutBoundResponseDtoV2 {
	
	@JsonProperty("externalGrnResponseDtoV2")
	ExternalGrnResponseDtoV2 externalGrnResponseDtoV2;
	
	@JsonProperty("exMatdocumentyear")
	private String exMatdocumentyear;
	
	@JsonProperty("exMaterialdocument")
	private String exMaterialdocument;
	
	@JsonProperty("externalGrnOutBoundResponseDtoV3")
	ExternalGrnOutBoundResponseDtoV2 externalGrnOutBoundResponseDtoV3;
	
	@JsonProperty("error")
	private List<GrnErrorItemOutboundResponseDto> grnErrors ;
	

}
