package com.effigo.shared.dto.v1;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceItemsDto {
	
	@JsonProperty("packageNumber")
	private String packageNumber;
	
	@JsonProperty("lineNumber")
	private String lineNumber;
	
	@JsonProperty("extLine")
	private String extLine;
	
	@JsonProperty("subPackage")
	private String subPackage;
	
	@JsonProperty("itemCode")
	private String itemCode;
	
	@JsonProperty("quantity")
	private String quantity;
	
	@JsonProperty("baseUom")
	private String baseUom;
	
	@JsonProperty("uomIso")
	private String uomIso;
	
	@JsonProperty("priceUnit")
	private String priceUnit;
	
	@JsonProperty("grossPrice")
	private String grossPrice;
	
	@JsonProperty("shortText")
	private String shortText;
	
	@JsonProperty("plantPackage")
	private String plantPackage;
	
	@JsonProperty("plantLine")
	private String plantLine;





}
