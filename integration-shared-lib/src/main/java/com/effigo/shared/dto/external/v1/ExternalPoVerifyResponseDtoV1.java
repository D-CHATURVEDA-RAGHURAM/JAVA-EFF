package com.effigo.shared.dto.external.v1;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ExternalPoVerifyResponseDtoV1 {
	@JsonProperty("errmsg")
	String errmsg;
	@JsonProperty("isallowed")
	String isAllowed;
	@JsonProperty("poid")
	String poid;
	@JsonProperty("poitmstatus")
	private List<ExternalPoItmStatusV1> poitmStatus;
	@JsonProperty("status")
	String status;
}
