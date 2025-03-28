package com.effigo.shared.dto.external.v1;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPrpRequestDtoV1 {
	
	@JsonProperty("buid")
	private String buId;
	
	@JsonProperty("ordertype")
	private String orderType;
	
	@JsonProperty("buyer")
	private String buyer;
	
	@JsonProperty("buyername")
	private String buyerName;
	
	@JsonProperty("prpno")
	private String prpNo;
	
	@JsonProperty("itemcode")
	private String itemCode;
	
	@JsonProperty("desc")
	private String desc;
	
	@JsonProperty("longdesc")
	private String longDesc;
	
	@JsonProperty("qty")
	private String qty;

	@JsonProperty("status")
	private String status;

	@JsonProperty("createddate")
	private String createdDate;

	@JsonProperty("reqdate")
	private String reqDate;

	@JsonProperty("planstartdate")
	private String planStartDate;

	@JsonProperty("planenddate")
	private String planEndDate;
	
	@JsonProperty("warehouse")
	private String warehouse;

	@JsonProperty("planner")
	private String planner;
	
	@JsonProperty("plannername")
	private String plannerName;
	
	@JsonProperty("uom")
	private String uom;

	@JsonProperty("buybp")
	private String buybp;

	@JsonProperty("buybpname")
	private String buybpName;

	@JsonProperty("pordertype")
	private String porderType;

	@JsonProperty("porderno")
	private String porderNo;
	
	@JsonProperty("pposno")
	private String pposno;
	
	@JsonProperty("pseqno")
	private String pseqno;
	
	@JsonProperty("proj")
	private List<ExternalPrpProjectDto> externalPrpProjectDto;

	@JsonProperty("elements")
	private List<ExternalPrpElementsDto> externalElementsDto;




	
	
   
     
}
