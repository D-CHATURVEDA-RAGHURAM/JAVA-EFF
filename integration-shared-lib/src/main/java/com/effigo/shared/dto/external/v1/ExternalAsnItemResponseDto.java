package com.effigo.shared.dto.external.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalAsnItemResponseDto {

	@JsonProperty("poitemid")
	private String poItemId;

	@JsonProperty("poid")
	private String poId;

	@JsonProperty("asnitemid")
	private String asnItemId;

	@JsonProperty("erpId")
	private String erpId;
}
