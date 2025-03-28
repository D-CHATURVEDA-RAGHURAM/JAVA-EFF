package com.effigo.shared.dto.v1;

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
public class AsnDocItemDto {

	@JsonProperty("item")
	private String item;
	@JsonProperty("reasonCode")
	private String reasonCode;
	@JsonProperty("reasonText")
	private String reasonText;
}
