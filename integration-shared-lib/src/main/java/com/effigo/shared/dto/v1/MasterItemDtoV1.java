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
public class MasterItemDtoV1 {
	
	@JsonProperty("id")
	public String itemId;
	
	@JsonProperty("type")
	public String type;
	
	@JsonProperty("categoryid")
	public String itemCategoryId;
	
	@JsonProperty("code")
	public String itemCode;
	
	@JsonProperty("name")
	public String itemName;
	
	@JsonProperty("status")
	public int status;
	
	@JsonProperty("createdby")
	public String createdBy;
	
	@JsonProperty("createddate")
	public String created_date;
	
	
	@JsonProperty("glcode")
	public String glCode;
	
	@JsonProperty("hsncode")
	public String hsnCode;
	
	@JsonProperty("quality")
	public int quality;
	
	@JsonProperty("attributes")
	public List<MasterItemAttributeDtoV1> masterItemAttributeEntity;
	
	@JsonProperty("uom")
	public List<MasterItemUomDtoV1> masterItemUom;
}
