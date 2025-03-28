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
public class ExternalPOItemDtoV5 {
	
	@JsonProperty("EBELP")
	private String itemNumber;
	
	@JsonProperty("LOEKZ")
	private String deletionFlagItemLevel;
	
	@JsonProperty("TXZ01")
	private String shortText;
	
	@JsonProperty("MATNR")
	private String materialNumber;
	
	@JsonProperty("WERKS")
	private String plant;
	
	@JsonProperty("LGORT")
	private String storageLocation;
	
	@JsonProperty("BEDNR")
	private String trackingNumber;
	
	@JsonProperty("MATKL")
	private String materialGroup;
	
	@JsonProperty("MENGE")
	private String quantity;
	
	@JsonProperty("MEINS")
	private String uom;
	
	@JsonProperty("NETPR")
	private String netPriceInPurchasingDocument;
	
	@JsonProperty("PEINH")
	private String priceUnit;
	
	@JsonProperty("NETWR")
	private String netOrderValue;
	
	@JsonProperty("BRTWR")
	private String grossOrderValue;
	
	@JsonProperty("TAX_CODE")
	private String taxCode;
	
	@JsonProperty("SGST_PERCENT")
	private String sgstPercent;
	
	@JsonProperty("CGST_PERCENT")
	private String cgstPercent;
	
	@JsonProperty("IGST_PERCENT")
	private String igstPercent;
	
	@JsonProperty("UGST_PERCENT")
	private String ugstPercent;
	
	@JsonProperty("TRANSPORT_COST")
	private String transportataionCost;
	
	@JsonProperty("BANFN")
	private String purchaseRequestNumber;
	
	@JsonProperty("BNFPO")
	private String purchaseRequestItem;
	
	@JsonProperty("HSN_SAC_CODE")
	private String hsnSacCode;

}
