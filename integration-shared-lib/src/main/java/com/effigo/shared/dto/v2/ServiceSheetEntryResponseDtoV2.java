package com.effigo.shared.dto.v2;

import com.effigo.shared.dto.v1.ServiceSheetOutboundResponseDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(value = PropertyNamingStrategies.LowerCaseStrategy.class)
public class ServiceSheetEntryResponseDtoV2 {
	
	@JsonProperty("EX_RESPONSE")
	private ServiceSheetOutboundResponseDtoV2 serviceSheetOutboundResponseDto;

	@JsonProperty("EV_MESSAGE")
	private String evMessage;

	@JsonProperty("EV_MSGTY")
	private String evMsgType;

	@JsonProperty("EV_SES_NUMBER")
	private String evSesNo;

}
