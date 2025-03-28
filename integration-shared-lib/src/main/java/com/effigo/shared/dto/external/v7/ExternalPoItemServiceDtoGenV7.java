package com.effigo.shared.dto.external.v7;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExternalPoItemServiceDtoGenV7 {

	@JsonProperty("packageNumber")
	private String packageNumber;

	@JsonProperty("status")
	private String status;

	@JsonProperty("line")
	private String line;

	@JsonProperty("lineNumber")
	private String lineNumber;

	@JsonProperty("activityNumber")
	private String activityNumber;

	@JsonProperty("itemCode")
	private String itemId;

	@JsonProperty("itemQty")
	private String itemQty; //item_quantity

	@JsonProperty("usedQty")
	private String usedQty;

	@JsonProperty("openQty")
	public String openQty;

	@JsonProperty("qcApplicable")
	public String qcApplicable;

	@JsonProperty("otherCharges")
	public String otherCharges;

	@JsonProperty("uom")
	private String uom; //item_uom
	@JsonProperty("itemPrice")
	private String itemPrice; //item_price
	@JsonProperty("subPackage")
	private String subPackage;
	@JsonProperty("grossPrice")
	private String grossPrice;
	@JsonProperty("shortText")
	private String shortText;
	@JsonProperty("userField")
	private String userField;
	@JsonProperty("I")
	private String iField;
	@JsonProperty("P")
	private String pField;


}
