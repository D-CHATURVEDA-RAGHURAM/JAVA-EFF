package com.effigo.shared.dto.external.v3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(content = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalItemDtoV3 {

	@JsonProperty("BOB_APPLICATION_NO")
	private String bobApplicationNo;

	@JsonProperty("VENDOR_NUMBER")
	private String vendorNumber;

	@JsonProperty("STATUS")
	private String status;

	@JsonProperty("MESSAGE")
	private String message;
}
