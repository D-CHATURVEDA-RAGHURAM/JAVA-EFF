package com.effigo.shared.dto.v1;

import java.util.List;

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
public class MasterItemAttributeDtoV1 {
	
	@JsonProperty("id")
	public String itemAttrId;
	
	@JsonProperty("status")
	public String status;
	
	@JsonProperty("values")
	public List<MasterItemAttributeValueDtoV1> masterItemAttributeValue;
}
