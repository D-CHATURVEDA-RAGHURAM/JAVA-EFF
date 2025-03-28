package com.effigo.shared.dto.external.v3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalRequestItemDtoV3 {

	private String type;

	@JsonProperty("ZMATNR")
	private String code;

	@JsonProperty("ZWERKS")
	private String plantcode;

	@JsonProperty("ZMATKL")
	private String categoryid;

	@JsonProperty("ZMAKTX")
	private String name;

	@JsonProperty("ZLVORM_PLANT")
	private String plantstatus;

	@JsonProperty("ZLVORM_CLIENT")
	private String status;

	@JsonProperty("ZMEINS")
	private String uom;

	@JsonProperty("ZZMAT_SUB")
	private String subCategory;

	@JsonProperty("ZERSDA")
	private String cusField1;

	@JsonProperty("ZNTGEW")
	private String cusField2;

	@JsonProperty("ZPLIFZ")
	private String cusField3;

	@JsonProperty("ZWEBAZ")
	private String cusField4;

	@JsonProperty("cusField5")
	private String cusField5;

	@JsonProperty("ZBESKZ")
	private String cusField6;

	@JsonProperty("ZSOBSL")
	private String cusField7;

	@JsonProperty("ZEXTWG")
	private String cusField8;

	@JsonProperty("ZEKGRP")
	private String cusField9;

	@JsonProperty("ZZEIVR")
	private String cusField10;
	@JsonProperty("ZZEINR")
	private String cusField11;
	private String taxCode;

	/* Extra fields */

	@JsonProperty("ZWERKS_NAME1")
	private String plantName;

	@JsonProperty("ZZMAT_SUB_DESC")
	private String materialSubcategoryDescription;

	@JsonProperty("ZWGBEZ")
	private String materialDescription;
}
