package com.effigo.shared.dto.external.v2;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ExternalPRServiceItemsDtoV2 {
	@JsonProperty("SRVPOS")
	public String serviceCode;

	@JsonProperty("EXTROW")
	public String serviceItemId;

	@JsonProperty("MENGE")
	public String servItemQuantity;

	@JsonProperty("MEINS")
	public String servItemUom;

	@JsonProperty("TBTWR")
	public String servItemPrice;

	@JsonProperty("NETWR")
	public String servNetPrice;

	@JsonProperty("KTEXT1")
	public String servDescription2;

	@JsonProperty("USERF1_TXT")
	public String servDescription;

	@JsonProperty("INTROW")
	public String customField1;

	@JsonProperty("customField2")
	public String customField2;

	@JsonProperty("customField3")
	public String customField3;

	@JsonProperty("customField4")
	public String customField4;
}
