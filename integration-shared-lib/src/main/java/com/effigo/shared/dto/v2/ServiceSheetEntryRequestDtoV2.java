package com.effigo.shared.dto.v2;

import com.effigo.shared.dto.v1.ServiceSheetResponseDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceSheetEntryRequestDtoV2 {

	@JsonProperty("IM_REQUEST")
	private ServiceSheetResponseDtoV2 serviceSheetResponseDto;


}
