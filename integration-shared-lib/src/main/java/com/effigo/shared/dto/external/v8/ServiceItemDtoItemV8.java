package com.effigo.shared.dto.external.v8;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceItemDtoItemV8 {
	
	@JsonProperty("PCKG_NO")
	private String packageNumber;
	
	@JsonProperty("LINE_NO")
	private String lineNumber;
	
	@JsonProperty("EXT_LINE")
	private String extLine;
	
	@JsonProperty("OUTL_IND")
	private String out;
	
	@JsonProperty("SUBPCKG_NO")
	private String subPackage;
	
	@JsonProperty("SERVICE")
	private String itemCode;
	
	@JsonProperty("QUANTITY")
	private String quantity;
	
	@JsonProperty("BASE_UOM")
	private String baseUom;
	
	@JsonProperty("UOM_ISO")
	private String uomIso;
	
	@JsonProperty("PRICE_UNIT")
	private String priceUnit;
	
	@JsonProperty("GR_PRICE")
	private String grossPrice;
	
	@JsonProperty("SHORT_TEXT")
	private String shortText;
	
	@JsonProperty("PLN_PCKG")
	private String plantPackage;
	
	@JsonProperty("PLN_LINE")
	private String plantLine;

	@JsonProperty("CURRENCY")
	private String currency;

	@JsonProperty("NET_PRICE")
	private String netPrice;

}
