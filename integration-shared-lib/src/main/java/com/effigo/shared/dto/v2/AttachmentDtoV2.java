package com.effigo.shared.dto.v2;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class AttachmentDtoV2 {

	@JsonProperty("FILE_NAME")
	private String fileName;

	@JsonProperty("FILE_MIME_TYPE")
	private String fileExtension;

	@JsonProperty("FILE_DATA")
	private String fileData;
}
