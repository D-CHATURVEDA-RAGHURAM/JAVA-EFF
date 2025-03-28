package com.effigo.shared.dto.external.v2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPriceInfoSheetServiceDtoV2 {

	@JsonProperty("EBELP")
	private String poItemId;

	@JsonProperty("EXTROW")
	private String lineNumber;

	@JsonProperty("DEL")
	private String deletionFlag;

	@JsonProperty("SRVPOS")
	private String serviceNumber;

	@JsonProperty("KTEXT1")
	private String shortText;

	@JsonProperty("MENGE")
	private String quantity;

	@JsonProperty("MEINS")
	private String uom;

	@JsonProperty("PEINH")
	private String priceUnit;

	@JsonProperty("BRTWR")
	private String grossPrice;

	@JsonProperty("NETWR")
	private String netPrice;

	@JsonProperty("cusField1")
	private String cusField1;

	@JsonProperty("cusField2")
	private String cusField2;

	@JsonProperty("cusField3")
	private String cusField3;

	@JsonProperty("cusField4")
	private String cusField4;

	@JsonProperty("cusField5")
	private String cusField5;

	@JsonProperty("cusField6")
	private String cusField6;

	@JsonProperty("cusField7")
	private String cusField7;

	@JsonProperty("cusField8")
	private String cusField8;

	@JsonProperty("cusField9")
	private String cusField9;

	@JsonProperty("cusField10")
	private String cusField10;

}
