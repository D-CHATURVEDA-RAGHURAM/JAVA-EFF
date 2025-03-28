package com.effigo.shared.dto.external.v1;

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
public class ExternalMasterAttributeDtoV1 {
	
	@JsonProperty("id")
	public String attrId;
	
	@JsonProperty("code")
	public String code;
	
	@JsonProperty("erpid")
	public String erpId;
	
	@JsonProperty("name")
    public String attrName;
   
	@JsonProperty("type")
	public String attrType;
    
	@JsonProperty("status")
	public String status;
   
	@JsonProperty("createdby")
	public String createdBy;
    
	@JsonProperty("createdon")
	public String createdOn;
    
	@JsonProperty("values")
    public ArrayList<ExternalMasterAttributeValueDtoV1> masterAttributeValue;
}