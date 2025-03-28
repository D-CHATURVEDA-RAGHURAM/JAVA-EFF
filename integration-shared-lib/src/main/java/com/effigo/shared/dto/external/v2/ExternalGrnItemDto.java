package com.effigo.shared.dto.external.v2;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalGrnItemDto {
	
	@JsonProperty("movetype")
	private String moveType;
	
	@JsonProperty("stcktype")
	private String stckType;
	
	@JsonProperty("entryqnt")
	private String entryQnt;
	
	@JsonProperty("entryuom")
	private String entryUom;
	
	@JsonProperty("ponumber")
	private String poNumber;
	
	
	@JsonProperty("poitem")
	private String poItem;
	
	@JsonProperty("itemtext")
	private String itemText;
	
	@JsonProperty("grrcpt")
	private String grRcpt;
	
	@JsonProperty("mvtind")
	private String mvtInd;
	
	@JsonProperty("movereas")
	private String moveReas;

	@JsonProperty("refdocyr")
	private String refDocYear;

	@JsonProperty("refdoc")
	private String refDoc;

	@JsonProperty("refdocit")
	private String refDocIt;

}
