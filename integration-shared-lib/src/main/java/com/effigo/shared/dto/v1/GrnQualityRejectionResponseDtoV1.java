package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GrnQualityRejectionResponseDtoV1 {
	private String insId;

	private String insItemId;

	private String createdDate;

	private String currentDate;

	private String message;

	private String status;

	private String errorCode;

	private String insLotNo;
}
