package com.effigo.shared.dto.external.v1;

import com.effigo.shared.dto.v1.ErrorLogDtoV1;
import com.effigo.shared.dto.v1.ErrorLogV1;
import com.effigo.shared.dto.v2.ErrorItemV2;
import com.effigo.shared.dto.v2.ErrorLogV2;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class GrnRejectItemResponseDto {
	@JsonProperty("REF_DOC")
	private String refDoc;

	@JsonProperty("REF_DOC_YR")
	private String RefDocYr;

	@JsonProperty("REF_DOC_IT")
	private String refDocIt;

	@JsonProperty("MOVE_TYPE")
	private String moveType;

	@JsonProperty("MBLNR")
	private String mblnr;

	@JsonProperty("MJAHR")
	private String mjahr;

	@JsonProperty("ERROR_LOG")
	private List<ErrorItemV2> errorItemV2s;

}
