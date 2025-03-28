package com.effigo.shared.dto.external.v2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPriceInfoSheetItemDtoV2 {

	@JsonProperty("EBELP")
	private String poItemId;

	@JsonProperty("LOEKZ")
	private String deletionFlag;

	@JsonProperty("TXZ01")
	private String longText;

	@JsonProperty("MATNR")
	private String materialNumber;

	@JsonProperty("WERKS")
	private String plant;

	@JsonProperty("LGORT")
	private String storageLocation;

	@JsonProperty("BEDNR")
	private String trackingNumber;

	@JsonProperty("MATKL")
	private String materialGrp;

	@JsonProperty("MENGE")
	private String qty;

	@JsonProperty("MEINS")
	private String uom;

	@JsonProperty("NETPR")
	private BigDecimal netPrice;

	@JsonProperty("PEINH")
	private String priceUnit;

	@JsonProperty("NETWR")
	private String netOrder;

	@JsonProperty("BRTWR")
	private String grossOrder;

	@JsonProperty("TAX_CODE")
	private String taxCode;

	@JsonProperty("SGST_PERCENT")
	private String sGst;

	@JsonProperty("CGST_PERCENT")
	private BigDecimal cGst;

	@JsonProperty("IGST_PERCENT")
	private BigDecimal iGst;

	@JsonProperty("UGST_PERCENT")
	private String uGst;

	@JsonProperty("TRANSPORT_COST")
	private String freight;

	@JsonProperty("BANFN")
	private String prNumber;

	@JsonProperty("BNFPO")
	private String prItemId;

	@JsonProperty("HSN_SAC_CODE")
	private String hasnCode;




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

	@JsonProperty("SERITEMS")
	private List<ExternalPriceInfoSheetServiceDtoV2> serviceItems;

}
