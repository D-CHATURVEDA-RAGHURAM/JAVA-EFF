package com.effigo.shared.dto.external.v2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPriceInfoSheetReqDtoV2 {

	@JsonProperty("BUKRS")
	private String companyCode;

	@JsonProperty("BSTYP")
	private String purchaseDocCategory;

	@JsonProperty("BSART")
	private String purchaseDocType;

	@JsonProperty("LOEKZ")
	private String deletionFlag;

	@JsonProperty("LIFNR")
	private String vendorAccNumber;

	@JsonProperty("ZTERM")
	private String paymentKey;

	@JsonProperty("EKORG")
	private String purchaseOrg;

	@JsonProperty("BKGRP")
	private String purchaseGrp;

	@JsonProperty("WAERS")
	private String currency;

	@JsonProperty("EBDAT")
	private String purchaseDocDate;

	@JsonProperty("KDATB")
	private String validityStartDate;

	@JsonProperty("KDATE")
	private String validityEndDate;

	@JsonProperty("INCO1")
	private String incoTerms1;

	@JsonProperty("items")
	private List<ExternalPriceInfoSheetItemDtoV2> items;

	@JsonProperty("cusField1")
	private String cusField1;

	@JsonProperty("cusField2")
	private String cusField2;

	@JsonProperty("cusField3")
	private String cusField3;

	@JsonProperty("cusField4")
	private String cusField4;

	@JsonProperty("cusField5")
	private String cusField5;

	@JsonProperty("cusField6")
	private String cusField6;

	@JsonProperty("cusField7")
	private String cusField7;

	@JsonProperty("cusField8")
	private String cusField8;

	@JsonProperty("cusField9")
	private String cusField9;

	@JsonProperty("cusField10")
	private String cusField10;
}
