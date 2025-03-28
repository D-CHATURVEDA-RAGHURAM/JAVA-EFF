package com.effigo.shared.dto.internal.v7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class VendorDateRequestDto {

	@JsonProperty("startdate")
	private String startDate; // yyyy-mm-dd
	@JsonProperty("enddate")
	private String endDate; // yyyy-mm-dd
	@JsonProperty("cusfield1")
	private String cusField1;
	@JsonProperty("cusfield2")
	private String cusField2;

}
