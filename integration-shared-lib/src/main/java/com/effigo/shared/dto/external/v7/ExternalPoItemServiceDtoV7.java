package com.effigo.shared.dto.external.v7;

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
public class ExternalPoItemServiceDtoV7 {

	@JsonProperty("SRV_EBELN")
	private String poId;
	@JsonProperty("SRV_EBELP")
	private String poItemNumber;
	@JsonProperty("SRV_EXTROW")
	private String serviceItemNumber;
	@JsonProperty("SRV_PACKNO")
	private String packNumber;
	@JsonProperty("SRV_DEL")
	private String deleteStatus;
	@JsonProperty("SRV_MENGE")
	private String qty;
	@JsonProperty("SRV_MEINS")
	private String uom;
	@JsonProperty("SRV_PEINH")
	private String itemPricePer; //uomQty
	@JsonProperty("SRV_TBTWR")
	private String price;

	@JsonProperty("SRV_KTEXT1")
	private String description;
	@JsonProperty("SRV_USERF1_TXT")
	private String description2;

	@JsonProperty("SRV_PACKNO_1")
	private String packNumber1;
	@JsonProperty("SRV_INTROW")
	private String lineNumber;

	@JsonProperty("SRV_SRVPOS")
	private String itemCode;
	@JsonProperty("SRV_SUB_PACKNO")
	private String subPackage;
	@JsonProperty("SRV_PLN_PACKNO")
	private String plnPackageNUmber; //default i
	@JsonProperty("SRV_PLN_INTROW")
	private String plnIntro; // default 1

}
