package com.effigo.shared.dto.v1;

import com.effigo.shared.dto.external.v1.ServiceItemDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceSheetResponseDto {
	
	@JsonProperty("H_PERSON_INT")
	private String goodsReceivedBy;  
	
	@JsonProperty("H_PCKG_NO")
	private String packageNumber;
	
	@JsonProperty("H_SHORT_TEXT")
	private String shortText;
	
	@JsonProperty("H_PO_NUMBER")
	private String poId;
	
	@JsonProperty("H_PO_ITEM")
	private String poItemIndex;
	
	@JsonProperty("H_DOC_DATE")
	private String invoiceDate;
	
	@JsonProperty("H_POST_DATE")
	private String postingDate;
	
	@JsonProperty("H_REF_DOC_NO")
	private String dispatchNotificationId;
	
	@JsonProperty("H_USER_FIELD")
	private String comments;
	
	@JsonProperty("H_ACCEPTANCE")
	private String acceptance;
	
	@JsonProperty("H_EINVOICE")
	private String einvoice;


	@JsonProperty("SERVICE_ITEM")
	List<ServiceItemDto> serviceItemsDtos;
	
}
