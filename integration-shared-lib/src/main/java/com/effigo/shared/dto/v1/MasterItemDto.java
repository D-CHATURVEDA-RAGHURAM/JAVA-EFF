package com.effigo.shared.dto.v1;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@JsonIgnoreProperties(ignoreUnknown = true)
public class MasterItemDto {
	
	@JsonProperty("id")
	public String itemId;
	
	@JsonProperty("type")
	public String type;
	@JsonProperty("categoryid")
	public String categoryId;

	public String l3CategoryId;
	
	@JsonProperty("code")
	public String itemCode;
	
	@JsonProperty("name")
	public String itemName;
	
	@JsonProperty("status")
	public int status;
	
	public String createdBy;
	
	public String createdDate;
	
	@JsonProperty("glcode")
	public String glCode;
	
	@JsonProperty("hsnslno")
	public String hsnCode;
	
	@JsonProperty("quality")
	public int quality;

	@JsonProperty("description")
	private String description;

	@JsonProperty("qualityassurance")
	private boolean qualityAssurance;

	@JsonProperty("uom")
	public String uom;
	
	@JsonProperty("Attributes")
	public List<MasterItemAttributeDto> masterItemAttributeEntity;
	
	@JsonProperty("PurchaseUOM")
	public List<MasterItemUomDto> masterItemUom;

	@JsonProperty("cusField1")
	private String cusField1;

	@JsonProperty("cusField2")
	private String cusField2;

	@JsonProperty("cusField3")
	private String cusField3;

	@JsonProperty("cusField4")
	private String cusField4;

	@JsonProperty("cusField5")
	private String cusField5;

	@JsonProperty("cusField6")
	private String cusField6;

	@JsonProperty("cusField7")
	private String cusField7;

	@JsonProperty("cusField8")
	private String cusField8;

	@JsonProperty("cusField9")
	private String cusField9;

	@JsonProperty("cusField10")
	private String cusField10;
	@JsonProperty("cusField11")
	private String cusField11;
	@JsonProperty("cusField12")
	private String cusField12;
}
