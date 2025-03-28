package com.effigo.shared.dto.external.v1;

import java.math.BigDecimal;
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
public class ExternalItemAttributeDtoV1 {
	
	@JsonProperty("detserialnumber")
	public String erpId;
	
	@JsonProperty("atypecode")
	public BigDecimal attrId;
	
	@JsonProperty("mandatory")
	public String isRequired;
	
	
	@JsonProperty("attributes")
	public String itemAttrValues;
	
	
	
}
