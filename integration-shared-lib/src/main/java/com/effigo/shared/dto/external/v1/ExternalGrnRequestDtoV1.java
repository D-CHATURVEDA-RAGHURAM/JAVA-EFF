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
public class ExternalGrnRequestDtoV1 {
	
	@JsonProperty("goodsmvtheader")
	ExternalGrnHeaderDtoV1 externalGrnHeaderDtoV1;
	
	@JsonProperty("goodsmvtitem")
	List<ExternalGrnItemDtoV1> externalGrnItemDtoV1;
	
	@JsonProperty("linedetails")
	List<ExternalGrnLineDetailsDtoV1> externalGrnLineDetailsDtoV1s;

}
