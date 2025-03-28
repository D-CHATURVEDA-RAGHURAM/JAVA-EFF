package com.effigo.shared.dto.internal.v2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceInfoOutboundRequestDtoV2 {

	@JsonProperty("vendorAccNumber")
	private String vendorAccNumber;

	@JsonProperty("materialNumber")
	private String materialNumber;

	@JsonProperty("purchaseOrg")
	private String purchaseOrg;

	@JsonProperty("plant")
	private String plant;

	@JsonProperty("standardInfoRecInd")
	private String standardInfoRecInd;

	@JsonProperty("poUom")
	private String poUom;

	@JsonProperty("numeratorConversion")
	private BigDecimal numeratorConversion;

	@JsonProperty("denominatorConversion")
	private BigDecimal denominatorConversion;

	@JsonProperty("plannedDeliveryDays")
	private String plannedDeliveryDays;

	@JsonProperty("purchaseGrp")
	private String purchaseGrp;

	@JsonProperty("poQty")
	private BigDecimal poQty;

	@JsonProperty("grInvoiceInd")
	private String grInvoiceInd;

	@JsonProperty("salesCode")
	private String salesCode;

	@JsonProperty("currency")
	private String currency;

	@JsonProperty("priceUnit")
	private String priceUnit;

	@JsonProperty("orderPriceUnit")
	private String orderPriceUnit;

	@JsonProperty("numConvPriceUnit")
	private BigDecimal numConvPriceUnit;

	@JsonProperty("denoConvPriceUnit")
	private BigDecimal denoConvPriceUnit;

	@JsonProperty("incoTerms1")
	private String incoTerms1;

	@JsonProperty("incoTermsLoc")
	private String incoTermsLoc;

	@JsonProperty("longText")
	private String longText;

	@JsonProperty("validityStartDate")
	private String validityStartDate;

	@JsonProperty("validityEndDate")
	private String validityEndDate;

	@JsonProperty("condType")
	private String condType;

	@JsonProperty("netPrice")
	private BigDecimal netPrice;

	@JsonProperty("currencyKey")
	private String currencyKey;

	@JsonProperty("priceUnit1")
	private String priceUnit1;

	@JsonProperty("orderPriceUnit1")
	private String orderPriceUnit1;

	@JsonProperty("awardRecommendationId")
	private String awardRecommendationId;

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

	@JsonProperty("cusField11")
	private String cusField11;

	@JsonProperty("cusField12")
	private String cusField12;

	@JsonProperty("cusField13")
	private String cusField13;

	@JsonProperty("cusField14")
	private String cusField14;

	@JsonProperty("cusField15")
	private String cusField15;

	@JsonProperty("cusField16")
	private String cusField16;

	@JsonProperty("cusField17")
	private String cusField17;

	@JsonProperty("cusField18")
	private String cusField18;

	@JsonProperty("cusField19")
	private String cusField19;

	@JsonProperty("cusField20")
	private String cusField20;

	@JsonProperty("cusField21")
	private String cusField21;

	@JsonProperty("cusField22")
	private String cusField22;

	@JsonProperty("cusField23")
	private String cusField23;

	@JsonProperty("cusField24")
	private String cusField24;

	@JsonProperty("cusField25")
	private String cusField25;

	@JsonProperty("cusField26")
	private String cusField26;

	@JsonProperty("cusField27")
	private String cusField27;

	@JsonProperty("cusField28")
	private String cusField28;

	@JsonProperty("cusField29")
	private String cusField29;

	@JsonProperty("cusField30")
	private String cusField30;

	@JsonProperty("cusField31")
	private String cusField31;

	@JsonProperty("cusField32")
	private String cusField32;

	@JsonProperty("cusField33")
	private String cusField33;

	@JsonProperty("cusField34")
	private String cusField34;

	@JsonProperty("cusField35")
	private String cusField35;

	@JsonProperty("cusField36")
	private String cusField36;

	@JsonProperty("cusField37")
	private String cusField37;

	@JsonProperty("cusField38")
	private String cusField38;

	@JsonProperty("cusField39")
	private String cusField39;

	@JsonProperty("cusField40")
	private String cusField40;

	@JsonProperty("cus_field_41")
	private String cusField41;

	@JsonProperty("cus_field_42")
	private String cusField42;

	@JsonProperty("cus_field_43")
	private String cusField43;

	@JsonProperty("cus_field_44")
	private String cusField44;

	@JsonProperty("cus_field_45")
	private String cusField45;

	@JsonProperty("cus_field_46")
	private String cusField46;

	@JsonProperty("cus_field_47")
	private String cusField47;

	@JsonProperty("cus_field_48")
	private String cusField48;

	@JsonProperty("cus_field_49")
	private String cusField49;

	@JsonProperty("cus_field_50")
	private String cusField50;

	@JsonProperty("cus_field_51")
	private String cusField51;

	@JsonProperty("cus_field_52")
	private String cusField52;

	@JsonProperty("cus_field_53")
	private String cusField53;

	@JsonProperty("cus_field_54")
	private String cusField54;

	@JsonProperty("cus_field_55")
	private String cusField55;

	@JsonProperty("cus_field_56")
	private String cusField56;

	@JsonProperty("cus_field_57")
	private String cusField57;

	@JsonProperty("cus_field_58")
	private String cusField58;

	@JsonProperty("cus_field_59")
	private String cusField59;

	@JsonProperty("cus_field_60")
	private String cusField60;

}
