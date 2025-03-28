package com.effigo.shared.dto.v1;

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
public class GrnImRequestDto {

	@JsonProperty("erpId")
	private String erpId;

	@JsonProperty("year")
	private String year;

	@JsonProperty("postingDate")
	private String postingDate;

	@JsonProperty("prName")
	private String prName;

	@JsonProperty("externalDocItems")
	private List<GrnDocItemDto> asnDocItems;
}
