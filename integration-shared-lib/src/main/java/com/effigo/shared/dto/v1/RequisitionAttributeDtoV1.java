package com.effigo.shared.dto.v1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RequisitionAttributeDtoV1 {
	public String reqitmid;
	public String attrid;
	public String attrval;
}
