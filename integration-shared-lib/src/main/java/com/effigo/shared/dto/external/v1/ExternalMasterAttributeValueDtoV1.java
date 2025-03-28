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
public class ExternalMasterAttributeValueDtoV1 {
	
	@JsonProperty("id")
	public String attrValId;
	
	@JsonProperty("erpid")
	public String erpId;
	
	@JsonProperty("value")
    public String value;
	
	@JsonProperty("status")
    public String status;
}
