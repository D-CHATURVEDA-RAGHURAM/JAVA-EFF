package com.effigo.shared.dto.external.v1;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalInboundPrpDtoV1 {
	
	
	@JsonProperty("itemCode")
	private String itemCode;
	@JsonProperty("description")
	private String description;
//	@JsonProperty("status")
//	private String status;
	@JsonProperty("createdBy")
	private String createdBy;
	@JsonProperty("createdDate")
	private String createdDate;
	@JsonProperty("updatedOn")
	private String updatedOn;
	@JsonProperty("updatedBy")
	private String updatedBy;
	@JsonProperty("customField1")
	private String customField1;
	@JsonProperty("customField2")
	private String customField2;
	@JsonProperty("customField3")
	private String customField3;
	@JsonProperty("customField4")
	private String customField4;
	@JsonProperty("customField5")
	private String customField5;
	@JsonProperty("customField6")
	private String customField6;
	@JsonProperty("customField7")
	private String customField7;
	@JsonProperty("customField8")
	private String customField8;

	@JsonProperty("customField9")
	private String customField9;

	@JsonProperty("customField10")
	private String customField10;

	@JsonProperty("customField11")
	private String customField11;

	@JsonProperty("customField12")
	private String customField12;

	@JsonProperty("customField13")
	private String customField13;

	@JsonProperty("customField14")
	private String customField14;

	@JsonProperty("customField15")
	private String customField15;

	@JsonProperty("customField16")
	private String customField16;

	@JsonProperty("customField17")
	private String customField17;

	@JsonProperty("customField18")
	private String customField18;

	@JsonProperty("customField19")
	private String customField19;

	@JsonProperty("customField20")
	private String customField20;

	@JsonProperty("customField21")
	private String customField21;

	@JsonProperty("customField22")
	private String customField22;


	
	


}
