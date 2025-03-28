package com.effigo.shared.dto.v2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PurchaseOrderItemPriceHistoryAuditViewDto {

	private String amendNo;

	private String poDoc;

	private String poItemId;

	private String fssaiNo;

	private String itemId;

	private String itemPriceOld;

	private String itemPriceNew;

	private String uomOld;

	private String uomNew;

	private String startDateNew;

	private String priceStartDateOld;

	private String endDateOld;

	private String priceEndDateOld;

	private String paymentTermOld;

	private String paymentTermNew;

	private String incoTermOld;

	private String incoTermNew;

	private String incoTerm2Old;

	private String incoTerm2New;

	private String companyId;

	private String companyName;

	private String status;

	private String basePrice;

	private String startDate;

	private String endDate;

	private String totalPrice;

	private String amendDate;

	private String createdBy;

	private String reasonCode;

	private String costCenter;

	private String description2;

	private String createdOn;

	private String createdTime;

	private String itemCode;

	private String itemName;

	private String businessUnit;

	private String currency;
}
