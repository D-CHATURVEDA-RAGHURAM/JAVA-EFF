package com.effigo.shared.dto.external.v2;

import java.util.List;

import com.effigo.shared.dto.v1.GrnOutboundLineDetailDto;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalGrnHeaderDto {
	
	@JsonProperty("pstngdate")
	private String postingDate;
	
	@JsonProperty("docdate")
	private String docDate;
	
	@JsonProperty("refdocno")
	private String refDocNo;
	
	@JsonProperty("refdocnolong")
	private String refDocNoLong;
	
	

}
