package com.effigo.shared.dto.v6;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PODelivaryScheduleDtoV6 {
	@JsonProperty("poId")
	private String poId;

	@JsonProperty("poItemId")
	private String poItemId;

	@JsonProperty("scheduleLine")
	private String scheduleLine;

	@JsonProperty("reqId")
	private String reqId;

	@JsonProperty("purReqId")
	private String purReqId;

	@JsonProperty("requireddate")
	private String requiredDate;

	@JsonProperty("qty")
	private Integer qty;

	@JsonProperty("grQty")
	private Integer grQty;

	@JsonProperty("openQty")
	private Integer openQty;

	@JsonProperty("uom")
	private String uom;

	@JsonProperty("scheduledDate")
	private String scheduledDate;


}
