package com.effigo.shared.dto.external.v2;

import java.util.List;


import com.effigo.shared.dto.external.v1.ExternalGrnOutboundLineDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalGrnRequestDto {
	
	@JsonProperty("goodsmvtheader")
	ExternalGrnHeaderDto externalGrnHeaderDto;
	
	@JsonProperty("goodsmvtitem")
	List<ExternalGrnItemDto> externalGrnItemDto;
	
	@JsonProperty("linedetails")
	List<ExternalGrnOutboundLineDto> externalGrnOutboundLineDtos;


}
