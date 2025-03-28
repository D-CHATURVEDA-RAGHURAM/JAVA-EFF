package com.effigo.shared.dto.external.v4;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalRequestDocumentDtoV4 {

	@JsonProperty("Content")
	byte[] attachment1 = {};

	@JsonProperty("Filename")
	String fileName;

	@JsonProperty("Mimetype")
	String mimetype;

	@JsonProperty("Tokenno")
	private String tokenNo;

}
