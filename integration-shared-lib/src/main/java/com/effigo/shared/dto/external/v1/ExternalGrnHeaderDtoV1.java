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
public class ExternalGrnHeaderDtoV1 {
	
	@JsonProperty("pstngdate")
	private String postingDate;
	
	@JsonProperty("docdate")
	private String docDate;
	
	@JsonProperty("refdocno")
	private String refdocno;
	
	@JsonProperty("refdocnolong")
	private String refdocnolong;
	
	

}
