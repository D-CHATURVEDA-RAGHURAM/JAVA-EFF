package com.effigo.shared.dto.v1;

import java.util.ArrayList;

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
public class MasterAttributeDtoV1 {
	
	@JsonProperty("id")
	public String attrId;
	
	@JsonProperty("name")
    public String attrName;
	
	@JsonProperty("type")
	public String attrType;
	
	@JsonProperty("code")
	public String code;
	
	@JsonProperty("status")
	public String status;
   
	@JsonProperty("createdby")
	public String createdBy;
    
	@JsonProperty("createdon")
	public String createdOn;
    
	@JsonProperty("values")
    public ArrayList<MasterAttributeValueDtoV1> masterAttributeValue;
}