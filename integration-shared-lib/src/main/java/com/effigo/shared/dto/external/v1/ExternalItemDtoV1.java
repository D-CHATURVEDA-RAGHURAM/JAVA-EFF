package com.effigo.shared.dto.external.v1;

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
public class ExternalItemDtoV1 {
	
	@JsonProperty("serialnumber")
	public String itemId;
	
	@JsonProperty("parentcode")
	public String l3CategoryId;
	
	@JsonProperty("subimcode")
	public String itemCode;
	
	@JsonProperty("resname")
	public String itemName;
	
	@JsonProperty("stockuomcode")
	public String uom;
	
	@JsonProperty("hsnslno")
	public String hsnCode;
	
	@JsonProperty("PurchaseUOM")
	public List<ExternalUomDtoV1> masterItemUom;
	
	@JsonProperty("Attributes")
	public List<ExternalItemAttributeDtoV1> masterItemAttributeEntity;
}
