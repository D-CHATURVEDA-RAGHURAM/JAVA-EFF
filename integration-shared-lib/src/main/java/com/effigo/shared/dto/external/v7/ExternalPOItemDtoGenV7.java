package com.effigo.shared.dto.external.v7;

import com.effigo.shared.dto.external.v8.ExternalPOItemBomV8;
import com.effigo.shared.dto.external.v8.ExternalPOItemStagesV8;
import com.effigo.shared.dto.external.v8.ExternalPoItemServiceDtoV8;
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
public class ExternalPOItemDtoGenV7 {
    
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
	
	@JsonProperty("itemQty")
    public String itemQty;

	@JsonProperty("openQty")
	public String openQty;

	@JsonProperty("usedQty")
	private String usedQty;

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
	public Integer deliveryCompletionStatus;

	@JsonProperty("distributionNumber")
	public String distributionNumber;

	@JsonProperty("latestGrDate")
	public String latestGrDate;

	@JsonProperty("serviceHeaderStatus")
	private Integer serviceHeaderStatus;


	@JsonProperty("customField1")
	public String customField1;
	@JsonProperty("customField2")
	public String customField2;
	@JsonProperty("customField3")
	public String customField3;
	@JsonProperty("customField4")
	public String customField4;

	@JsonProperty("SERVICE_ITEMS")
	public List<ExternalPoItemServiceDtoGenV7> poItemServiceDtoV7s;


//---------------------------------------------------

}
