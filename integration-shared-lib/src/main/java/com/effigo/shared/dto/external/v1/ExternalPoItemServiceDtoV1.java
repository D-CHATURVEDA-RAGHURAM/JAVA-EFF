package com.effigo.shared.dto.external.v1;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExternalPoItemServiceDtoV1 {
	
	@JsonProperty("poitmserviceid")
    public String poItmServiceId;
	
	@JsonProperty("poitmid")
    public String poItmId;
	
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
	
	@JsonProperty("itempriceper")
    public String itemPricePer;
	
	@JsonProperty("sourcingitemid")
    public String sourcingItemId;
}
