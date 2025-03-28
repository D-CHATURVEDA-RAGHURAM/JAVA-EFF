package com.effigo.shared.dto.external.v2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExternalPODelivaryScheduleDtoV2 {
	@JsonProperty("SCH_EBELN")
	private String poId;

	@JsonProperty("SCH_EBELP")
	private String poItemId;

	@JsonProperty("SCH_ETENR")
	private String scheduleLine;

	@JsonProperty("SCH_BANFN")
	private String reqId;

	@JsonProperty("SCH_BNFPO")
	private String purReqId;

	@JsonProperty("requireddate")
	private String requiredDate;

	@JsonProperty("SCH_MENGE")
	private Double qty;

	@JsonProperty("SCH_WEMNG")
	private Double grQty;

	@JsonProperty("SCH_OBEMG")
	private Double openQty;

	@JsonProperty("MEINS")
	private String uom;

	@JsonProperty("SCH_EINDT")
	private String scheduledDate;

}
