package com.effigo.shared.dto.external.v7;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExternalInforRequestDotV7 {

	private String documentName ;
	private String messageId ;
	private String fromLogicalId ;
	private String toLogicalId ;
	private ExternalInforDocumentReqDtoV7 document ;
	private ExternalInforAddPropsReqDtoV7 additionalProperties ;
}
