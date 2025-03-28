package com.effigo.shared.dto.external.v5;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalRequestPOItemDtoV5 {
		
		private String itemNumber;
		private String deletionFlagItemLevel;
		private String shortText;
		private String materialNumber;
		private String plant;
		private String storageLocation;
		private String trackingNumber;
		private String materialGroup;
		private String quantity;
		private String uom;
		private String netPriceInPurchasingDocument;
		private String priceUnit;
		private String netOrderValue;
		private String grossOrderValue;
		private String taxCode;
		private String sgstPercent;
		private String cgstPercent;
		private String igstPercent;
		private String ugstPercent;
		private String transportataionCost;
		private String purchaseRequestNumber;
		private String purchaseRequestItem;
		private String hsnSacCode;

	


}
