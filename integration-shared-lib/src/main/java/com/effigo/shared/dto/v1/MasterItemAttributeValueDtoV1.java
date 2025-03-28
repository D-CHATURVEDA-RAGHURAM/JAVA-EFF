package com.effigo.shared.dto.v1;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MasterItemAttributeValueDtoV1 {
	
	@JsonProperty("id")
	public String itemAttrValue;
	
	@JsonProperty("value")
    public String value;
	
	@JsonProperty("status")
    public int status;
}
