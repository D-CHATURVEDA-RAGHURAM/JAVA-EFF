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
public class RequisitionDtoV1 {

	public String reqid;
	public String title;
	public String warehouse;
	public String project;
	public String terms;
	public String billingadd;
	public String reqtype;
	public String currency;
	public String orgcode;
	public String createdby;
	public String createddate;
	public String potype;
	public String sourcingtype;
	public String netamount;
	public String status;
	public String amendno;
	public String amenddate;
	public String originalprno;
	public String erpid;
	public List<RequisitionItemDtoV1> reqitems;
	public List<ItemDeliveryScheduleDtoV1> schedule;
	public List<RequisitionAttributeDtoV1> attributes;

}
