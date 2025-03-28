package com.effigo.shared.dto.external.v2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExternalVendorResponseDtoV2 {
	@JsonProperty("transactionid")
	private String transactionId;
	private String vendor;
	@JsonProperty("effigorefno")
	private String effigoRefNo;
	@JsonProperty("erprefno")
	private String erpRefNo;
	@JsonProperty("responsecode")
	private String responseCode;
	private String message;
	private List<ExternalVendorDataDtoV2> data;

	@JsonProperty("Status")
	private Boolean status;
	@JsonProperty("errorMessage")
	private String errorMessage;
	@JsonProperty("errorCode")
	private String errorCode;
	@JsonProperty("statusCode")
	private String statusCode;
	@JsonProperty("response")
	private ExternalVendorDataDtoV2 response;

}
