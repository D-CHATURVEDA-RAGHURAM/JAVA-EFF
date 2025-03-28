package com.effigo.shared.dto.external.v7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalThermaxSupPartyMasterReqDtoV7 {

	@JsonProperty("PartyIDs")
	private ExternalPartyIDsReqDtoV7 partyIDs;

	@JsonProperty("Name")
	private String name;

	@JsonProperty("DUNSID")
	private String dunsId;

	@JsonProperty("Language")
	private String language;

	@JsonProperty("Location")
	private ExternalLocationReqDtoV7 location;

	@JsonProperty("Currency")
	private String currency;

	@JsonProperty("PANNumber")
	private String panNumber;

	@JsonProperty("TaxCategory")
	private String taxCategory;

	@JsonProperty("GSTINNumber")
	private String gstinNumber;

	@JsonProperty("ESIC")
	private String esic;

	@JsonProperty("ExciseDiv")
	private String exciseDiv;

	@JsonProperty("ExciseRange")
	private String exciseRange;

	@JsonProperty("MSMED")
	private String msmed;

	@JsonProperty("MSMEDReceiptDateTime")
	private String msmedReceiptDateTime;

	@JsonProperty("Area")
	private String area;

	@JsonProperty("BusinessPartnerType")
	private String businessPartnerType;

	@JsonProperty("LineOfBusiness")
	private String lineOfBusiness;

	@JsonProperty("DeliveryTerms")
	private String deliveryTerms;

	@JsonProperty("Carrier")
	private String carrier;

	@JsonProperty("BPSendsASN")
	private String bpSendsASN;

	@JsonProperty("Inspection")
	private String inspection;

	@JsonProperty("PaymentTerms")
	private String paymentTerms;

	@JsonProperty("PaymentTermsCreditNote")
	private String paymentTermsCreditNote;

	@JsonProperty("PaymentMethod")
	private String paymentMethod;

	@JsonProperty("PaymentMethodCreditNote")
	private String paymentMethodCreditNote;

	@JsonProperty("BPTaxClassification")
	private String bpTaxClasfication;

	@JsonProperty("FinancialSupplierGroup")
	private String financialSupplierGroup;

	@JsonProperty("SupplierThermax")
	private String supplierThermax;

	@JsonProperty("LocationCode")
	private String locationCode;

	@JsonProperty("ThermaxLocation")
	private String thermaxLocation;

	@JsonProperty("EffigoSupplierID")
	private String effigoSupplierId;


	@JsonProperty("Status")
	private ExternalStatusReqDtoV7 externalStatusReqDtoV7;

	@JsonProperty("Note")
	private String note;

	@JsonProperty("FinancialAccount")
	private ExternalFinAccReqDtoV7 FinancialAccount;

	@JsonProperty("GSTIN_Unregistered")
	private String  gstinUnregistered;

	@JsonProperty("GSTIN_Composition")
	private String  gstinComposition;

	@JsonProperty("GSTIN_SEZUnit")
	private String  gstinSezUnit;

}
