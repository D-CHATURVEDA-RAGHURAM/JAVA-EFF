package com.effigo.shared.dto.external.v7;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExternalInforDocumentReqDtoV7 {

	private String value;
	private String encoding;
	private String characterSet;

}
