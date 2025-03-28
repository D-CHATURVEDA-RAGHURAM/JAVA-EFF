package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PoPriceTemplateStructureDtoV1 {
	
	@JsonProperty("poitmid")
    public String poItmId;
	
	@JsonProperty("taxcode")
    public String taxCode;
	
	@JsonProperty("comptype")
    public String compType;
	
	@JsonProperty("calcon")
    public String calcon;
	
	@JsonProperty("price")
    public String price;
	
	@JsonProperty("index")
    public String index;

}
