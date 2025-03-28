package com.effigo.shared.dto.v2;

import com.effigo.shared.dto.v1.ServiceItemsDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceDtoV2 {
	
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

	@JsonProperty("text1")
	private String  text1;

	@JsonProperty("text2")
	private String  text2;

	@JsonProperty("text3")
	private String  text3;

	@JsonProperty("text4")
	private String  text4;

	@JsonProperty("text5")
	private String  text5;

	@JsonProperty("text6")
	private String  text6;

	@JsonProperty("grnId")
	private String  grnId;
	
	@JsonProperty("serviceItems")
	List<ServiceItemsDtoV2> serviceItemsDtos;

}
