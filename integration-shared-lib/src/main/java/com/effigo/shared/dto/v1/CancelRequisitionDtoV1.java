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
public class CancelRequisitionDtoV1 {
	@JsonProperty("reqid")
	private String reqId;

	@JsonProperty("erpid")
	private String erpId;

	@JsonProperty("createdby")
	private String createdBy;

	@JsonProperty("createddate")
	private String createdDate;

	private String status;

	private String comments;

}