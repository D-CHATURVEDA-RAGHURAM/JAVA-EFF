package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class PoVerifyRequestDto {
	@JsonProperty("poid")
	String poid;
	@JsonProperty("erpid")
	String erpid;
	@JsonProperty("projectid")
	String projectid;

}
