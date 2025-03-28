package com.effigo.shared.dto.external.v8;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceItemDtoAttachV8 {
	
	@JsonProperty("FILE_NAME")
	private String fileName;
	
	@JsonProperty("FILE_MIME_TYPE")
	private String fileMimeType;
	
	@JsonProperty("FILE_DATA")
	private String fileData;

}
