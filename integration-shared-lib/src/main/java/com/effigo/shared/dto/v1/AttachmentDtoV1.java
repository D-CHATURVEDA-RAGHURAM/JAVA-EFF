package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class AttachmentDtoV1 {

	@JsonProperty("FILE_NAME")
	private String fileName;

	@JsonProperty("MIME_TYPE")
	private String fileExtension;

	@JsonProperty("DATA")
	private String fileData;
}
