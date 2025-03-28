package com.effigo.shared.dto.external.v1;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonNaming(value = PropertyNamingStrategies.LowerCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPoResponseDtoV2 {

	@JsonProperty("Status")
	private boolean status;
	@JsonProperty("Data")
	private String data;
	@JsonProperty("erpid")
	private String erpId;
	@JsonProperty("PoItems")
	private List<ExternalPoItemResponse> PoItems;
	@JsonProperty("ErrorLog")
	private String errorLog;
	@JsonProperty("poId")
	public String poId;

	@Getter
	@Setter
	@ToString
	public static class ExternalPoItemResponse {
		@JsonProperty("poItmId")
		private String poItmId;
		@JsonProperty("erpid")
		private String erpId;

	}
}
