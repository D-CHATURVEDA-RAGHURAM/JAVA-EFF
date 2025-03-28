package com.effigo.shared.dto.external.v7;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExternalInforAddPropsReqDtoV7 {

	private String accountingEntity;
	private String location;
	private String variationId;

}
