package com.effigo.shared.dto.internal.v4;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PriceInfoDetailsDtoV4 {

	private String plant;

	private String purchaseOrg;

	private String materialNumber;

	private String materialDescription;

	private String inforRecordNumber;

	private String category;

	private String vendorNumber;

	private String netPrice;

	private String currency;

	private String orderPriceUnit;

	private String creationDate;

	private String validityStartDate;

	private String validityEndDate;

	private String taxCode;

	private String status;

}
