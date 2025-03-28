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
public class ExternalGrnQualityRejectDtoGenV5 implements Serializable {

	private static final long serialVersionUID = -8522244983130764048L;

	@JsonProperty("poId")
	private String poId;

	@JsonProperty("poItemId")
	private String poItemId;

	@JsonProperty("invoiceDate")
	private String invoiceDate;

	@JsonProperty("grnId")
	private String grnId;

	@JsonProperty("matDocYear")
	public String matDocYear;

	@JsonProperty("grnItemId")
	private String grnItemId;

	@JsonProperty("postingDate")
	private String postingDate;

	@JsonProperty("invoice")
	private String invoice;

	@JsonProperty("rejectedQuantity")
	private String rejectedQuantity;

	@JsonProperty("grnAmount")
	private String grnAmount;

	@JsonProperty("itemPrice")
	private String itemPrice;

	@JsonProperty("movementTypeText")
	private String movementTypeText;

	@JsonProperty("movementType")
	private String movementType;

	@JsonProperty("currency")
	private String currency;

	@JsonProperty("plantName")
	private String plantName;

	@JsonProperty("plant")
	private String plant;

	@JsonProperty("itemId")
	private String itemId;

	@JsonProperty("itemCategoryDescription")
	private String itemCategoryDescription;

	@JsonProperty("itemText")
	private String itemText;

	@JsonProperty("materialDescription")
	private String materialDescription;

	@JsonProperty("purchasingDocumentType")
	private String purchasingDocumentType;

	@JsonProperty("vendor")
	private String vendor;

	@JsonProperty("vendorCategoryDescription")
	private String vendorCategoryDescription;

	@JsonProperty("vendorName")
	private String vendorName;

	@JsonProperty("schemaGroupDesc")
	private String schemaGroupDesc;

	@JsonProperty("materialGroup")
	private String materialGroup;

	@JsonProperty("materialGroupDesc")
	private String materialGroupDesc;

	@JsonProperty("salesOrder")
	private String salesOrder;

	@JsonProperty("salesOrderItem")
	private String salesOrderItem;

	@JsonProperty("originalMatDocNo")
	private String originalMatDocNo;
}
