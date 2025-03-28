package com.effigo.shared.dto.external.v4;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExternalPRRequestItemsDtoV4 {

	@JsonProperty("ZBNFPO")
	public String requisitionItemId;

	@JsonProperty("ZMATNR")
	public String itemId;

	@JsonProperty("ZMAKTX")
	public String itemDescription;

	@JsonProperty("ZPUR_QTY")
	public String itemQuantity;

	@JsonProperty("ZUOM")
	public String itemUom;

	@JsonProperty("RLWRT")
	public String itemTotalPrice;

	@JsonProperty("ZVAL_PRICE")
	public String itemPrice;

	@JsonProperty("ZCURR")
	public String currency;

	@JsonProperty("ZCREATED_BY")
	public String createdBy;

	@JsonProperty("ZREQ_DT")
	public String createdDate;

	@JsonProperty("ZPSTYP")
	public String categoryId;

	@JsonProperty("ZZMAT_SUB")
	public String subCategoryId;

	////bottom are KBL request but not mapped

	@JsonProperty("ZSHORT_TEXT")
	public String shortText;

	@JsonProperty("ZSAL_ORD_NO")
	public String salesOrderNumber;

	@JsonProperty("ZSAL_ORD_ITEM")
	public String salesOrderItem;

	@JsonProperty("ZSECTOR")
	public String sector;

	@JsonProperty("ZPTEXT")
	public String itemCategoryDesc;

	@JsonProperty("ZFIXKZ")
	public String companyCode;

	@JsonProperty("ZNAME1")
	public String vendorName;

	@JsonProperty("ZINFO_VALID")
	public String isPurchasingInfoRecordValid;

	@JsonProperty("ZMATKL")
	public String materialGroup;

	@JsonProperty("ZWGBEZ")
	public String materialGroupDescription;

	@JsonProperty("ZZMAT_SUB_DESC")
	public String materialSubCategoryDesc;

	@JsonProperty("ZDISPO")
	public String mrpController;

	@JsonProperty("ZDSNAM")
	public String mrpControllerDesc;

	@JsonProperty("ZMTART")
	public String materialType;

	@JsonProperty("ZEKGRP")
	public String purchasingGroup;

	@JsonProperty("ZEKNAM")
	public String purchasingGroupDesc;

	//bottom are not KBL request fields and those are not mapped

	@JsonProperty("AUFNR")
	public String internalOrderNumber;

	@JsonProperty("ITEM_TEXT")
	public String itemText;

	@JsonProperty("PEINH")
	public String pricePerUnit;

	@JsonProperty("FRGDT")
	public String approvedDate;

	@JsonProperty("ANLN1")
	public String assetNumber;

	@JsonProperty("EBAKZ")
	public String closed;

	@JsonProperty("LOEKZ")
	public String itemStatus;

	@JsonProperty("MFRP")
	public String manufacturePartNumber;

	@JsonProperty("MFRNR")
	public String manufactureNumber;

	@JsonProperty("BMEIN")
	public String orderUnit;

	@JsonProperty("SERITEMS")
	public List<ExternalPRServiceItemsDtoV4> serviceItems;
}
