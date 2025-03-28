package com.effigo.shared.dto.external.v2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceItemDtoV2 {
	
	@JsonProperty("I_PCKG_NO")
	private String packageNumber;
	
	@JsonProperty("I_LINE_NO")
	private String lineNumber;
	
	@JsonProperty("I_EXT_LINE")
	private String extLine;
	
	@JsonProperty("I_OUTL_IND")
	private String out;
	
	@JsonProperty("I_SUBPCKG_NO")
	private String subPackage;
	
	@JsonProperty("I_SERVICE")
	private String itemCode;
	
	@JsonProperty("I_QUANTITY")
	private String quantity;
	
	@JsonProperty("I_BASE_UOM")
	private String baseUom;
	
	@JsonProperty("I_UOM_ISO")
	private String uomIso;
	
	@JsonProperty("I_PRICE_UNIT")
	private String priceUnit;
	
	@JsonProperty("I_GR_PRICE")
	private String grossPrice;

	@JsonProperty("I_NET_PRICE")
	private String itemPrice;
	
	@JsonProperty("I_SHORT_TEXT")
	private String shortText;
	
	@JsonProperty("I_PLN_PCKG")
	private String plantPackage;
	
	@JsonProperty("I_PLN_LINE")
	private String plantLine;

}
