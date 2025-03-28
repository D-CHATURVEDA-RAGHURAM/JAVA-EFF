package com.effigo.shared.dto.external.v5;

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
public class ExternalPOServiceDtoV5 {
	
	@JsonProperty("EBELP")
	private String itemNumber;
	
	@JsonProperty("EXTROW")
	private String lineNumber;
	
	@JsonProperty("DEL")
	private String deletionFlag;
	
	@JsonProperty("SRVPOS")
	private String serviceNumber;
	
	@JsonProperty("KTEXT1")
	private String shortText;
	
	@JsonProperty("MENGE")
	private String quantity;
	
	@JsonProperty("MEINS")
	private String unitOfMeasure;
	
	@JsonProperty("PEINH")
	private String priceUnit;
	
	@JsonProperty("BRTWR")
	private String grossPrice;
	
	@JsonProperty("NETWR")
	private String netValueOfItem;

}
