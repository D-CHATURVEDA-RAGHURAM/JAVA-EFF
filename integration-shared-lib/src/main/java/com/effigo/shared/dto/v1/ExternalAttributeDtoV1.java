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
public class ExternalAttributeDtoV1 {
	
	@JsonProperty("serialnumber")
	public String attrId;
	
	@JsonProperty("atypename")
	public String attrName;
	
	@JsonProperty("attributetype")
	public String attrType;	
	
	@JsonProperty("AttributesDetails")
	public List<MasterAttributeValueDtoV1> masterAttributeValue;
}
