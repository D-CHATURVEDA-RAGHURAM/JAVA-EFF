package com.effigo.shared.dto.external.v7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPOItemDtoV7 {

	@JsonProperty("I_EBELP")
	public String poItmId;

	@JsonProperty("I_EBELN")
	public String poId;

	@JsonProperty("I_MATNR")
	public String itemCode;

	@JsonProperty("I_EMATN")
	private String materialMpn;

	@JsonProperty("I_MFRPN")
	private String partNumber;

	@JsonProperty("I_MFRNR")
	private String manufacturerNumber;

	@JsonProperty("I_MAKTX")
	public String description;

	@JsonProperty("I_MENGE")
	public String qty;

	@JsonProperty("I_MEINS")
	public String uom;

	@JsonProperty("I_NETPR")
	public String price;

	@JsonProperty("costcenter")
	public String costCenter;

	@JsonProperty("I_PEINH")
	public String uomQuantity;

	@JsonProperty("I_BPRME")
	public String uom2;

	@JsonProperty("I_IGST_PER")
	public String IgstPer;

	@JsonProperty("I_SGST_PER")
	public String sgstPer;

	@JsonProperty("I_CGST_PER")
	public String cgstPer;

	@JsonProperty("I_UTGST_PER")
	public String utgstPer;

	@JsonProperty("I_CESS_PER")
	public String cessPer;

	@JsonProperty("I_P_F_PER")
	public String pfPer;

	@JsonProperty("I_DISC_PER")
	public String discPer;

	@JsonProperty("I_ITEM_AMT")
	public String itemAmt;

	@JsonProperty("I_GROSS_AMT")
	public String grossAmt;

	@JsonProperty("I_TOTAL_AMT")
	public String totalAmt;

	@JsonProperty("I_OTHER_AMT")
	public String otherAmt;

	@JsonProperty("I_LEWED")
	public String itemValidityDate;

	@JsonProperty("I_ELIKZ")
	public String deliveryCompletionStatus;

	@JsonProperty("I_LOEKZ")
	public String itemStatus;

	@JsonProperty("I_LGORT")
	private String storageLocation;

	@JsonProperty("I_BANFN")
	private String reqId;

	@JsonProperty("I_BNFPO")
	private String purReqId;

	@JsonProperty("FREIGHT")
	public String freight;

	@JsonProperty("I_EINDT")
	public String deliveryDate;

	@JsonProperty("PRICEDETAILS")
	public List<PoPriceTemplateStructureDtoV7> poPriceTemplateStructureDtoV7s;

	@JsonProperty("POSCHEDULEITEMS")
	public List<ExternalPODelivaryScheduleDtoV7> externalPODelivaryScheduleDtoV7s;

}
