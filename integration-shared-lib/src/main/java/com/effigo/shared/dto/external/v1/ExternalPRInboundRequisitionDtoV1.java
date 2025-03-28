package com.effigo.shared.dto.external.v1;

import java.util.List;

import com.effigo.shared.dto.external.v4.ExternalPRInboundRequisitionDtoV4;
import com.effigo.shared.dto.external.v4.ExternalPRInboundRequisitionRequestV4;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPRInboundRequisitionDtoV1 {
	
	@JsonProperty("reqid")
	public String requisitionId;
	
	@JsonProperty("title")
	public String requisitionTitle;
	
	@JsonProperty("reqtype")
	public String requisitionType;
	
	@JsonProperty("priority")
	public String priority;
	
	@JsonProperty("deliveryadd")
	public String warehouseId;
	
	@JsonProperty("project")
	public String project;
	
	@JsonProperty("terms")
	public String terms;
	
	@JsonProperty("billingadd")
	public String billingAddress;
	
	@JsonProperty("currency")
	public String currency;
	
	@JsonProperty("orgcode")
	public String businessUnit;
	
	@JsonProperty("createdby")
	public String createdBy;
	
	@JsonProperty("createddate")
	public String createdDate;
	
	@JsonProperty("potype")
	public String poType;
	
	@JsonProperty("budgetcode")
	public String budgetCode;
	
	@JsonProperty("estimatedvalue")
	public String estimatedValue;
	
	@JsonProperty("approveddate")
	public String approvedDate;
	
	@JsonProperty("conversionrate")
	public String conversionRate;
	
	@JsonProperty("version")
	public String version;
	
	@JsonProperty("reqitems")
	public List<ExternalPRRequestItemsDtoV1> requisitionItem;
	
}
