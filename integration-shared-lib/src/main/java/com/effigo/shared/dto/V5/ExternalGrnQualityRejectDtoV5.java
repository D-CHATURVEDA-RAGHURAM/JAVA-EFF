package com.effigo.shared.dto.V5;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalGrnQualityRejectDtoV5 implements Serializable {

	private static final long serialVersionUID = -8522244983130764048L;

	@JsonProperty("ZEBELN")
	private String poId;
	@JsonProperty("ZEBELP")
	private String poItemId;
	@JsonProperty("ZBLDAT")
	private String invoiceDate;
	@JsonProperty("ZMBLNR")
	private String grnId;
	@JsonProperty("ZMJAHR")
	public String matDocYear;
	@JsonProperty("ZEILE")
	private String grnItemId;
	@JsonProperty("ZBUDAT")
	private String postingDate;
	@JsonProperty("ZXBLNR")
	private String invoice;
	@JsonProperty("ZERFMG")
	private String rejectedQuantity;
	@JsonProperty("ZNETPR")
	private String grnAmount;
	@JsonProperty("ZDMBTR")
	private String itemPrice;
	@JsonProperty("ZBTEXT")
	private String movementTypeText;
	@JsonProperty("ZBWART")
	private String movementType;
	@JsonProperty("ZWAERS")
	private String currency;
	@JsonProperty("ZNAME1")
	private String plantName;
	@JsonProperty("ZWERKS")
	private String plant;
	@JsonProperty("ZMATNR")
	private String itemId;
	@JsonProperty("ZPTEXT")
	private String itemCategoryDescription;
	@JsonProperty("ZSGTXT")
	private String itemText;
	@JsonProperty("ZMAKTX")
	private String materialDescription;
	@JsonProperty("ZBSART")
	private String purchasingDocumentType;
	@JsonProperty("ZLIFNR")
	private String vendor;
	@JsonProperty("ZKTOKK")
	private String vendorCategoryDescription;
	@JsonProperty("ZNAME1_VENDOR")
	private String vendorName;
	@JsonProperty("ZKALSB")
	private String schemaGroupDesc;
	@JsonProperty("ZMATKL")
	private String materialGroup;
	@JsonProperty("ZWGBEZ")
	private String materialGroupDesc;
	@JsonProperty("ZKDAUF")
	private String salesOrder;
	@JsonProperty("ZKDPOS")
	private String salesOrderItem;
	@JsonProperty("ZLFBNR")
	private String originalMatDocNo;
}
