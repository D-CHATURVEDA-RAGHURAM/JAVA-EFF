package com.effigo.shared.dto.external.v1;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPrpRequestDto {
	
	@JsonProperty("prp")
	private List<ExternalPrpRequestDtoV1> externalPrpRequestDtoV1;
	

}
