package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AsnOutboundLineDetailDto {

	@JsonProperty("EBELP")
	private String index;

	@JsonProperty("LSMNG")
	private String qty; //todo

	@JsonProperty("LSMEH")
	private String uom;
}
