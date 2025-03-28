package com.effigo.shared.dto.external.v5;

import java.util.List;

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
public class POOutboundResponseDto {
	
	 @JsonProperty("EBELP")
	 private String poItemId;

	 @JsonProperty("EBELN")
	 private String poId;

	 @JsonProperty("REF_DOC_IT")
	 private String erpItmId;

	
}
