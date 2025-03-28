package com.effigo.shared.dto.external.v8;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExternalPoItemServiceDtoV8 {
//	@JsonProperty("SRV_EBELN")
//	private String poId;
//	@JsonProperty("SRV_EBELP")
//	private String poItemNumber;
//	@JsonProperty("SRV_EXTROW")
//	private String serviceItemNumber;

	//using --------------------------------------

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

	//------------------------------------

//	@JsonProperty("SRV_TBTWR")
//	private String price;
//	@JsonProperty("SRV_KTEXT1")
//	private String description;
//	@JsonProperty("SRV_USERF1_TXT")
//	private String description2;
//	@JsonProperty("SRV_PACKNO_1")
//	private String packNumber1;
//	@JsonProperty("SRV_INTROW")
//	private String lineNumber;
//	@JsonProperty("SRV_SRVPOS")
//	private String itemCode;
//	@JsonProperty("SRV_PLN_PACKNO")
//	private String plnPackageNUmber; //default i
//	@JsonProperty("SRV_PLN_INTROW")
//	private String plnIntro; // default 1


}
