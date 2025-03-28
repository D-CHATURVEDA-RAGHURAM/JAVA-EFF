package com.effigo.shared.dto.external.v1;

import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExternalPrResponseDtoV1 {

	@JsonProperty("ErrorLog")
	private String errorLog;
	@JsonProperty("Status")
	private String status;

	@JsonProperty("Data")
	private HashMap<String,String> data;


}
