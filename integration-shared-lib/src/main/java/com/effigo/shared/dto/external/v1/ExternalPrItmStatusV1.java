package com.effigo.shared.dto.external.v1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExternalPrItmStatusV1 {
	String itemcode;
	Integer isavl;
	String msg;

}
