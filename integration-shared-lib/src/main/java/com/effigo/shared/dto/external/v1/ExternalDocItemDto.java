package com.effigo.shared.dto.external.v1;

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
public class ExternalDocItemDto {

	@JsonProperty("MATDOC_ITEM")
	private String item;
	@JsonProperty("REASON_CODE")
	private String reasonCode;
	@JsonProperty("REASON_TEXT")
	private String reasonText;
}
