package com.effigo.shared.dto.external.v1;

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
public class ExternalGrnImRequestDto {

	@JsonProperty("MATERIALDOCUMENT")
	private String erpId;

	@JsonProperty("MATDOCUMENTYEAR")
	private String year;

	@JsonProperty("GOODSMVT_PSTNG_DATE")
	private String postingDate;

	@JsonProperty("GOODSMVT_PR_UNAME")
	private String prName;

	@JsonProperty("GOODSMVT_MATDOCITEM")
	private List<ExternalGrnDocItemDto> asnDocItems;
}
