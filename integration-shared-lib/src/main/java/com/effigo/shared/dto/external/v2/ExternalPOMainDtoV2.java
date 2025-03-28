package com.effigo.shared.dto.external.v2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPOMainDtoV2 {
	@NotBlank(message = "{id.not-null}")
	@NotNull
	@JsonProperty("H_EBELN")
	public String poId;

	@JsonProperty("reqid")
	public String reqId;

	@NotBlank(message = "{vendorId.not-null}")
	@JsonProperty("H_LIFNR")
	public String vendorId;

	@JsonProperty("billingaddressid")
	public String billingAddressId;

	@JsonProperty("deliveryaddress")
	public String deliveryAddress;

	@JsonProperty("vendoraddressid")
	public String vendorAddressId;

	@JsonProperty("H_BSART")
	public String poType;

	@JsonProperty("H_EKGRP")
	public String purchaseCenterId;

	@JsonProperty("H_EKORG")
	public String businessPlace;


	@JsonProperty("H_WAERS")
	public String currency;

	@JsonProperty("PLANT")
	public String orgCode;

	@NotNull
	@JsonProperty("H_ERNAM")
	public String createdBy;

	@NotNull
	@JsonProperty("H_AEDAT") // CURRENT DATE
	public String createdDate;

	@JsonProperty("approveddate") // CURRENT DATE
	public String approvedDate;

	@JsonProperty("PO_AMT")
	public String actualPoPrice;

	@JsonProperty("H_ZTERM")
	public String paymentTerm;

	@JsonProperty("H_BSTYP")
	public String poCategory;

	@JsonProperty("H_INCO1")
	public String incoTerms;

	@JsonProperty("H_INCO2")
	public String incoTerms2;

	@JsonProperty("BEDAT")
	public String validityDate;

	@JsonProperty("H_KDATB")
	public String validityStartDate;

	@JsonProperty("H_KDATE")
	public String validityEndDate;


	@JsonProperty("H_EKOTX")
	public String purchaseOrgDescription;



	@JsonProperty("POITEMS")
	public List<ExternalPOItemDtoV2> poItems;


	@JsonProperty("SCHEDULE_ITEM")
	public List<ExternalPODelivaryScheduleDtoV2> schedulePoItems;

	@JsonProperty("AMENDMENT")
	public List<ExternalPOItemPriceHistoryDtoV2> scheduleAmendments;

	@JsonProperty("SERVICE_ITEM")
	public List<ExternalPoItemServiceDtoV2> serviceItems;

	@JsonProperty("text3")
	private String text3;


	@JsonProperty("text4")
	private String text4;


	@JsonProperty("text5")
	private String text5;

	@JsonProperty("SOURCING_EMAIL")
	private String sourcingEmail;


}
