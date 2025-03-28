package com.effigo.shared.dto.external.v5;

import com.effigo.shared.dto.external.v1.ExternalVendorStatusResponseDtoV1;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalVendorResponseDtoV5 {
	@JsonProperty("Status")
	private ExternalVendorStatusResponseDtoV1 externalVendorStatusResponseDtoV1;

}


