package com.effigo.shared.dto.v2;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import com.effigo.shared.dto.v1.PRInboundRequestItemsDtoV1;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
public class PRInboundRequisitionDtoV2 {
	@JsonProperty("BANFN")
	@NotEmpty(message = "300000")
	@Size(max = 50, message = "300001")
	public String requisitionId;
	
	@JsonProperty("TXZ01")
	@NotEmpty(message = "300004")
	@Size(max = 500, message = "300001")
	public String requisitionTitle;
	
	@JsonProperty("BSART")
	@NotEmpty(message = "300005")
	@Size(max = 50, message = "300001")
	public String requisitionType;
	
	@JsonProperty("priority")
	public String priority;
	
	@JsonProperty("deliveryadd")
	@NotEmpty(message = "300007")
	@Size(max = 2000, message = "300001")
	public String warehouseId;
	
	@JsonProperty("project")
	public String project;
	
	@JsonProperty("terms")
	public String terms;
	
	@JsonProperty("billingadd")
	@NotEmpty(message = "300009")
	@Size(max = 2000, message = "300001")
	public String billingAddress;
	
	@JsonProperty("currency")
	@NotEmpty(message = "300011")
	@Size(max = 50, message = "300001")
	public String currency;
	
	@JsonProperty("WERKS")
	@NotEmpty(message = "300013")
	@Size(max = 50, message = "300001")
	public String businessUnit;
	
	@NotEmpty(message = "300015")
	@Size(max = 50, message = "300001")
	@JsonProperty("ERNAM")
	public String createdBy;
	
	@NotEmpty(message = "300017")
	@JsonProperty("BADAT")
	public String createdDate;
	
	@NotEmpty(message = "300019")
	@Size(max = 50, message = "300001")
	@JsonProperty("potype")
	public String poType;
	
	@JsonProperty("budgetcode")
	public String budgetCode;
	
	@NotEmpty(message = "300021")
	@Size(max = 50, message = "300001")
	@PositiveOrZero(message = "300022")
	@JsonProperty("estimatedvalue")
	public String estimatedValue;
	
	//check
	@JsonProperty("status")
	public int status;
	
	@NotEmpty(message = "300023")
	@JsonProperty("approveddate")
	public String approvedDate;
	
	//check
	@JsonProperty("directrequisition")
	public String directRequisition;
	
	@JsonProperty("companycode")
	public String companyCode;
	
	@JsonProperty("costcenterper")
	public String costCenterPer;
	
	@JsonProperty("lastupdatedate")
	public String lastUpdateDate;
	
	//////////////////////////////
	
	@JsonProperty("version")
	public String version;
	
	@NotEmpty(message = "300025")
	@JsonProperty("conversionrate")
	public String conversionRate;
	
	@JsonProperty("sourcingtype")
	public String sourcingType;
	
	@JsonProperty("amendstatus")
	public String quantityAmendStatus;
	
	@JsonProperty("reqitems")
	public List<PRInboundRequestItemsDtoV2> requisitionItem;
	
	
}

