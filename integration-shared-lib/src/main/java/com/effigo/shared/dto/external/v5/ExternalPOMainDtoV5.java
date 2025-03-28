package com.effigo.shared.dto.external.v5;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPOMainDtoV5 {
	@NotNull
	@JsonProperty("ZAEDAT")
	private String createdDate;

	@NotBlank(message = "{id.not-null}")
	@NotNull
	@JsonProperty("ZEBELN")
	private String poId;

	@JsonProperty("ZEBELP")
	private String poItmId;

	@JsonProperty("ZMATNR")
	private String itemCode;

	@JsonProperty("ZTXZ01")
	private String description;

	@NotBlank(message = "{vendorId.not-null}")
	@JsonProperty("ZLIFNR")
	private String vendorId;

	@JsonProperty("ZFRGZU")
	private String releaseState;

	@JsonProperty("ZEKGRP")
	private String purchaseCenterId;

	@JsonProperty("ZMATKL")
	private String materialGroup;

	@JsonProperty("ZWGBEZ")
	private String materialGroupDesc;

	@JsonProperty("ZNETPR")
	private String itemAmt;

	@JsonProperty("ZMENGE")
	private String qty;

	@JsonProperty("ZDEL_QTY")
	private String uomQuantity;

	@JsonProperty("ZMEINS")
	private String uom;

	@JsonProperty("ZWAERS")
	private String currency;

	@JsonProperty("ZEINDT")
	private String deliveryDate;

	@JsonProperty("ZAMT_INV")
	private String otherAmt;

	@JsonProperty("ZVBELN")
	private String salesOrder;

	@JsonProperty("ZVBELP")
	private String salesOrderItem;

	@JsonProperty("ZZMAT_SUB")
	private String subCategory;

	@JsonProperty("ZMAKTX")
	private String materialDes;

	@JsonProperty("ZBSART")
	public String poType;

	@JsonProperty("ZBATXT")
	private String poTypeDesc;

	@JsonProperty("ZKALSB")
	private String vendorSchemaDesc;

	@JsonProperty("ZEXTROW")
	private String serviceItemNumber;

	@JsonProperty("ZSRVPOS")
	private String serviceItemCode;

	@JsonProperty("ZKTEXT1")
	private String description2;

	@JsonProperty("ZMENGE_SER")
	private String serviceQty;

	@JsonProperty("ZTBTWR")
	private String servicePrice;

	@JsonProperty("ZMEINS_SER")
	private String serviceUom;

	@JsonProperty("ZERNAM")
	private @NotNull String createdBy;

	@JsonProperty("ZWERKS")
	private String orgCode;

	@JsonProperty("ZZEIVR")
	private String revisionNo;
	@JsonProperty("ZZEINR")
	private String drawingNo;

	@JsonProperty("ZBANFN")
	private String prNo;
	@JsonProperty("ZBNFPO")
	private String prItem;
	@JsonProperty("ZREL_STATUS")
	private String poReleaseStatus;
}
