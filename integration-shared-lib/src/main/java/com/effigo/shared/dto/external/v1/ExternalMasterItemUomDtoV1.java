package com.effigo.shared.dto.external.v1;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ExternalMasterItemUomDtoV1 {
	
	@JsonProperty("id")
	public String itemUom;
	
	@JsonProperty("formulae")
	public String convertionRate;
	
	@JsonProperty("status")
	public int status;
}
