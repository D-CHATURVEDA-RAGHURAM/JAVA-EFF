package com.effigo.shared.dto.external.v4;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPRInboundRequisitionDtoV4 {

	@JsonProperty("ZBANFN")
	public String requisitionId;

	@JsonProperty("ZPLANT")
	public String businessUnit;

	@JsonProperty("ZBNFPO")
	public String requisitionItemId;

	@JsonProperty("ZMATNR")
	public String itemId;

	@JsonProperty("ZMAKTX")
	public String itemDescription;

	@JsonProperty("ZSHORT_TEXT")
	public String shortText;

	@JsonProperty("ZPUR_QTY")
	public String itemQuantity;

	@JsonProperty("ZUOM")
	public String itemUom;

	@JsonProperty("ZVAL_PRICE")
	public String itemTotalPrice;

	@JsonProperty("ZSAL_ORD_NO")
	public String salesOrderNumber;

	@JsonProperty("ZSAL_ORD_ITEM")
	public String salesOrderItem;

	@JsonProperty("ZCURR")
	public String currency;

	@JsonProperty("ZCREATED_BY")
	public String createdBy;

	@JsonProperty("ZREQ_DT")
	public String createdDate;

	@JsonProperty("ZSECTOR")
	public String sector;

	@JsonProperty("ZPSTYP")
	public String categoryId;

	@JsonProperty("ZPTEXT")
	public String itemCategoryDesc;

	@JsonProperty("ZFIXKZ")
	public String companyCode;

	@JsonProperty("ZNAME1")
	public String vendorName;

	@JsonProperty("ZINFO_VALID")
	public String purchasingInfoRecordValid;

	@JsonProperty("ZMATKL")
	public String materialGroup;

	@JsonProperty("ZWGBEZ")
	public String materialGroupDescription;

	@JsonProperty("ZZMAT_SUB")
	public String subCategoryId;

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

	@JsonProperty("ZEXTROW")
	public String serviceItemId;

	@JsonProperty("ZSRVPOS")
	public String serviceCode;

	@JsonProperty("ZKTEXT1")
	public String servDescription;

	@JsonProperty("ZMENGE_SER")
	public String servItemQuantity;

	@JsonProperty("ZTBTWR")
	public String servItemPrice;

	@JsonProperty("ZMEINS_SER")
	public String servItemUom;

	@JsonProperty("ZERNAM")
	public String servCreatedBy;

	@JsonProperty("ZEBELN")
	private String customField1;

	@JsonProperty("ZEBELP")
	private String customField2;

	@JsonProperty("ZBEDAT")
	private String customField3;

	@JsonProperty("ZBSMNG")
	private String customField4;

	@JsonProperty("ZFRGZU")
	private String customField5;

	@JsonProperty("ZLFDAT")
	private String customField6;

	@JsonProperty("ZBSART")
	private String customField7;

	@JsonProperty("customField8")
	private String customField8;

	@JsonProperty("customField9")
	private String customField9;

	@JsonProperty("customField10")
	private String customField10;
	@JsonProperty("ZZEINR")
	private String drawingNo;

	@JsonProperty("ZZEIVR")
	private String revisionNo;
	@JsonProperty("ZSLA")
	private String sourceListAvailable;
	@JsonProperty("ZVDATUF")
	private String sourceListValidFrom;
	@JsonProperty("ZBDATUT")
	private String sourceListValidTo;
	private String salesTaxCode;
}
