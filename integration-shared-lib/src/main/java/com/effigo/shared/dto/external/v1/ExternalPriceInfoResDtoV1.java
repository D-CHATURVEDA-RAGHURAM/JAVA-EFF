package com.effigo.shared.dto.external.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@JsonNaming(value = PropertyNamingStrategies.LowerCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPriceInfoResDtoV1 {

	@JsonProperty("Status")
	private boolean status;
	@JsonProperty("Data")
	private String data;
	@JsonProperty("erpid")
	private String erpId;
	@JsonProperty("PoItems")
	private ExternalPoItemResponse PoItems;
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
