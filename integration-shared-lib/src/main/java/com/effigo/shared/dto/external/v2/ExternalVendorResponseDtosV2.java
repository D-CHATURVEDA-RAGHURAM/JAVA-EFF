package com.effigo.shared.dto.external.v2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.Map;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExternalVendorResponseDtosV2 {

	@JsonProperty("VEND_RESP")
	private List<ExternalVendorResponseDtoV2> externalVendorResponseDtoV2s;

	@JsonProperty("vendorResponse")
	private List<ExternalVendorResponseDtoV2> vendorResponse;

	@JsonProperty("errorVendorResponse")
	private List<ExternalVendorResponseDtoV2> errorVendorResponse;

	@JsonProperty("error")
	private Map<String, String> error;

	private HttpStatus statusCode;
	private boolean status;
}
