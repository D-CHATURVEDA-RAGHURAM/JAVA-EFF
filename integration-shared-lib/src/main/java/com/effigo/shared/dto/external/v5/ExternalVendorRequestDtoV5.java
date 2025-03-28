package com.effigo.shared.dto.external.v5;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalVendorRequestDtoV5 {

	@JsonProperty("ZLIFNR")
	private String vendorCode;

	@JsonProperty("ZNAME1")
	private String firstName;

	@JsonProperty("ZVEND_GRP_DESC")
	private String vendorAccountGroupDesc;

	@JsonProperty("ZLAND1")
	private String countryName;

	@JsonProperty("ZREG_NO")
	private String registrationNo;

	@JsonProperty("ZPAN_NO")
	private String panNo;

	@JsonProperty("ZTAX_NO")
	private String taxNumber;

	@JsonProperty("ZVEND_CAT")
	private String vendorCategory;

	@JsonProperty("ZREG_ADD")
	private String name;

	@JsonProperty("ZREG_ADD_1")
	private String address;

	@JsonProperty("ZCOUNTRY")
	private String country;

	@JsonProperty("ZSTATE")
	private String region;

	@JsonProperty("ZCITY")
	private String city;

	@JsonProperty("ZDISTRICT")
	private String district;

	@JsonProperty("ZPOSTAL_CODE")
	private String postalCode;

	@JsonProperty("ZCONT_PER")
	private String contactPerson;

	@JsonProperty("ZDESG")
	private String designation;

	@JsonProperty("ZLOCATION")
	private String location;

	@JsonProperty("ZMOB_NO")
	private String mobileNo;

	@JsonProperty("ZMAIL_ADD")
	private String emailAddress;

	@JsonProperty("ZMAIL_ADD2")
	private String emailAddress2;

	@JsonProperty("ZMAIL_ADD3")
	private String emailAddress3;

	@JsonProperty("ZSCH_GR_DESC")
	private String schemaGroupVendorDesc;

	@JsonProperty("ZCURR")
	private String currency;

	@JsonProperty("ZPAY_TERM")
	private String paymentTerm;

	@JsonProperty("ZPAY_TERM_DESC")
	private String paymentTermDesc;

	@JsonProperty("ZINCO1")
	private String incoTerm1;

	@JsonProperty("ZINCO1_DESC")
	private String incoTermDesc;

	@JsonProperty("ZMSMET")
	private String msmeRegistrationNumber;

	@JsonProperty("ZLOEVM")
	private String blockingFunction;

	@JsonProperty("ZLOEVM_TXT")
	private String blockingFunctionText;

	@JsonProperty("ZISNDA")
	private String isNdaEligible;

}
