package com.effigo.shared.dto.external.v5;

import java.util.List;

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
public class ExternalPORequestDtoV5 {
	
	@JsonProperty("BUKRS")
	private String companyCode;
	
	@JsonProperty("BSTYP")
	private String purchasingDocumentCategory;
	
	@JsonProperty("BSART")
	private String purchasingDocumentType;
	
	@JsonProperty("LOEKZ")
	private String deletionFlag;
	
	@JsonProperty("LIFNR")
	private String vendorAccountNumber;
	
	@JsonProperty("ZTERM")
	private String termsOfPaymentKey;
	
	@JsonProperty("EKORG")
	private String purchasingOrganization;
	
	@JsonProperty("BKGRP")
	private String purchasingGroup;
	
	@JsonProperty("WAERS")
	private String currencyKey;
	
	@JsonProperty("EBDAT")
	private String purchasingDocumentDate;
	
	@JsonProperty("KDATB")
	private String startOfValidityPeriod;
	
	@JsonProperty("KDATE")
	private String endOfValidityPeriod;
	
	@JsonProperty("INCO1")
	private String incoterms;
	
	@JsonProperty("POITEMS")
	private List<ExternalPOItemDtoV5> poItems;
	
	@JsonProperty("SERVICE_ITEM")
	private List<ExternalPOServiceDtoV5> services;
	

}
