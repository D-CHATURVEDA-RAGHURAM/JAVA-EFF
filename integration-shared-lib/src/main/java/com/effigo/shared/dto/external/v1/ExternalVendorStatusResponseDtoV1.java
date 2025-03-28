package com.effigo.shared.dto.external.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalVendorStatusResponseDtoV1 {
	@JsonProperty("MessageType")
	private String messageType;

	@JsonProperty("Message")
	private String message;

	@JsonProperty("Vendor_Id")
	private String vendorID;

	@JsonProperty("Vendor_Name")
	private String vendorName;


	@JsonProperty("Site_Id")
	private String siteId;

	@JsonProperty("vendor_site_name")
	private String siteName;


	@JsonProperty("vendor_stg_id")
	private String vendorStgId;


}

