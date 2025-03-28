package com.effigo.shared.dto.external.v1;

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
public class ExternalAttributeValueDtoV1 {
	
	@JsonProperty("detserialnumber")
	public String erpId;
	
	@JsonProperty("attrname")
    public String value;
	
}
