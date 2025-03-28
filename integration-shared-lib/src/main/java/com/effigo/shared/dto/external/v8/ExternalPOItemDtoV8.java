package com.effigo.shared.dto.external.v8;

import com.effigo.shared.dto.external.v2.ExternalPODelivaryScheduleDtoV2;
import com.effigo.shared.dto.v2.PoPriceTemplateStructureDtoV2;
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
public class ExternalPOItemDtoV8 {
    
	@JsonProperty("poItemId")
    public String poItemId;
	
	@JsonProperty("itemCode")
    public String itemCode;

	@JsonProperty("itemType")
	public Integer itemType; //line type

	@JsonProperty("materialMPN")
	private String materialMpn;

	@JsonProperty("manufacturerNumber")
	private String manufacturerNumber;

	@JsonProperty("manufacturerPartNumber")
	private String manufacturerPartNumber;

	@JsonProperty("materialDescription")
    public String materialDescription;

	@JsonProperty("materialDescriptionLong")
	public String materialDescriptionLong;
	
	@JsonProperty("itemQty")
    public String itemQty;

	@JsonProperty("openQty")
	public String openQty;

	@JsonProperty("usedQty")
	private String usedQty;

	@JsonProperty("taxVal")
	public String taxVal;

	@JsonProperty("otherCharges")
	public String otherCharges;

	@JsonProperty("compType")
	public Integer compType;

	@JsonProperty("calcOn")
	public String calcOn;

	@JsonProperty("calcType")
	public Integer calcType;

	@JsonProperty("priceIndex")
	public Integer priceIndex;

	@JsonProperty("calcValue")
	private String rowCalcTax;

	@JsonProperty("rowCalcTotal")
	private String rowCalcTotal;

	@JsonProperty("projectCode")
	private String projectCode;

	@JsonProperty("wbsCode")
	private String wbsCode;

	@JsonProperty("toleranceVal")
	private String toleranceVal; //qty/amt

	@JsonProperty("toleranceCompType")
	private Integer toleranceCompType; //val/%

	@JsonProperty("toleranceCalcType")
	private Integer toleranceCalcType;  //add/sub

	@JsonProperty("hsnCode")
	public String hsnCode;
	
	@JsonProperty("uom")
    public String uom;

	@JsonProperty("itemPrice")
    public String itemPrice;

	@JsonProperty("grossPrice")
	private String grossPrice;

	@JsonProperty("storageLocation")
	private String storageLocation;

	@JsonProperty("reqId")
	private String reqId; //req id

	@JsonProperty("requisitionItemId")
	private String requisitionItemId; //req item id

	@JsonProperty("status")
	public String status;

	@JsonProperty("deliveryDate")
	public String deliveryDate;

	@JsonProperty("deliveryCompletionStatus")
	public String deliveryCompletionStatus;

	@JsonProperty("inspectionApplicable")
	public String inspectionApplicable;

	@JsonProperty("distributionNumber")
	public String distributionNumber;

	@JsonProperty("shipmentNumber")
	public String shipmentNumber;

	@JsonProperty("receiptRouting")
	public String receiptRouting;

	@JsonProperty("grProcessingTime")
	public String grProcessingTime;

	@JsonProperty("serviceHeaderStatus")
	private Integer serviceHeaderStatus;

	@JsonProperty("qcApplicable")
	public String qcApplicable;

	@JsonProperty("customField1")
	public String customField1;
	@JsonProperty("customField2")
	public String customField2;
	@JsonProperty("customField3")
	public String customField3;
	@JsonProperty("customField4")
	public String customField4;

	@JsonProperty("customField7")
	public String customField7;
	@JsonProperty("customField8")
	public String customField8;
	@JsonProperty("customField9")
	public String customField9;
	@JsonProperty("customField10")
	public String customField10;
	@JsonProperty("customField11")
	public String customField11;

	@JsonProperty("SERVICE_ITEMS")
	public List<ExternalPoItemServiceDtoV8> poItemServiceDtoV8s;

	@JsonProperty("ITEM_BOM")
	public List<ExternalPOItemBomV8> externalPOItemBOMDtoV8s;

	@JsonProperty("ITEM_STAGES")
	public List<ExternalPOItemStagesV8> externalPOItemStagesDtoV8s;

	@JsonProperty("SHIPMENT_DETAILS")
	public List<ExternalPOItemShipmentV8> externalPOItemShipmentV8s;

	@JsonProperty("TAXES")
	public ExternalPOItemTaxV8 externalPOItemTaxV8;

	@JsonProperty("OTHER_CHARGES")
	public List<ExternalPOItemOtherChargesV8> externalPOItemOtherChargesV8s;

//---------------------------------------------------

}
