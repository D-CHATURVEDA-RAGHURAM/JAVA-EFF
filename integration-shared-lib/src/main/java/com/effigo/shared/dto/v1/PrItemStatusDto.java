package com.effigo.shared.dto.v1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class PrItemStatusDto {
	String itemcode;
	Integer isavl;
	String msg;

}
