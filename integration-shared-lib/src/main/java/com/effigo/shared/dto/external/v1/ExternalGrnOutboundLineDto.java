package com.effigo.shared.dto.external.v1;

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
public class ExternalGrnOutboundLineDto {
	
	@JsonProperty("ebelp")
	private String index;

	@JsonProperty("lsmng")
	private String rejectedQuantity;

	@JsonProperty("lsmeh")
	private String uom;

}
