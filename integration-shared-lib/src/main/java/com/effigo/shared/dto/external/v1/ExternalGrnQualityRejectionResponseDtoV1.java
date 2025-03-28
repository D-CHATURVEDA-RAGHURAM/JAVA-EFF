package com.effigo.shared.dto.external.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExternalGrnQualityRejectionResponseDtoV1 {
	@JsonProperty("MBLNR")
	private String insId;

	@JsonProperty("ZEILE")
	private String insItemId;

	@JsonProperty("CREATED_ON")
	private String createdDate;

	@JsonProperty("CREATED_AT")
	private String currentDate;

	@JsonProperty("MESSAGE")
	private String message;

	@JsonProperty("STATUS")
	private String status;

	@JsonProperty("ERROR_CODE")
	private String errorCode;

	@JsonProperty("PRUEFLOS")
	private String insLotNo;
}
