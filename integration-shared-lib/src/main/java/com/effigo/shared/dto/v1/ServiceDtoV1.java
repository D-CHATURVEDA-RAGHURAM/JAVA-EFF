package com.effigo.shared.dto.v1;

import java.sql.Timestamp;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceDtoV1 {
	
	@JsonProperty("goodsReceivedBy")
	private String goodsReceivedBy;  
	
	@JsonProperty("packageNumber")
	private String packageNumber;
	
	@JsonProperty("shortText")
	private String shortText;
	
	@JsonProperty("poId")
	private String poId;
	
	@JsonProperty("poItemIndex")
	private String poItemIndex;
	
	@JsonProperty("invoiceDate")
	private String invoiceDate;
	
	@JsonProperty("postingDate")
	private String postingDate;
	
	@JsonProperty("dispatchNotificationId")
	private String dispatchNotificationId;
	
	@JsonProperty("comments")
	private String comments;
	
	@JsonProperty("acceptance")
	private String acceptance;
	
	@JsonProperty("einvoice")
	private String einvoice;
	
	@JsonProperty("serviceItems")
	List<ServiceItemsDto> serviceItemsDtos;

}
