package com.effigo.shared.dto.external.v1;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExternalPODelivaryScheduleDtoV1 {
	
	@JsonProperty("poitmid")
    private String poItemId;
	
	@JsonProperty("requireddate")
    private String requiredDate;
	
	@JsonProperty("qty")
    private String qty;
	
	@JsonProperty("warehouse")
    private String warehouse;
	
	@JsonProperty("comments")
    private String comments;
}
