package com.effigo.shared.dto.v3;

import com.effigo.shared.dto.v2.VendorDtoV2;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(content = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VendorRequestDtoV3 {

	@JsonProperty("vendors")
	private List<VendorDtoV3> vendorDtos;
	@JsonProperty("businessId")
	private String businessId;
}
