package com.effigo.shared.dto.external.v7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

/**
 * @Author Srinivas Kota
 * This is for Thermax.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
public class ExternalVendorDtoV7 {

	@JsonProperty("effigo_ref_no")
	private String vendorId;

	@JsonProperty("vendor_name")
	private String vendorName;

	@JsonProperty("company_code")
	private String companyCode;

	@JsonProperty("oracle_vendor_code")
	private String oracleVendorCode;

	@JsonProperty("one_time_vendor")
	private String oneTimeVendor;

	@JsonProperty("vendor_type")
	private String vendorType;

	@JsonProperty("enabled_flag")
	private String enabledFlag;

	@JsonProperty("invoice_currency_code")
	private String invoiceCurrencyCode;

	@JsonProperty("payment_currency_code")
	private String paymentCurrencyCode;

	@JsonProperty("msme_type")
	private String msmeType;

	@JsonProperty("msme_number")
	private String msmeNumber;

	@JsonProperty("udyam_registration_number")
	private String udyamRegistrationNumber;

	@JsonProperty("msme_registered_date")
	private String msmeRegisteredDate;

	@JsonProperty("cin_number")
	private String cinNumber;

	@JsonProperty("pay_term")
	private String payTerm;

	@JsonProperty("sap_vendor_code")
	private String sapVendorCode;

	@JsonProperty("infor_vendor_code")
	private String inforVendorCode;

	@JsonProperty("custom1")
	private String custom1;

	@JsonProperty("process_type")
	private String processType;

	@JsonProperty("sites")
	private List<ExternalVendorSiteDtoV7> sites;

	@JsonProperty("status")
	private String status;
	@JsonProperty("vendor_cat")
	private String vendorCategory;
}

