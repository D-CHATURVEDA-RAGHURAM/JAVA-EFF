package com.effigo.shared.dto.external.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPriceInfoSheetDtoV1 {

	@JsonProperty("ZLIFNR")
	private String vendorAccNumber;

	@JsonProperty("ZMATNR")
	private String materialNumber;

	@JsonProperty("ZEKORG")
	private String purchaseOrg;

	@JsonProperty("ZWERKS")
	private String plant;

	@JsonProperty("ZNORMB")
	private String standardInfoRecInd;

	@JsonProperty("ZMEINS")
	private String poUom;

	@JsonProperty("ZUMREZ")
	private BigDecimal numeratorConversion;

	@JsonProperty("ZUMREN")
	private BigDecimal denominatorConversion;

	@JsonProperty("ZAPLFZ")
	private String plannedDeliveryDays;

	@JsonProperty("ZEKGRP")
	private String purchaseGrp;

	@JsonProperty("ZNORBM")
	private BigDecimal poQty;

	@JsonProperty("ZWEBRE")
	private String grInvoiceInd;

	@JsonProperty("ZMWSKZ")
	private String salesCode;

	@JsonProperty("ZWAERS")
	private String currency;

/*	@JsonProperty("ZPEINH")
	private String priceUnit;*/

	@JsonProperty("ZBPRME")
	private String orderPriceUnit;

	@JsonProperty("ZBPUMZ")
	private BigDecimal numConvPriceUnit;

	@JsonProperty("ZBPUMN")
	private BigDecimal denoConvPriceUnit;

	@JsonProperty("ZINCO1")
	private String incoTerms1;

	@JsonProperty("ZINCO2_L")
	private String incoTermsLoc;

	@JsonProperty("ZLTEX1")
	private String longText;

	@JsonProperty("ZDATAB")
	private String validityStartDate;

	@JsonProperty("ZDATAB1")
	private String validityEndDate;

	@JsonProperty("ZCOND_TYPE")
	private String condType;

	@JsonProperty("ZKBETR")
	private BigDecimal netPrice;

	@JsonProperty("ZKONWA")
	private String currencyKey;

	@JsonProperty("ZKPEIN")
	private String priceUnit1;

	@JsonProperty("ZKMEIN")
	private String orderPriceUnit1;


	@JsonProperty("cusField1")
	private String cusField1;

	@JsonProperty("ZKSCHL_PF")
	private String cusField2;

	@JsonProperty("ZKBETR_PFV")
	private String cusField3;

	@JsonProperty("ZKSCHL_DIS")
	private String cusField4;

	@JsonProperty("ZKBETR_DISV")
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

	@JsonProperty("cusField11")
	private String cusField11;

	@JsonProperty("cusField12")
	private String cusField12;

	@JsonProperty("cusField13")
	private String cusField13;

	@JsonProperty("cusField14")
	private String cusField14;

	@JsonProperty("cusField15")
	private String cusField15;

	@JsonProperty("cusField16")
	private String cusField16;

	@JsonProperty("cusField17")
	private String cusField17;

	@JsonProperty("cusField18")
	private String cusField18;

	@JsonProperty("cusField19")
	private String cusField19;

	@JsonProperty("cusField20")
	private String cusField20;
}
