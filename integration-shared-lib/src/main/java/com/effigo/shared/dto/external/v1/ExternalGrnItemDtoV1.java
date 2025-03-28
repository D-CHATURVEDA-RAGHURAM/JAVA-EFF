package com.effigo.shared.dto.external.v1;

import java.util.List;

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
public class ExternalGrnItemDtoV1 {
	

	@JsonProperty("movetype")
	private String movetype;
	
	@JsonProperty("stcktype")
	private String stcktype;
	
	@JsonProperty("entryqnt")
	private String entryqnt;
	
	@JsonProperty("entryuom")
	private String entryuom;
	
	@JsonProperty("ponumber")
	private String ponumber;
	
	
	@JsonProperty("poitem")
	private String poitem;
	
	@JsonProperty("itemtext")
	private String itemtext;
	
	@JsonProperty("grrcpt")
	private String grrcpt;
	
	@JsonProperty("mvtind")
	private String mvtind;
	
	@JsonProperty("movereas")
	private String movereas;

	@JsonProperty("refdocyr")
	private String refdocyr;

	@JsonProperty("refdoc")
	private String refdoc;

	@JsonProperty("refdocit")
	private String refdocit;

}
