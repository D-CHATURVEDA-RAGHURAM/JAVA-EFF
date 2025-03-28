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
public class ExternalUomDtoV1 {
	
	@JsonProperty("detserialnumber")
	public String erpId;
	
	@JsonProperty("formula")
	public String convertionRate;
	
	@JsonProperty("linkuomcode")
	public String itemUnitId;
}
