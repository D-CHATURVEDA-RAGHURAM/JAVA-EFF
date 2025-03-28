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
public class ExternalPODtoV5 {
	
	private String companyCode;
	private String purchasingDocumentCategory;
	private String purchasingDocumentType;
	private String deletionFlag;
	private String vendorAccountNumber;
	private String termsOfPaymentKey;
	private String purchasingOrganization;
	private String purchasingGroup;
	private String currencyKey;
	private String purchasingDocumentDate;
	private String startOfValidityPeriod;
	private String endOfValidityPeriod;
	private String incoterms;
	private List<ExternalRequestPOItemDtoV5> poItems;
	private List<ExternalRequestPOServiceDtoV5> services;

}
