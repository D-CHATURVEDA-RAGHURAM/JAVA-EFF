package com.effigo.shared.dto.v2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PoPriceTemplateStructureDtoV2 {
	@JsonProperty("id")
	private String id;

	@JsonProperty("purchaseOrderId")
	public String poId;
	
	@JsonProperty("itemId")
	public String poItmId;

	@JsonProperty("compName")
	public String taxCode;

	@JsonProperty("taxVal")
	public String taxVal;

	@JsonProperty("comptype")
	public Integer compType;

	@JsonProperty("calcOn")
	public String calcon;

	@JsonProperty("calctype")
	public Integer calcType = 1;
	
	@JsonProperty("price")
	public String price;

	@JsonProperty("index")
	public Integer index;

	@JsonProperty("rowCalcTax")
	private String rowCalcTax;

}
