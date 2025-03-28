package com.effigo.shared.dto.external.v2;

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
public class ExternalVendorDataDtoV2 {
	@JsonProperty("effigoref")
	private String effigoRef;
	@JsonProperty("erpid")
	private String erpId ;
	@JsonProperty("responsecode")
	private String responseCode ;
	private String message;
	private String msg;
	private String vendorId;
	@JsonProperty("data")
	private ExternalVendorErrorDataDto externalVendorErrorDataDto;

	public ExternalVendorDataDtoV2(String effigoRef, String erpId, String responseCode, String msg, String vendorId,
			ExternalVendorErrorDataDto externalVendorErrorDataDto) {
		this.effigoRef = effigoRef;
		this.erpId = erpId;
		this.responseCode = responseCode;
		this.msg = msg;
		this.vendorId = vendorId;
		this.externalVendorErrorDataDto = externalVendorErrorDataDto;
	}
}
