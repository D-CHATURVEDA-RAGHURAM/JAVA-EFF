package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class POItemDtoV1 {
    
	@JsonProperty("poitmid")
    public String poItmId;
	
	@JsonProperty("reqitemid")
    public String reqItemId;
	
	@JsonProperty("itemcode")
    public String itemCode;
	
	@JsonProperty("description")
    public String description;
	
	@JsonProperty("qty")
    public String qty;
	
	@JsonProperty("uom")
    public String uom;
	
	@JsonProperty("price")
    public String price;
	
	@JsonProperty("costcenter")
    public String costCenter;
	
	@JsonProperty("itempriceper")
    public String itemPricePer;
	
	////////////////////////////////////
	
	@JsonProperty("sourcingreqid")
    public String sourcingReqId;
	
	@JsonProperty("text1")
    public String text1;
	
	@JsonProperty("text2")
    public String text2;
	
	@JsonProperty("text3")
    public String text3;
	
	@JsonProperty("itemtext")
    public String itemText;
	
	@JsonProperty("iteminfo")
    public String itemInfo;
	
	@JsonProperty("materialtext")
    public String materialText;
	
	@JsonProperty("deliverytext")
    public String deliveryText;
	
	@JsonProperty("predispatch")
    public String predisPatch;
	
	@JsonProperty("inbound")
    public String inbound;
	
	@JsonProperty("batch")
    public String batch;
	
}
