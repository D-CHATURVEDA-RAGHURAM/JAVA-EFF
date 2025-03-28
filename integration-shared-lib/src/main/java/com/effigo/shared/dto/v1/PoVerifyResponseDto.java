package com.effigo.shared.dto.v1;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class PoVerifyResponseDto {
	String errmsg;
	String isAllowed;
	@JsonProperty
	String poid;
	private List<PoItmStatus> poitmStatus;
	String status;
}
