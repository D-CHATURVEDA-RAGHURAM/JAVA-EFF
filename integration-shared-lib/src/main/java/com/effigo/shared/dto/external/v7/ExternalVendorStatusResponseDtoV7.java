package com.effigo.shared.dto.external.v7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalVendorStatusResponseDtoV7 {
	@JsonProperty("message_type")
	private String messageType;

	@JsonProperty("message")
	private String message;

	@JsonProperty("vendor_id")
	private String vendorID;

	@JsonProperty("vendor_name")
	private String vendorName;


	@JsonProperty("vendor_site_id")
	private String siteId;

	@JsonProperty("vendor_site_name")
	private String siteName;


	@JsonProperty("vendor_stg_id")
	private String vendorStgId;


	@JsonProperty("transaction_mode")
	private String transactionMode;

}

