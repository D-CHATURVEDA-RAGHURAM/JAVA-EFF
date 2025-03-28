package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonProperty;

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
public class RequisitionItemDtoV1 {
	private String reqitmid;
	private String itemcode;
	private String description;
	private String suggsupplier;
	private String qty;
	private String uom;
	private String estimatedprice;
	private Double estimatedamount;
	private String erpid;

}