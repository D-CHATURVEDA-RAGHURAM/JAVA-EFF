package com.effigo.shared.dto.v2;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceItemsDtoV2 {
	
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

	@JsonProperty("itemPrice")
	private String itemPrice;
	
	@JsonProperty("shortText")
	private String shortText;
	
	@JsonProperty("plantPackage")
	private String plantPackage;
	
	@JsonProperty("plantLine")
	private String plantLine;

	@JsonProperty("text1")
	private String  text1;

	@JsonProperty("text2")
	private String  text2;

	@JsonProperty("text3")
	private String  text3;

	@JsonProperty("text4")
	private String  text4;

	@JsonProperty("text5")
	private String  text5;



}
