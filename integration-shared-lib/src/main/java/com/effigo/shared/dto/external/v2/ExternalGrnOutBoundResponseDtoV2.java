package com.effigo.shared.dto.external.v2;

import com.effigo.shared.dto.external.v1.GrnRejectItemResponseDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalGrnOutBoundResponseDtoV2 {
	
	@JsonProperty("Guiid")
	private String guiid;
	
	@JsonProperty("ITEM")
	private List<GrnRejectItemResponseDto> items;

}
