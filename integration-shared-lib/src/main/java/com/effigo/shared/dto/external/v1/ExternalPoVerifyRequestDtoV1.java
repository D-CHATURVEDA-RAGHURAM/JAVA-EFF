package com.effigo.shared.dto.external.v1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ExternalPoVerifyRequestDtoV1 {
	String poid;
	String job;

}
