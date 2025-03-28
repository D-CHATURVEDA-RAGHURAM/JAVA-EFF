package com.effigo.shared.dto.external.v3;

import com.effigo.shared.dto.external.v2.ExternalGrnResponseDtoV2;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class GrnOutBoundResponseDtoV3 {

	@JsonProperty("EX_GOODSMVT_HEADRET")
	ExternalGrnResponseDtoV2 externalGrnResponseDtoV2;

	@JsonProperty("EX_MATDOCUMENTYEAR")
	private String exMatdocumentyear;

	@JsonProperty("EX_MATERIALDOCUMENT")
	private String exMaterialdocument;

	@JsonProperty("IM_RESPONSE")
	ExternalGrnOutBoundResponseDtoV3 externalGrnOutBoundResponseDtoV3;

}
