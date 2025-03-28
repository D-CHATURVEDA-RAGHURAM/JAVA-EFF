package com.effigo.shared.dto.v1;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequisitionErpDto {

	@JsonProperty("ErrorLog")
	private String errorLog;

	@JsonProperty("Status")
	private boolean status;

	@JsonProperty("Data")
	private String data;

	@JsonProperty("reqId")
	private String reqId;

	@JsonProperty("erpid")
	private String erpId;

	private List<RequisitionItemErpDto> reqItems;

	public RequisitionErpDto(String errorLog, boolean status, String data, String reqId, String erpId, List<RequisitionItemErpDto> reqItems) {
		this.errorLog = errorLog;
		this.status = status;
		this.data = data;
		this.reqId = reqId;
		this.erpId = erpId;
		this.reqItems = reqItems;
	}

	@JsonProperty("transactionid")
	private String transactionId;

}