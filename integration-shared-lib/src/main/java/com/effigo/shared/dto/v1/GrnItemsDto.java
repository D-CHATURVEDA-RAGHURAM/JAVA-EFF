package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GrnItemsDto {
	@JsonProperty("itemcode")
	private String itemCode;

	@JsonProperty("businessunit")
	private String businessUnit;

	@JsonProperty("movetype")
	private String moveType;

	@JsonProperty("receivedqty")
	private String receivedQty;

	@JsonProperty("quantity")
	private String quantity;

	@JsonProperty("uom")
	private String uom;

	@JsonProperty("uomiso")
	private String uomIso;

	@JsonProperty("poid")
	private String poId;

	@JsonProperty("poitemid")
	private String poItemId;

	@JsonProperty("createdby")
	private String createdBy;

	@JsonProperty("asnreferenceno")
	private String asnReferenceNo;

	@JsonProperty("location")
	private String location;

	@JsonProperty("batch")
	private String batch;

	@JsonProperty("proddate")
	private String prodDate;



	@JsonProperty("refdocyear")
	private String refDocYear;


	@JsonProperty("refdocit")
	private String refDocIt;

	@JsonProperty("shelflife")
	private String shelfLife;

	@JsonProperty("batchno")
	private String batchNo;

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