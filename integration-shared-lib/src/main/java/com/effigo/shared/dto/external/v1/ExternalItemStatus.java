package com.effigo.shared.dto.external.v1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExternalItemStatus {
	private String itemcode;
	private Integer isavl;
	private String msg;
}
