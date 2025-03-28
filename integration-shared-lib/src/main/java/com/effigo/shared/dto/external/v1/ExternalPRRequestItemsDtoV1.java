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
public class ExternalPRRequestItemsDtoV1 {
	
	@JsonProperty("reqitmid")
	public String requisitionItemId;
	
	@JsonProperty("itemcode")
	public String itemId;
	
	@JsonProperty("description")
	public String itemDescription;
	
	@JsonProperty("suggsupplier")
	public String suggestedSupplierCompany;
	
	@JsonProperty("qty")
	public String itemQuantity;
	
	@JsonProperty("uom")
	public String itemUom;
	
	@JsonProperty("estimatedprice")
	public String itemPrice;
	
	@JsonProperty("costcenter")
	public String costingAccount;
	
	@JsonProperty("priceperunit")
	public String pricePerUnit;
}
