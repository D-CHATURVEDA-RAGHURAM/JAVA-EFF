package com.effigo.shared.dto.external.v1;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExternalPOItemDtoV1 {
    
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
}
