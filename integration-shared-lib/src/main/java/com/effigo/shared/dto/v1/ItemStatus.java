package com.effigo.shared.dto.v1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemStatus {
	private String itemcode;
	private Integer isavl;
	private String msg;
}
