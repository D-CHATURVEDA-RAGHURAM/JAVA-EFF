package com.effigo.shared.dto.external.v3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalReqDocumentDtoV3 {

	@JsonProperty("Content")
	String attachment1;

	@JsonProperty("Filename")
	String fileName;

	@JsonProperty("Mimetype")
	String mimetype;

	@JsonProperty("Tokenno")
	private String tokenNo;

}
