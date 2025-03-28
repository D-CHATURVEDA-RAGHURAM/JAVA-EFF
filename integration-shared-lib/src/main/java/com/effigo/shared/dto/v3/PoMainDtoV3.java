package com.effigo.shared.dto.v3;

import com.effigo.shared.dto.v2.POItemDtoV2;
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
public class PoMainDtoV3 {
	@NotBlank(message = "{id.not-null}")
	@NotNull
	//@ErrorCode(message="400002")
	@JsonProperty("poid")
	public String poId;

	@JsonProperty("reqid")
	public String reqId;
	@NotBlank(message = "{vendorId.not-null}")
	//@ErrorCode(message="400004")

	@JsonProperty("vendorid")
	public String vendorId;

	@JsonProperty("billingaddressid")
	public String billingAddressId;

	@JsonProperty("deliveryaddress")
	public String deliveryAddress;

	@JsonProperty("vendoraddressid")
	public String vendorAddressId;

	//check
	@JsonProperty("supplierstate")
	public String supplierState;

	@JsonProperty("directpo")
	public String directpo;

	@JsonProperty("reqcreatedby")
	public String reqCreatedBy;

	//////////////////////////

	@JsonProperty("potype")
	public String poType;

	@JsonProperty("purchasecenter")
	public String purchaseCenterId;

	@JsonProperty("currency")
	public String currency;

	@JsonProperty("orgCode")
	public String orgCode;

	@NotNull
	@JsonProperty("createdby")
	public String createdBy;

	@NotNull
	@JsonProperty("createddate")
	public String createdDate;

	@JsonProperty("approveddate")
	public String approvedDate;

	@JsonProperty("closeddate")
	public String closedDate;

	@JsonProperty("inspection")
	public String inspection;

	//check
	@JsonProperty("pricechange")
	public String priceChange;

	@JsonProperty("sailentfeatures")
	public String sailentFeatures;

	@JsonProperty("deliveryterms")
	public String deliveryTerms;

	@JsonProperty("priority")
	public String priority;

	@JsonProperty("poamt")
	public String actualPoPrice;

	@JsonProperty("paymentterm")
	public String paymentTerm;

	@JsonProperty("version")
	public String version;

	@JsonProperty("incoterms")
	public String incoTerms;

	@JsonProperty("conversionrate")
	public String conversionRate;

	@JsonProperty("project")
	public String project;

	@JsonProperty("podocname")
	public String poDocName;

	//Check
	@JsonProperty("amendrefno")
	public String amendRefNo;

	@JsonProperty("advanceamt")
	public String advanceAmt;

	@JsonProperty("potitle")
	public String poTitle;

	@JsonProperty("text2")
	public String text2;

	@JsonProperty("text3")
	public String text3;

	@JsonProperty("text4")
	public String text4;

	@JsonProperty("text5")
	public String text5;

	@JsonProperty("headertext")
	public String headerText;

	@JsonProperty("headernote")
	public String headerNote;

	@JsonProperty("pricingtype")
	public String pricingType;

	@JsonProperty("deadlines")
	public String deadLines;

	@JsonProperty("validityDate")
	public String validityDate;

	@JsonProperty("validityStartDate")
	public String validityStartDate;

	@JsonProperty("validityEndDate")
	public String validityEndDate;

	@JsonProperty("incoTerms2")
	public String incoTerms2;

	@JsonProperty("poCategory")
	public String poCategory;

	@JsonProperty("businessPlace")
	public String businessPlace;

	@JsonProperty("poitem")
	public POItemDtoV2 poItem;

}
